package day_7_TalentCapg;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_1_SustCampus {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://talent.capgemini.com/in");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@id='tools']//child::div[3]/ul/li[2]/a)[1]")).click();
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
		
		String newPageUrl = driver.getCurrentUrl();
		System.out.println("New Page URL: " + newPageUrl);
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("monisha.murugesan@capgemini.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='continueBtn']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@data-dgat='LogIn-32c']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='current-password']")).sendKeys("Monish@555");
		Thread.sleep(2000);
		
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 100)");
        Thread.sleep(2000);
        
		driver.findElement(By.xpath("//button[@id='continueBtn']")).click();
		Thread.sleep(2000);

	}

}
