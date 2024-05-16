package wP_3_Ajio;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AjioPage {
	
	WebDriver driver;
	
	public AjioPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickServices() {
		WebElement services = driver.findElement(By.xpath("//a[@id='btn-home-page-service-menu-1']"));
		services.click();
	}
	
	public void clicklink() throws InterruptedException {
		//WebDriverWait w1 = new WebDriverWait(driver, Duration.ofSeconds(20));
		//WebElement knmore = w1.until(ExpectedConditions.elementToBeClickable(By.xpath("//u[text()='Know More']")));
		WebElement knmore = driver.findElement(By.xpath("(//div[@class='div-megamenu-hover-effects'])[3]/a")); 
		knmore.click();
		Thread.sleep(2000);
	}
	
	public void clickIndianStores() throws InterruptedException {
		
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
        
		WebElement indstore = driver.findElement(By.xpath("//a[@class='btn btn-l btn-s-b btn-b-b btn-a-l']"));
		indstore.click();
	}
	
	public void scrollDown() {
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 500)");
    }
	
	
	public void onlinestore() {
		WebElement store = driver.findElement(By.xpath("//ul[@class='list-inline list-unstyled']/li[1]"));
		store.click();
	}
	
	public void amazon() {
		WebElement amaz = driver.findElement(By.xpath("//a[@title='Amazon.in']"));
		amaz.click();
	}
	
	public void todaysdeal() throws InterruptedException {
		//windows handle
		 String Parent_w1 = driver.getWindowHandle();
	        Set <String> set = driver.getWindowHandles();
	        Iterator <String> I = set.iterator();
	        while(I.hasNext()){
	            String Child_w1 = I.next();
	            if(!(Parent_w1.equals(Child_w1))) {
	                driver.switchTo().window(Child_w1);
	            }
	        }
	        Thread.sleep(2000);
		
		WebDriverWait w1 = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement deal = w1.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='nav-xshop']/a[6]")));
		
		deal.click();
		String text = deal.getText();
		System.out.println("amazon page :" + text);
	}
	
	
}
