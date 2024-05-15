package day_5_STHelp;

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

public class SThelp_Scenario_Data {

	public static void main(String[] args) throws InterruptedException {
		
		 // Initialize WebDriver
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\monimuru\\Downloads\\ChPath\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("https://www.softwaretestinghelp.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.manage().deleteAllCookies();
        Thread.sleep(2000);
        //close the ad
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(50));		
	    WebElement close = wait1.until(ExpectedConditions.elementToBeClickable((By.xpath("//div[@class='cb-close']"))));
	    close.click();
        
        //click on data
        WebElement data = driver.findElement(By.xpath("//li[@id='mega-menu-item-164968']/a/span"));
        data.click();
        Thread.sleep(3000);
        WebElement bigdata = driver.findElement(By.xpath("//li[@id='mega-menu-item-164953']"));
        bigdata.click();
        Thread.sleep(3000);
        
        //get the current url
        String currentUrl = driver.getCurrentUrl();
		System.out.println("New Page URL: " + currentUrl);
		
		 // Validate the current URL
        if (currentUrl.equals("https://www.softwaretestinghelp.com/big-data-tutorial/")) {
            System.out.println("Validation successful: BigData tutorial is accessible");
        } else {
            System.out.println("Validation failed:Current URL is incorrect.");
        }
      
      
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
	    WebElement giventext = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='inside-article']/header/h1")));

	    String productName = giventext.getText();
	    // Print the heading
	    System.out.println("Text shown:" + productName);
	    
	    
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement link = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='entry-content']/p[39]/strong/a")));
        String linkName = link.getText();
       
        link.click();
        // After clicking the link, it might cause a page reload, so re-locate the element
        link = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//article[@id=\"post-250692\"]/div/header/h1")));
        linkName = link.getText();
        System.out.println("Link clicked: " + linkName);
        
        WebDriverWait waitX = new WebDriverWait(driver, Duration.ofSeconds(20));
	    WebElement linkX = waitX.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//article[@id=\"post-250692\"]/div/header/h1")));

	    String linkXName = linkX.getText();
	    // Print the heading
	    System.out.println("Title:" + linkXName);
        Thread.sleep(4000);
            
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 7000)");
        
        WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(50));
        WebElement link2 = wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//article[@id='post-250692']/div/div[2]/ul[2]/li[6]/a")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", link2);
        link2.click();
       // link2 = wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//article[@id='post-250692']/div/div[2]/ul[2]/li[6]/a")));

       String linkName1 = link2.getText(); // Use linkName2 instead of title
        // Print the heading
        System.out.println("To click link2:" + linkName1);
        Thread.sleep(4000);
        
        String Parent_w = driver.getWindowHandle();
  	  Set <String> set = driver.getWindowHandles();
  	  Iterator <String> I = set.iterator();
  	  while(I.hasNext()){
  		  String Child_w = I.next();
  		  if(!(Parent_w.equals(Child_w))) {
  			  driver.switchTo().window(Child_w);
  		  }
  	  }
  	((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 15000)");
  	
        WebDriverWait waitA = new WebDriverWait(driver, Duration.ofSeconds(50));
 	    WebElement link3 = waitA.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//article[@id=\"post-235371\"]/div/div[2]/div[6]/strong/a")));
 	    link3.click();
 	    
 	   WebDriverWait waity = new WebDriverWait(driver, Duration.ofSeconds(20));
	    WebElement linky = waity.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//article[@id=\"post-235371\"]/div/div[2]/div[6]/strong/a")));

	    String linkyName = linky.getText();
	    // Print the heading
	    System.out.println("Title:" + linkyName);
       Thread.sleep(4000);
 	    String linkName3 = link3.getText();
 	    // Print the heading
 	    System.out.println("To click link3:" + linkName3);
        Thread.sleep(4000); 
        
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 15000)");
        
        WebDriverWait waitx = new WebDriverWait(driver, Duration.ofSeconds(30));
 	    WebElement name = waitx.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=\"wpcf7-f1381-p54-o1\"]/form/p[2]/span/input")));
        name.sendKeys("cibi");
        Thread.sleep(2000);
        
        WebElement email = driver.findElement(By.xpath("//input[@name='your-email']"));
        email.sendKeys("cibi@gmail.com");
        Thread.sleep(2000);
        
        WebElement name2 = driver.findElement(By.xpath("//input[@name='your-subject']"));
        name2.sendKeys("learn more");
        Thread.sleep(2000);
        
        WebElement name3 = driver.findElement(By.xpath("//textarea[@name='your-message']"));
        name3.sendKeys("learn more to get the ....");
        Thread.sleep(2000);
        
        WebElement submit = driver.findElement(By.xpath("//input[@value='Send']"));
        submit.click();
        Thread.sleep(2000);
        
        WebElement resp = driver.findElement(By.xpath("//div[@class='wpcf7-response-output']"));
        String respns = resp.getText();
        System.out.println(respns);
        
      
        //close the browser
        driver.quit();
       
	}

}
