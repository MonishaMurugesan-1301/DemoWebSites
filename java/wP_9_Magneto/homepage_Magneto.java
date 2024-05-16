package wP_9_Magneto;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class homepage_Magneto extends Baseclass_Magneto{

	WebDriver driver;

	public homepage_Magneto(WebDriver driver) {
		this.driver = driver;
}
	
	By droppath = By.xpath("//a[@id='ui-id-5']/span[1]");
	By toppath = By.xpath("//a[@id='ui-id-20']/span");
	
	
	public void sectionMen() {
		
		waits(driver, Duration.ofSeconds(30), droppath);
		WebElement men = driver.findElement(droppath);
		ClickMethod(men);
		
		
		WebElement top = driver.findElement(toppath);
		ClickMethod(top);
	}
}
