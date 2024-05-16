package Tollge_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ExtentManager;

public class Tollge_Driver {	
	    
	    WebDriver driver;
	    public static ExtentReports report = ExtentManager.getInstance();
		public static ExtentTest test;

	    
	    // Method to set up the browser before running tests
	    @BeforeClass
	    public void browsersetup() {
	    	 // Configure Chrome options
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--disable-notifications"); // Disable notifications        
	        
	        WebDriverManager.chromedriver().setup();
	        
	        driver = new ChromeDriver(options); // Initialize ChromeDriver instance
	        
	       
	        String actURL = "https://test.salesforce.com/";
	        driver.get("https://test.salesforce.com/");
	        driver.manage().window().maximize();	 // Maximize the window
	        driver.manage().deleteAllCookies(); 	 // Delete all cookies
	        
	        // Validate if the actual URL matches the expected URL
	        String expURL = driver.getCurrentUrl();
	        Assert.assertEquals(actURL, expURL); // Assert URL equality
	        System.out.println("Validation Successful"); // Print validation success message
	    }
	    
	    
	    // Method to close the browser after tests execution
	    @AfterClass
	    public void closebrowser() {
	        // Quit the browser if the WebDriver instance is not null
	        if(driver!=null) {
	            driver.quit(); // Quit the browser
	        }
	    }
	}

