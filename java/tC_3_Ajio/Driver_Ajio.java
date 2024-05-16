package tC_3_Ajio;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver_Ajio {
	
	WebDriver driver;
	@BeforeClass
	public void browsersetup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		String actURL = "https://www.shoppre.com/ajio-online-shopping";
		driver.get("https://www.shoppre.com/ajio-online-shopping");
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


