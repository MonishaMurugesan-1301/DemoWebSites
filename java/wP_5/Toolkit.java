package wP_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Toolkit extends Baseclass_Acres {

	WebDriver driver;

	public Toolkit(WebDriver driver) {
		this.driver = driver;
	}
	
	By globalpath = By.xpath("//li[@id='tab-global']/descendant::a");
	
	public void homepage() {
		
		WebElement global = driver.findElement(globalpath);
		ClickMethod(global);
	}
}
