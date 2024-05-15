package day_5_STHelp;

	import java.time.Duration;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

public class Data {

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
		    
		    // Scroll to the image1
	        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 8000)");
	        
	        WebElement img = driver.findElement(By.xpath("//div[@class='entry-content']/p[6]/a/img"));
	        img.click();
	        System.out.println("Introduction to BigData");
	        Thread.sleep(4000);
	        
	        driver.navigate().back();
	        System.out.println("navigate back to homepage aft img1");
	        Thread.sleep(4000);
		    
	        // Scroll to the image2
	        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 9000)");
	        
	        WebElement img2 = driver.findElement(By.xpath("//div[@class='entry-content']/p[12]/a/img"));
	        img2.click();
	        System.out.println("Three V's of BigData");
	        Thread.sleep(5000);
	        
	        driver.navigate().back();
	        System.out.println("navigate back to homepage aft img2");
	        Thread.sleep(4000);
	        
	     // Scroll to the image3
	        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 5000)");
	        
	        WebElement img3 = driver.findElement(By.xpath("//div[@class='entry-content']/p[23]/a/img"));
	        img3.click();
	        System.out.println("Challenges Of Traditional Databases");
	        Thread.sleep(5000);
	        
	        driver.navigate().back();
	        System.out.println("navigate back to homepage aft img3");
	        Thread.sleep(4000);
	        
	        // Scroll to the image4
	        WebElement img4 = driver.findElement(By.xpath("//div[@class='entry-content']/p[24]/a/img"));
	        img4.click();
	        System.out.println("Benefits of BigData");
	        Thread.sleep(5000);
	        
	        driver.navigate().back();
	        System.out.println("navigate back to homepage aft img4");
	        Thread.sleep(4000);
	  
	        //close the browser
	        driver.quit();
		}
}
