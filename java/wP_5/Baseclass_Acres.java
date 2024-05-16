package wP_5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import tC_5.DriverClass;

public class Baseclass_Acres extends DriverClass {

	WebDriver driver;

	public void SendkeysMethod(WebElement ele, String text) {
		ele.sendKeys(text);
	}

	public void ClickMethod(WebElement element) {
		element.click();
	}

	public String getTextMethod(WebElement ele) {
		return ele.getText();
	}
	public void Scrolldown(String height) {
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, document.body.scrollHeight)");
	}
//    public void Dropdown(WebElement elem, String s) {
//		Select se = new Select(elem);
//		se.selectByVisibleText(s);	
//	}

	public void waits(WebDriver driver, Duration time, By loc) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOfElementLocated(loc));
	}
}
