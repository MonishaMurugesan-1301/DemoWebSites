package day_1_CarDekho;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class task2_car {

   public static void main (String[] args) throws InterruptedException {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\monimuru\\Downloads\\ChPath\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		
		//handle 
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--disable-geolocation");
		driver = new ChromeDriver(options);
		
		// Navigate to the CarDekho website
		driver.get("https://www.cardekho.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		// Find the search input field
        WebElement searchInput = driver.findElement(By.id("cardekhosearchtext"));

        // Enter the car make/model in the search field
        searchInput.sendKeys("Mahindra Thar");
        Thread.sleep(2000);

        // Create Actions object
        Actions actions = new Actions(driver);

        // Send Enter key
        actions.sendKeys(Keys.ENTER).perform();
        Thread.sleep(2000);
        
        // Find the element containing the product name
     
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement productNameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='tooltip' and text()='Mahindra Thar']")));

        // Get the text of the product name element
        System.out.println("Product name element is visible. Retrieving product name...");

        String productName = productNameElement.getText();
        // Print the product name
        System.out.println("Product Name: " + productName);
        
       // Close the browser
        driver.quit();
        

   }
}

