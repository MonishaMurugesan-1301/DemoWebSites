package wP_8_legal;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
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

public class legalPage extends Baseclass_legal {

	WebDriver driver;

	public legalPage(WebDriver driver) {
		this.driver = driver;
	}

	By docpath = By.xpath("//div[@id='menu']/nav/ul/li[2]/a");
	By noticepath = By.xpath("//a[@id='item_1887']");
	By titlepath = By.xpath("//div[@class='document-title']/h1");
	By btnpath = By.xpath("(//a[@class='btn large call2action creation-document'])[1]");
	By namepath = By.id("nameparty1");
	By nextpath = By.xpath("//button[@name='suivant']");
	By adrspath = By.xpath("//textarea[@id='addressparty1']");
	By nxtpath2 = By.xpath("//div[@id='controle']/button[1]");
	By compPath = By.xpath("//div[@class='radio_box_texte']");
	By datepath = By.xpath("//input[@id='date']");
	By attpath = By.xpath("//input[@id='attention']");
	By partypath = By.xpath("//input[@id='nameparty2']");
	By authpath = By.xpath("//input[@name='auth_name']");
	By agrmntpath = By.xpath("//input[@name='whichagreement']");
	By agdatepath = By.xpath("//div[@id='ui-datepicker-div']/table/tbody/tr[5]/td[5]/a");
	By agrmtdate = By.xpath("//input[@id='agreementdate']");
	By nopath = By.xpath("//div[@id='question_1']/div[3]/div");
	By termdate = By.xpath("//input[@id='terminationdate']");

	public void clickHomeDoc() throws InterruptedException, AWTException {
		WebElement doc = driver.findElement(docpath);
		ClickMethod(doc);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 1500)");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		WebElement notice = driver.findElement(noticepath);
		ClickMethod(notice);

		WebElement title = driver.findElement(titlepath);
		String text = title.getText();
		System.out.println("Document Title : " + text);

		WebElement button = driver.findElement(btnpath);
		ClickMethod(button);

		WebElement name1 = driver.findElement(namepath);
		SendkeysMethod(name1, "Cibi");

		WebElement nextbtn = driver.findElement(nextpath);
		ClickMethod(nextbtn);
		Thread.sleep(2000);

		waits(driver, Duration.ofSeconds(30), adrspath);
		WebElement address = driver.findElement(adrspath);
		ClickMethod(address);
		SendkeysMethod(address, "abc pvt.ltd");
		Thread.sleep(2000);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		WebElement nextbtn2 = driver.findElement(nxtpath2);
		ClickMethod(nextbtn2);
		Thread.sleep(2000);

		waits(driver, Duration.ofSeconds(30), compPath);
		WebElement compbtn = driver.findElement(compPath);
		ClickMethod(compbtn);
		Thread.sleep(2000);

		WebElement nextbtn3 = driver.findElement(nxtpath2);
		ClickMethod(nextbtn3);
		Thread.sleep(2000);

		WebElement attention = driver.findElement(attpath);
		ClickMethod(attention);
		SendkeysMethod(attention, "Monisha");
		Thread.sleep(2000);

		WebElement nextbtn4 = driver.findElement(nextpath);
		ClickMethod(nextbtn4);
		Thread.sleep(2000);

		WebElement dateinput = driver.findElement(datepath);
		ClickMethod(dateinput);
		SendkeysMethod(dateinput, "28-04-2024");
		dateinput.sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		WebElement partyname = driver.findElement(partypath);
		ClickMethod(partyname);
		SendkeysMethod(partyname, "kavi, pvt.ltd");
		Thread.sleep(2000);

		WebElement nextbtn5 = driver.findElement(nextpath);
		ClickMethod(nextbtn5);
		Thread.sleep(2000);

		waits(driver, Duration.ofSeconds(30), compPath);
		WebElement compbtn1 = driver.findElement(compPath);
		ClickMethod(compbtn1);
		Thread.sleep(2000);

		WebElement nextbtn6 = driver.findElement(nextpath);
		ClickMethod(nextbtn6);
		Thread.sleep(2000);

		WebElement authname = driver.findElement(authpath);
		ClickMethod(authname);
		SendkeysMethod(authname, "kavi Raj");
		Thread.sleep(2000);

		WebElement nextbtn7 = driver.findElement(nextpath);
		ClickMethod(nextbtn7);
		Thread.sleep(2000);

		WebElement agreementname = driver.findElement(agrmntpath);
		ClickMethod(agreementname);
		SendkeysMethod(agreementname, "Software service agreement");
		Thread.sleep(2000);

		WebElement agreementdate = driver.findElement(agrmtdate);
		ClickMethod(agreementdate);
		Thread.sleep(2000);
		WebElement dateinput2 = driver.findElement(agdatepath);
		ClickMethod(dateinput2);
		dateinput2.sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		WebElement nextbtn8 = driver.findElement(nextpath);
		ClickMethod(nextbtn8);
		Thread.sleep(2000);

		waits(driver, Duration.ofSeconds(30), nopath);
		WebElement nobtn = driver.findElement(nopath);
		ClickMethod(nobtn);
		Thread.sleep(2000);

		WebElement nextbtn9 = driver.findElement(nextpath);
		ClickMethod(nextbtn9);
		Thread.sleep(2000);

		WebElement terminationdate = driver.findElement(termdate);
		ClickMethod(terminationdate);
		SendkeysMethod(terminationdate, "22-05-2024");
		terminationdate.sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		WebElement nextbtnA = driver.findElement(nextpath);
		ClickMethod(nextbtnA);
		Thread.sleep(2000);

		waits(driver, Duration.ofSeconds(40), nopath);
		WebElement nobtn2 = driver.findElement(nopath);
		ClickMethod(nobtn2);
		Thread.sleep(2000);

		WebElement nextbtnB = driver.findElement(nextpath);
		ClickMethod(nextbtnB);
		Thread.sleep(2000);

		waits(driver, Duration.ofSeconds(30), nopath);
		WebElement nobtn3 = driver.findElement(nopath);
		ClickMethod(nobtn3);
		Thread.sleep(2000);

		WebElement nextbtnC = driver.findElement(nextpath);
		ClickMethod(nextbtnC);
		Thread.sleep(2000);

		waits(driver, Duration.ofSeconds(30), nopath);
		WebElement nobtn4 = driver.findElement(nopath);
		ClickMethod(nobtn4);
		Thread.sleep(2000);

		WebElement nextbtnD = driver.findElement(nextpath);
		ClickMethod(nextbtnD);
		Thread.sleep(2000);

		waits(driver, Duration.ofSeconds(30), nopath);
		WebElement nobtn5 = driver.findElement(nopath);
		ClickMethod(nobtn5);
		Thread.sleep(2000);

		WebElement nextbtnE = driver.findElement(nextpath);
		ClickMethod(nextbtnE);
		Thread.sleep(2000);
	}

	public void screenshot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,
				new File("C:\\Users\\monimuru\\eclipse-workspace\\Task_TestNG\\Screenshot_docPayment" + ".jpg"));
	}

}
