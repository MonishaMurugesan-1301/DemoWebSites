package smpl;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
//		options.addArguments("--disable-geolocation");
		WebDriver driver = new ChromeDriver(options);
//		WebDriverManager.chromedriver().setup();

		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();

		WebElement sourceInput = driver.findElement(By.xpath("//input[@id='src']"));
		sourceInput.sendKeys("Bangalore");
		
		sourceInput.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		sourceInput.sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		WebElement destinationInput = driver.findElement(By.id("dest"));
		destinationInput.sendKeys("Chennai");
		
		destinationInput.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		destinationInput.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		WebElement dateInput = driver.findElement(By.xpath("//div[@class='labelCalendarContainer']/i"));
		dateInput.click();
		Thread.sleep(2000);
		
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 200)");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));      
	    WebElement date = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='onwardCal']/div/div[2]/div/div/div[3]/div[6]/span/div[4]/span")));
	   
//		WebElement date = driver.findElement(By.xpath("//div[@id='onwardCal']/div/div[2]/div/div/div[3]/div[6]/span/div[4]/span"));
		date.click();
		Thread.sleep(2000);

		// Click on search button
		WebElement searchButton = driver.findElement(By.xpath("//button[@id='search_button']"));
		searchButton.click();
		Thread.sleep(2000);
		
//		driver.findElement(By.xpath("//div[@class='close-primo']/i"));
//		Thread.sleep(2000);
		
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 1000)");
		
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));      
	    WebElement bus = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@id='19784739']/div/div[1]/div[1]/div[1]/div[1]")));
	   
//		WebElement bus = driver.findElement(By.xpath("//li[@id='19784739']/div/div[1]/div[1]/div[1]/div[1]"));
		String text = bus.getText();
		System.out.println("selected bus : " +text );
		
		WebElement seat = driver.findElement(By.xpath("//li[@id='19784739']/div/div[2]/div[1]"));
		seat.click();
		
		
		

	}

}
