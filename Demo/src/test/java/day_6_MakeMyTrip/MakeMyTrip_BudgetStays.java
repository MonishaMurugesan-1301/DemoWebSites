package day_6_MakeMyTrip;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MakeMyTrip_BudgetStays {

    public static void main(String[] args) throws InterruptedException {
        
        // Initializing WebDriver
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\monimuru\\Downloads\\ChPath\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        
        // Login to website
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));      
        WebElement login = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[text()='Login or Create Account']")));
        login.click();       
        Thread.sleep(3000);
        
        // Selecting login option
        driver.findElement(By.xpath("//div[@class='appendBottom25']//child::ul/li[2]")).click();
        Thread.sleep(2000);
        
        // Entering email and password for login
        driver.findElement(By.xpath("//input[@placeholder='Enter your work email id']")).sendKeys("monisha.murugesan@capgemini.com");     
        driver.findElement(By.xpath("//div[@class='makeFlex spaceBetween appendBottom10']/child::span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Enter a password']")).sendKeys("Monish@555");
        driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
        Thread.sleep(2000);
        
        // Clicking on the "Budget stays" menu
        driver.findElement(By.xpath("//li[@class='menu_BudgetStays']")).click();
        
        // Getting the URL of the new page
        String newPageUrl = driver.getCurrentUrl();
        System.out.println("New Page URL: " + newPageUrl);
        
        // Handling "OK GOT IT" pop-up
        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(30));      
        WebElement gotit = wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='OK GOT IT']")));
        gotit.click(); 
        Thread.sleep(3000);

        // Selecting city
        driver.findElement(By.xpath("//label[@for='city']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//p[text()='Bengaluru']")).click();
        Thread.sleep(2000);
        
        // Selecting check-in date
        driver.findElement(By.xpath("//input[@id='checkin']")).click();
        Thread.sleep(2000);
        WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(30));      
        WebElement date1 = wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@aria-label='Thu Mar 14 2024']")));
        date1.click();
        Thread.sleep(2000);
        
        // Selecting check-out date
        driver.findElement(By.xpath("//input[@id='checkout']")).click();
        Thread.sleep(2000);
        WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(30));      
        WebElement date2 = wait5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@aria-label='Fri Mar 15 2024']")));
        date2.click();
        Thread.sleep(2000);
        
        // Selecting number of rooms
        driver.findElement(By.xpath("(//div[@class='gstSlctCont'])[1]/div")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//ul[@class='gstSlct__list']/child::li[5]")).click();
        Thread.sleep(2000);
        // Selecting number of adults
        driver.findElement(By.xpath("(//div[@class='gstSlctCont'])[2]/div")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//ul[@class='gstSlct__list']/child::li[6]")).click();
        Thread.sleep(2000);
        
        // Applying filters
        driver.findElement(By.xpath("//button[text()='Apply']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='slctFareType']//child::ul/li[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='slctFareType']//child::ul/li[3]")).click();
        Thread.sleep(2000);
        
        // Initiating search
        driver.findElement(By.xpath("//button[@id='hsw_search_button']")).click();
        Thread.sleep(2000);
        
        // Selecting a hotel
        driver.findElement(By.xpath("//span[text()='Golf Inn']")).click();
        Thread.sleep(2000);
        
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
        
        // Getting the URL of the new page
        String crntPageUrl = driver.getCurrentUrl();
        System.out.println("New Page URL: " + crntPageUrl);
        
        // Initiating booking process
        driver.findElement(By.xpath("//span[@class='bookNowBtn ']")).click();
        Thread.sleep(2000);
      
        // Getting and printing review
        String review =driver.findElement(By.xpath("//div[@class='rvHeader__inner']/p"))
            .getText();
        System.out.println(review);
        
        // Closing the driver
        driver.quit();
    }

}
