package wP_5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TransactionPrice extends Baseclass_Acres {
	
	WebDriver driver;
	
	public TransactionPrice(WebDriver driver) {
		this.driver = driver;
	}
	
//	By loginpath = By.xpath("//div[@data-label='USER_PROFILE_DROPDOWN']");
//	By regispath = By.xpath("(//div[text()='LOGIN / REGISTER'])[1]");
//	By phnumpath = By.xpath("//input[@title='Phone Number']");
//	By contpath = By.xpath("//div[@class='phoneLogin__submitBtn']/button");
	By menupath = By.xpath("(//i[@class='iconS_Common_24 icon_menuIcon hmenu__explicitSpriteSize'])[1]");
	By insightpath = By.xpath("(//div[@id='hamburgerMenu']/div[2]/div[4]/div[2]/div[1])[1]");
	By tpricepath = By.xpath("//div[@class='hmenu__labelWrap hmenu__dropOpen']/descendant::ul/li[3]/a");
	
	public void homepage() throws InterruptedException {
		
		
//		WebElement login = driver.findElement(loginpath);
//		ClickMethod(login);
//		
//		WebElement register = driver.findElement(regispath);
//		ClickMethod(register);
//		
//		WebElement phnumber = driver.findElement(phnumpath);
//		ClickMethod(phnumber);
//		Thread.sleep(2000);
//		//SendkeysMethod(phnumber, "8610792699");
//		phnumber.sendKeys("8610792699");
//		Thread.sleep(2000);
//		
//		WebElement contibtn = driver.findElement(contpath);
//		ClickMethod(contibtn);
		
		waits(driver, Duration.ofSeconds(40), menupath);
		WebElement menu = driver.findElement(menupath);
		ClickMethod(menu);
		
		WebElement insight = driver.findElement(insightpath);
		ClickMethod(insight);
		
		Scrolldown("0, 200");
		
		WebElement trprice = driver.findElement(tpricepath);
		ClickMethod(trprice);
		
		
	}

}
