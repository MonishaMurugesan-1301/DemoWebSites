package day_4_BMW;
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

public class BMW_CarModels {
		
		 public static void main(String[] args) throws InterruptedException {

			    // Initialize WebDriver
		        WebDriver driver;
		        System.setProperty("webdriver.chrome.driver", "C:\\Users\\monimuru\\Downloads\\ChPath\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

		        driver = new ChromeDriver();
		        driver.get("https://www.bmw.com/en/index.html");
		        driver.manage().window().maximize();
		        Thread.sleep(2000);
		        driver.manage().getCookies();
		        Thread.sleep(2000);
		           
		        //click on models
		        driver.findElement(By.xpath("//ul[@class='pwh__m']/li[7]/a")).click();
		        
		        //redirects to all models page
		        String newPageUrl = driver.getCurrentUrl();
				System.out.println("New Page URL: " + newPageUrl);
				
				 // Handle window switching
		        String Parent_w = driver.getWindowHandle();
		        Set <String> set = driver.getWindowHandles();
		        Iterator <String> I = set.iterator();
		        while(I.hasNext()){
		            String Child_w = I.next();
		            if(!(Parent_w.equals(Child_w))) {
		                driver.switchTo().window(Child_w);
		            }
		        }
				//clicl on more filters
				 WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));		
			     WebElement filter = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='cmp-modelselection__top-wrapper']/form/div[2]/div/button")));
			     filter.click();
			      
			     WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(30)); 
			     WebElement checkbox1 = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@data-filter-value='sedan']")));
			     checkbox1.click();

			     WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(30)); 
			     WebElement checkbox2 = wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@data-filter-value='gasoline']")));
			     checkbox2.click();

			     WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(30)); 
			     WebElement result = wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='cmp-overlay__foot cmp-modelfilter__overlay-footer']/button")));
			     result.click();//div[@class='cmp-overlay__foot cmp-modelfilter__overlay-footer']/button
				

			   //get the text shown
				WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(20));
			    WebElement giventext = wait5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(" //div[@class='cmp-modelfilter__number-wrap']/span[1]")));

				String productName = giventext.getText();
			   // Print the product name
			    System.out.println("Number of Vehicles filtered :" + productName); 
			    Thread.sleep(3000);
				
			    WebDriverWait wait6 = new WebDriverWait(driver, Duration.ofSeconds(40)); 
			    WebElement car = wait6.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='cmp-modelselection__group-list'])[4]/child::div/button")));
			   // Click on the car element using JavaScriptExecutor
			    ((JavascriptExecutor)driver).executeScript("arguments[0].click();", car);
			    //car.click();
			    
			    WebDriverWait wait7 = new WebDriverWait(driver, Duration.ofSeconds(40)); 
			    WebElement car1 = wait7.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='cmp-modelselection__cta-show-more cmp-modelselection__detail-view--link']")));
			    ((JavascriptExecutor)driver).executeScript("arguments[0].click();", car1);
			    
			    // Scroll to the car element
		        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 1700)");
		        
		        WebDriverWait wait8 = new WebDriverWait(driver, Duration.ofSeconds(50));
		        WebElement blueclr = wait8.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='scroll-navigation-content tw-h-full'])[2]/div/child::ul/li[5]/button")));
		        blueclr.click();
		 
			    // Extract and print the body color options
		        WebDriverWait wait9 = new WebDriverWait(driver, Duration.ofSeconds(60));
		        WebElement colour = wait9.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='columns tw-flex tw-justify-center text-center']")));        
		        String clrName = colour.getText();
		        System.out.println("Car Color : " + clrName);
		        Thread.sleep(2000);
		        
		        //close the browser
		        driver.quit();
		 }
}
