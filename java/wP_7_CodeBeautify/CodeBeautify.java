package wP_7_CodeBeautify;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CodeBeautify extends Baseclass_CodeBeautify {

	WebDriver driver;
	
	public CodeBeautify(WebDriver driver) {
		this.driver=driver;
	}
	
	By calcpath = By.xpath("//div[@id='navbarTopMain']/div/a[3]");
	By intrestpath = By.xpath("//a[@title='Compound Interest Calculator']");
	By titlepath = By.xpath("//div[@class='column is-4']/h1");
	By dropdown = By.xpath("//input[@id='initialDeposit']");
	By dropdownpath = By.xpath("(//div[@class='field has-addons'])[1]/p[2]/span/select");
	By addDep = By.xpath("//input[@id='inputContribution']");
	By percentpath = By.xpath("//input[@id='inputpercentage']");
	By tenurepath = By.xpath("//input[@id='inputTenure']");
	By tedropdown = By.xpath("(//div[@class='field has-addons'])[3]/p[2]/span/select");
	By compfreq = By.xpath("//div[@class='select is-fullwidth']/select");
	By calcbtnpath = By.xpath("//button[text()='Calculate']");
	By textpath = By.xpath("//p[@id='showAmountInWord']");
	
	public void ClickOnCalculator() throws IOException {
		WebElement calculator = driver .findElement(calcpath);
		ClickMethod(calculator);
		
		WebElement compInt = driver.findElement(intrestpath);
		ClickMethod(compInt);
		
		WebElement title = driver.findElement(titlepath);
		String text = title.getText();
		System.out.println("Title : " +text);
		
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 300)");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		
		WebElement initdeposit = driver.findElement(dropdown);
		ClearMethod(initdeposit);
		SendkeysMethod(initdeposit, "10000");
		
		Select select = new Select(driver.findElement(dropdownpath));   
		select.selectByIndex(1);
		
		WebElement addDeposit = driver.findElement(addDep);
		ClearMethod(addDeposit);
		SendkeysMethod(addDeposit, "150");
		
		WebElement percent = driver.findElement(percentpath);
		ClearMethod(percent);
		SendkeysMethod(percent, "7");
		
		WebElement tenure = driver.findElement(tenurepath);
		ClearMethod(tenure);
		SendkeysMethod(tenure, "20");
		
		WebElement tenuredropdown = driver.findElement(tedropdown);
		ClickMethod(tenuredropdown);
		tenuredropdown.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		
		WebElement comfreq = driver.findElement(compfreq);
		ClickMethod(comfreq);
		comfreq.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);

		WebElement calculatebtn = driver.findElement(calcbtnpath);
		ClickMethod(calculatebtn);
		
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -200)");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		
		TakesScreenshot ts=(TakesScreenshot)driver;
        File file=ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("C:\\Users\\monimuru\\eclipse-workspace\\Task_TestNG\\Screenshot_graph" + ".jpg"));
        
        WebElement title1 = driver.findElement(textpath);
		String text1 = title1.getText();
		System.out.println("Total Amount : " +text1);
		
	}
	
}
