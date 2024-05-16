package Tollge_webpage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Tollge_login extends Baseclass{
	
	WebDriver driver;

	public Tollge_login(WebDriver driver) {
		this.driver = driver;
	}
	
	By usName = By.xpath("//input[@id='username']");
	By pwsd = By.id("password");
	By loginbtn = By.xpath("//input[@id='Login']");
	By drpdnpath = By.xpath("//button[@title='Show Navigation Menu']");
	By enqpath = By.xpath("//div[@id='navMenuList']/div/child::ul/li[8]");
	By testenqPath = By.xpath("//button[@title='Select a List View: Enquiries']");
	By tdystest = By.xpath("//div[@class='listContent']/div[1]/div/child::ul/li[6]");
	By searchpath = By.xpath("//input[@name='Case-search-input']");
	By resultpage = By.xpath("//span[@class='countSortedByFilteredBy']");
	
	public void login() {
		
		WebElement userfld = driver.findElement(usName);
		SendkeysMethod(userfld, "bala.subbarayudu@teamglobalexp.com.tollperf");
		
		WebElement pswdfld = driver.findElement(pwsd);
		SendkeysMethod(pswdfld, "Tge@12345");
		
		WebElement submitbtn = driver.findElement(loginbtn);
		ClickMethod(submitbtn);
		
	}
	
	public void enquiry() {
		String newPageUrl = driver.getCurrentUrl();
		System.out.println("New Page URL: " + newPageUrl);
	
		WebElement dropdown = driver.findElement(drpdnpath);
		ClickMethod(dropdown);
		
		waits(driver, Duration.ofSeconds(20), enqpath);
		WebElement enqbtn = driver.findElement(enqpath);
		ClickMethod(enqbtn);

		waits(driver, Duration.ofSeconds(20), testenqPath);
		WebElement testenq = driver.findElement(testenqPath);
		ClickMethod(testenq);
		
		waits(driver, Duration.ofSeconds(20), tdystest);
		WebElement testtdyenq = driver.findElement(tdystest);
		ClickMethod(testtdyenq);
		
	}
	
	public void search() throws InterruptedException, IOException  {
		WebElement searchbtn = driver.findElement(searchpath);
		ClickMethod(searchbtn);
		Thread.sleep(2000);
		SendkeysMethod(searchbtn, "closed");
		Thread.sleep(3000);
		searchbtn.sendKeys(Keys.ENTER);
		Thread.sleep(5000);

		TakesScreenshot ts=(TakesScreenshot)driver;
        File file=ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("C:\\Users\\monimuru\\eclipse-workspace\\Task_TestNG\\Screenshot" + ".jpg"));
        
	    
		System.out.println("closed items are sorted"); 
		
		WebElement totitems = driver.findElement(resultpage);
		String text = getTextMethod(totitems);
		System.out.println(text);
		
		
	}

	
}
