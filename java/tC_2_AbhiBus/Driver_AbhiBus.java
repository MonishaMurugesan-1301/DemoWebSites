package tC_2_AbhiBus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Driver_AbhiBus {
	
	WebDriver driver;
	
	@BeforeClass
	public void browsersetup() {
		
//		driver = new ChromeDriver();
//		
//		driver.get("https://www.abhibus.com/bus-ticket-booking");
//		driver.manage().window().maximize();
		
		driver = new ChromeDriver();
		String actURL = "https://www.abhibus.com/bus-ticket-booking";
		driver.get("https://www.abhibus.com/bus-ticket-booking");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		String expURL = driver.getCurrentUrl();
		Assert.assertEquals(actURL, expURL);
		System.out.println("Validation Succssful");
		
	}
	
	@AfterClass
	public void closebrowser() {
		if(driver!=null) {
			driver.quit();
		}
	}

}
