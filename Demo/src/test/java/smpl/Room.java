package smpl;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Room {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://www.oyorooms.com/");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href='/hotels-in-chennai/']")).click();
		  
		driver.findElement(By.xpath("//div[@class='oyo-cell headerSticky__rightHeader']/div[1]/div[2]/div/div")).click();
        Thread.sleep(2000);
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));      
        WebElement date1 = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='DateRangePicker']/div[3]/table/tbody/tr[3]/td[5]")));
        date1.click();  
        driver.findElement(By.xpath("//div[@class='DateRangePicker']/div[3]/table/tbody/tr[3]/td[6]")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//div[@class='oyo-cell headerSticky__rightHeader']/div[1]/div[3]/div/div")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//span[@class='guestRoomPickerPopUp__plus']")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//button[@class='guestRoomPickerPopUp__addRoom']")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("(//span[@class='guestRoomPickerPopUp__plus'])[2]")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//button[@class='u-textCenter searchButton searchButton--header']")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//span[@class='dropdown__select']")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//ul[@class='dropdown__list']/li[4]")).click();
        Thread.sleep(2000);

	}
}

