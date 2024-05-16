package wP_7_CodeBeautify;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import tC_6_Nestaway.Driver_Nestaway;
import tC_CodeBeautify.Driver_CodeBeautify;

public class Baseclass_CodeBeautify extends Driver_CodeBeautify {

	WebDriver driver;

	public void SendkeysMethod(WebElement ele, String text) {
		ele.sendKeys(text);
	}

	public void ClickMethod(WebElement element) {
		element.click();
	}
	
	public void ClearMethod(WebElement element) {
		element.clear();
	}

	public String getTextMethod(WebElement ele) {
		return ele.getText();
	}
	public void Scrolldown(String height) {
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, document.body.scrollHeight)");
	}

//	public void waits(WebDriver driver, Duration time, By loc) {
//		WebDriverWait wait = new WebDriverWait(driver, time);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(loc));
//	}
}
