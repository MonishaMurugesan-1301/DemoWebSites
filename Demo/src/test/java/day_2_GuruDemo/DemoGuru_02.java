package day_2_GuruDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoGuru_02 {
	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\monimuru\\Downloads\\ChPath\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/V4/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//login demo
		WebElement sel= driver.findElement(By.xpath("//div[@id='navbar-brand-centered']/ul/li[1]/a"));
		sel.click();
		
		WebElement login = driver.findElement(By.xpath("(//ul[@class='dropdown-menu'])[1]/child::li[11]/a"));
		login.click();
		
		WebElement mail = driver.findElement(By.id("email"));
		mail.sendKeys("mmonisha5577@gmail.com");
		
		WebElement password = driver.findElement(By.id("passwd"));
		password.sendKeys("12345678");
		
		WebElement signin = driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
		signin.click();
		
		//product purchase demo
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement giventext = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='error-copy']/h3")));

		String productName = giventext.getText();
		System.out.println("Text shown:" + productName);
		Thread.sleep(2000);
		
		WebElement title= driver.findElement(By.xpath("//div[@id='navbar-brand-centered']/ul/li[7]/a"));
		title.click();
		
		WebElement qnty= driver.findElement(By.xpath("//select[@name='quantity']/option[5]"));
		qnty.click();
		
		WebElement buy= driver.findElement(By.xpath("//input[@value='Buy Now']"));
		buy.click();
		
		//payment demo
		WebElement payment = driver.findElement(By.xpath("(//div[@class='row'])[2]/child::div"));
		String text = payment.getText();
		System.out.println("Text shown:" + text);
		
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement cardnum = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='card_nmuber']")));
		cardnum.sendKeys("1234567890123456");
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']/option[8]"));
		month.click();
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']/option[7]"));
		year.click();
		
		WebElement cvv = driver.findElement(By.xpath("//input[@id='cvv_code']"));
		cvv.click();
		
		WebElement submitbtn = driver.findElement(By.xpath("//input[@name='submit']"));
		submitbtn.click();
		
		WebElement success = driver.findElement(By.xpath("//div[@class='table-wrapper']/h2"));
		String text2 = success.getText();
		System.out.println("Text shown:" + text2);
		
		// Close the browser
	    driver.quit();
}
}
