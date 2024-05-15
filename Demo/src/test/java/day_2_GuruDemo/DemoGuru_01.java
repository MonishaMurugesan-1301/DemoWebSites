package day_2_GuruDemo;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoGuru_01 {
	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\monimuru\\Downloads\\ChPath\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/V4/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//click on logo
		WebElement logo = driver.findElement(By.className("logo"));
		logo.click();
		Thread.sleep(2000);
		
		//get the new url
		String newPageUrl = driver.getCurrentUrl();
		System.out.println("New Page URL: " + newPageUrl);
		
		//get the text shown
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	    WebElement giventext = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='g-content g-particle']/h4")));

	    String productName = giventext.getText();
	    // Print the product name
	    System.out.println("Text shown:" + productName);
	    
	    WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
	    WebElement search1 = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='search']")));

	    search1.sendKeys("selenium tutorial");
	    
	    Actions actions = new Actions(driver);
	    // Send Enter key
        actions.sendKeys(Keys.ENTER).perform();
        Thread.sleep(2000);
	    
        System.out.println("selenium courses are shown");
        
        WebElement st = driver.findElement(By.xpath("(//a[@class='gs-title']/b)[1]"));
		st.click();
		
		String newPageUrl2 = driver.getCurrentUrl();
		System.out.println("Syllabus Page URL: " + newPageUrl2);
  
		//navigation demo
        driver.navigate().back();
        System.out.println("navigate back to homepage");
        Thread.sleep(4000);
        
        Actions actions1 = new Actions(driver);
        WebElement elementLocator = driver.findElement(By.id("ID"));
        actions1.contextClick(elementLocator).perform();
       
        // Close the browser
	    driver.quit();

}
}
