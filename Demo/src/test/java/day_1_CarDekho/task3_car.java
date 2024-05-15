package day_1_CarDekho;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class task3_car {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\monimuru\\Downloads\\ChPath\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		
		//To handle notifications
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--disable-geolocation");
		
		driver = new ChromeDriver(options);

		String actURL = "https://www.cardekho.com";
		driver.get("https://www.cardekho.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		// Click on "buy@sell used cars"
		WebElement BuySell = driver.findElement(By.xpath("//a[@title='Buy & Sell Used cars']"));
		BuySell.click();
		Thread.sleep(2000);

		WebElement buyUsedcar = driver.findElement(By.xpath("//a[@title='Buy Used Cars']"));
		buyUsedcar.click();
		Thread.sleep(2000);
	
		WebElement Car = driver.findElement(By.xpath("//div[@class='gsc_container']/h1"));
		String BuyCar = Car.getText();
		System.out.println("Text shown:" + BuyCar);
		
		//close browser
		driver.quit();

	}
}
