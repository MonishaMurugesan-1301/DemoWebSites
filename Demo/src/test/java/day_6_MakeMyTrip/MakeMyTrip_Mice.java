package day_6_MakeMyTrip;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MakeMyTrip_Mice {

	public static void main(String[] args) throws InterruptedException {
		
		//initializing webDriver
		WebDriver driver;
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\monimuru\\Downloads\\ChPath\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

	        driver = new ChromeDriver();
	        driver.get("https://www.makemytrip.com");
            driver.manage().window().maximize();
	        
	        driver.manage().deleteAllCookies();
	       
	       //login to website
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));		
			WebElement login = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[text()='Login or Create Account']")));
			login.click();       
	        Thread.sleep(3000);
	        
	     // Clicking on the "MyBiz Account" link
	        driver.findElement(By.xpath("//li[text()='MyBiz Account']")).click();
	        Thread.sleep(2000);
	        
	     // Entering email and password for login
	        driver.findElement(By.xpath("//input[@placeholder='Enter your work email id']")).sendKeys("monisha.murugesan@capgemini.com");	     
		    driver.findElement(By.xpath("//div[@class='makeFlex spaceBetween appendBottom10']/child::span")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//input[@placeholder='Enter a password']")).sendKeys("Monish@555");
		    driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
		    Thread.sleep(2000);
		    
		    // Clicking on the "MICE" menu
		    driver.findElement(By.xpath("//li[@class='menu_Mice']")).click();
		    
		    // Getting the URL of the new page
		    String newPageUrl = driver.getCurrentUrl();
			System.out.println("New Page URL: " + newPageUrl);
			
			 // Switching to the new window
		    String Parent_w = driver.getWindowHandle();
			  Set <String> set = driver.getWindowHandles();
			  Iterator <String> I = set.iterator();
			  while(I.hasNext()){
				  String Child_w = I.next();
				  if(!(Parent_w.equals(Child_w))) {
					  driver.switchTo().window(Child_w);
				  }
			  }
			  Thread.sleep(2000);
			 
			  // Scrolling down the page
			  ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 400)");
			  
//			// Clicking on the "International" option
		    driver.findElement(By.xpath("//span[text()='International']")).click();
		    Thread.sleep(2000);
		    //clicking Explore button
		    driver.findElement(By.xpath("//button[text()='EXPLORE']")).click();
		    Thread.sleep(2000);
		    
		    // Selecting "Switzerland"
		    driver.findElement(By.xpath("//li[text()='Switzerland']")).click();
		    Thread.sleep(2000);
		    
		    // Scrolling down further
		    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 1000)");
		    
		 // Getting the hotel name
		    String Hotel = driver.findElement(By.xpath("(//div[@class='sc-zsuy1o-3 gliCqy'])[4]/p/span")).getText();
	        System.out.println("Hotel Name : " + Hotel);
			 
	     // Clicking on the booking button
	        driver.findElement(By.xpath("(//div[@class='sc-zsuy1o-3 sc-zsuy1o-7 dtWJzE'])[4]/button")).click();
	        
	     // Filling out the booking form
	        driver.findElement(By.xpath("//input[@placeholder='Enter your Name']")).sendKeys("Monisha M");
	        driver.findElement(By.xpath("//input[@placeholder='Enter your Email Id']")).sendKeys("mmonisha5577@gmail.com");
	        driver.findElement(By.xpath("//input[@placeholder='Enter 10 digit Mobile No']")).sendKeys("8344598576");
	        driver.findElement(By.xpath("//div[@id='react-select-3-placeholder']")).click();
	        driver.findElement(By.xpath("//div[text()='March 2024']")).click();	        
	        driver.findElement(By.xpath("//div[@id='react-select-4-placeholder']")).click();	        
	        driver.findElement(By.xpath("//div[text()='10 - 50']")).click();
	        Thread.sleep(3000);
	        
	        //clik on submit
	        driver.findElement(By.xpath("//button[@type='submit']")).click();
	        Thread.sleep(3000);
	        
	        //click on ok button
	        driver.findElement(By.xpath("//div[@class='sc-1uem2x8-11 hEksVi content custom-scroll']/p")).click();
	        
	        //quitting the browser
	        driver.quit();
	     
	}

}
