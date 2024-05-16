package wP_6_Nestaway;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReferEarn extends Baseclass_Nestaway {

	WebDriver driver;

	public ReferEarn(WebDriver driver) {
		this.driver = driver;
	}

	By menupath = By.xpath("//p[@class='w-8']");
	By repath = By.xpath("//div[@class='mb-4 ']/ul/li[4]/a");
	By btn1 = By.xpath("//div[@class='flex gap-2 py-8']/button[1]");
	By namepath = By.xpath("//input[@placeholder='Your full name*']");
	By numberpath = By.xpath("//input[@placeholder='Your mobile number*']");
	By name2path = By.xpath("//input[@placeholder='Insert Your Friend Name ( Optional )']");
	By number2path = By.xpath("//input[@placeholder='Insert Your Friend’s phone number']");
	By locpath = By.xpath("//input[@placeholder='Search Locality ']");
	By invitpath = By.xpath("//div[@class='flex undefined']/button");
	
	public void refer() {

		WebElement menu = driver.findElement(menupath);
		ClickMethod(menu);
		
		WebElement ref = driver.findElement(repath);
		ClickMethod(ref);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		
		WebElement button = driver.findElement(btn1);
		ClickMethod(button);
		
		//Scrolldown("0, 300");
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 300)");
	}
	
	    public void invitefrnds(String name, String phnum, String frndname, String frndphnum, String location) throws InterruptedException, IOException { 		
		WebElement entername = driver.findElement(namepath);
		SendkeysMethod(entername, name);
		
		WebElement enternumber = driver.findElement(numberpath);
     	SendkeysMethod(enternumber, phnum);
		
		WebElement entername2 = driver.findElement(name2path);
		SendkeysMethod(entername2, frndname);
		
     	WebElement enternumber2 = driver.findElement(number2path);
    	SendkeysMethod(enternumber2, frndphnum);
    	
    	((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 200)");
		
		WebElement enterloc = driver.findElement(locpath);
		SendkeysMethod(enterloc, location);
		
//		WebElement invitation = driver.findElement(invitpath);
//		ClickMethod(invitation);
	
//		public void invitefrnds() throws InterruptedException, IOException {
//			
//		WebElement entername = driver.findElement(namepath);
//		SendkeysMethod(entername, "abcdef");
//		
//		WebElement enternumber = driver.findElement(numberpath);
//		SendkeysMethod(enternumber, "9876556789");
//		
//		WebElement entername2 = driver.findElement(name2path);
//		SendkeysMethod(entername2, "zxcvbn");
//		
//		WebElement enternumber2 = driver.findElement(number2path);
//		SendkeysMethod(enternumber2, "9876543213");
//		
//		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 200)");
//		
//		WebElement enterloc = driver.findElement(locpath);
//		SendkeysMethod(enterloc, "Bengaluru");
		enterloc.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		enterloc.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		
		WebElement invitation = driver.findElement(invitpath);
		ClickMethod(invitation);
		Thread.sleep(2000);
		
		TakesScreenshot ts=(TakesScreenshot)driver;
        File file=ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("C:\\Users\\monimuru\\eclipse-workspace\\Task_TestNG\\Screenshot_congrats" + ".jpg"));
        
	    
		System.out.println("congratulations, you got a referral"); 
		
		
		
	}

}
