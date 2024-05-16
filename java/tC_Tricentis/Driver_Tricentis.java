package tC_Tricentis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ExtentManager;

public class Driver_Tricentis {

	WebDriver driver;

//	    public static ExcelReader excel = new ExcelReader("C:\\Users\\monimuru\\eclipse-workspace\\Task_TestNG\\src\\test\\resources\\Excel\\input.xlsx");

	public static ExtentReports report = ExtentManager.getInstance();
	public static ExtentTest test;

	// Method to set up the browser before running tests
	@BeforeClass
	public void browsersetup() {

		// Setup ChromeDriver using WebDriverManager
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); // Initialize ChromeDriver instance

		// Open the NoBroker website
		String actURL = "https://demowebshop.tricentis.com/";
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize(); // Maximize the window
		driver.manage().deleteAllCookies(); // Delete all cookies

		// Validate if the actual URL matches the expected URL
		String expURL = driver.getCurrentUrl();
		Assert.assertEquals(actURL, expURL); // Assert URL equality
		System.out.println("Validation Successful"); // Print validation success message
	}

	// Method to close the browser after tests execution
	@AfterClass
	public void closebrowser() {
		// Quit the browser if the WebDriver instance is not null
		if (driver != null) {
			driver.quit(); // Quit the browser
		}
	}

}
