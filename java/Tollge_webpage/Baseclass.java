package Tollge_webpage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Tollge_Test.Tollge_Driver;

public class Baseclass extends Tollge_Driver {
	
	static WebDriver driver;
	
	public void SendkeysMethod(WebElement ele, String text) {
		ele.sendKeys(text);
	}
	public void ClickMethod(WebElement element) {
		element.click();
	}
    public String getTextMethod(WebElement ele) {
		return ele.getText();
}
    public void Dropdown(WebElement elem, String s) {
		Select se = new Select(elem);
		se.selectByVisibleText(s);	
	}

    public void waits(WebDriver driver,Duration time,By loc) {
		WebDriverWait wait = new WebDriverWait(driver,time);
		wait.until(ExpectedConditions.visibilityOfElementLocated(loc));
	}
}


