package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Driver {
	 WebDriver driver;
	
	 // Method to set up the WebDriver and open the browser before test execution
	@BeforeClass
	public void browsersetup() {
	    // Initialize ChromeDriver
	    driver = new ChromeDriver();
	    
	    // Open the website URL & maximize window
	    driver.get("https://talent.capgemini.com/in");
	    driver.manage().window().maximize();
	}

//		@BeforeClass
//		public void browsersetup() {
//			System.setProperty("webdriver.chrome.driver","C:\\Users\\monimuru\\Downloads\\ChPath\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
//		driver = new ChromeDriver();
//	
//		driver.get("https://talent.capgemini.com/in");
//		driver.manage().window().maximize();
		
	// Method to close the browser after all the tests in the class have executed
		@AfterClass
		public void closebrowser() {
			if (driver!=null) { // Check if the WebDriver instance is not null
				driver.quit(); // Quit the WebDriver, closing all associated browser windows
			}
		}
}
