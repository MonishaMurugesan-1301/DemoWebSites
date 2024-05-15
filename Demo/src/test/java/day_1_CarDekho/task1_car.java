package day_1_CarDekho;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class task1_car {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\monimuru\\Downloads\\ChPath\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		
		//To handle notifications
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--disable-geolocation");
		
		driver = new ChromeDriver(options);

		String actURL = "https://www.cardekho.com";
		driver.get("https://www.cardekho.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		// Click on "New Cars"
		WebElement newCarsLink = driver.findElement(By.xpath("//a[@title='New Cars']"));
		newCarsLink.click();

		// Click on "Explore New Cars"
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement expcars = wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Explore New Cars")));
		expcars.click();
		
		String newPageUrl = driver.getCurrentUrl();
		System.out.println("New Page URL: " + newPageUrl);
		
		//click and select budget
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement bgt = wait.until(ExpectedConditions.elementToBeClickable(By.id("budget")));
		bgt.click();
		
		WebElement bgtval = driver.findElement(By.xpath("//li[@data-value='5 - 10 Lakh']"));
		bgtval.click();
        Thread.sleep(2000);
        
       //click and select vehicle type
        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement cartype = wait.until(ExpectedConditions.elementToBeClickable(By.id("vehicleTypeName")));
		cartype.click();
		
		WebElement type = driver.findElement(By.xpath("//li[@data-value='Pickup Truck']"));
		type.click();
        Thread.sleep(2000);
        
        //click on search
        WebElement searchButton = driver.findElement(By.xpath("//button[contains(text(),'Search')]"));
        searchButton.click();
        
        WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement FiltProducts = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='gsc_col-lg-12 gsc_col-md-12 gsc_col-sm-12 gsc_col-xs-12 NewCarFilterSearch']")));

        // Get the text of the product filter
        System.out.println("Filtered products are visible. Retrieving product names...");

        String filtproductName = FiltProducts.getText();
        // Print the product name
        System.out.println("Filtered Products: " + filtproductName);
        
       
        WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(30));
        List<WebElement> productNameElements = wait5.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='gsc_col-sm-7 gsc_col-xs-8 gsc_col-md-8 listView holder']/h3")));

        for (WebElement productNameElement : productNameElements) {
            String productName = productNameElement.getText();
            System.out.println("Products Name: " + productName);
        }

        // Close the browser
        driver.quit();
      
	}

}
