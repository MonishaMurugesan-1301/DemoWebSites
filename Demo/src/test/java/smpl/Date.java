package smpl;

import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Date {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		
		driver.get("https://www.makemytrip.com/budget-stays/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for='checkin']")).click();
		System.out.println("select date");
		
		WebElement dateWidget = driver.findElement(By.className("datePickerContainer")); // Replace with the actual locator
		List<WebElement> columns = dateWidget.findElements(By.className("DayPicker-Month"));

		for (WebElement cell : columns) {
		    if (cell.getText().equals("13")) {
		        cell.findElement(By.linkText("13")).click();
		        break;
		    }
		}

	}

}
