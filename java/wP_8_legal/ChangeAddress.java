package wP_8_legal;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ChangeAddress extends Baseclass_legal{
	
	WebDriver driver;
	
	public ChangeAddress(WebDriver driver) {
		this.driver = driver;
	}
	
	By searchpath = By.xpath("//input[@id='recherche']");
	By linkpath = By.xpath("//a[@href='../modele/change-address-letter-in']");
	By titlepath = By.xpath("//div[@class='document-title']/h1");
	By btnpath = By.xpath("(//a[@class='btn large call2action creation-document'])[1]");
	By namepath = By.xpath("//input[@id='sender_name']");
	By nextpath = By.xpath("//button[@name='suivant']");
	By senderadrs = By.xpath("//select[@id='old_or_new']");
	By newadrs = By.id("sender_new_address");
	By datepath = By.xpath("//input[@id='letter_date']");
	By nopath = By.xpath("//div[@id='question_2']/div[3]/div");
	By recepname = By.id("entityname");
	By recepadrs = By.id("recipient_address");
	By checkboxpath = By.xpath("//input[@id='checkbox_reference']");
	By refnumpath = By.id("reference_number");
	By oldadrs = By.xpath("//textarea[@id='sender_old_address']");
	By confbox = By.xpath("//input[@id='confirmation']");
	
	
	public void addressChange() throws InterruptedException {
		WebElement search= driver.findElement(searchpath);
		SendkeysMethod(search, "Address");
		search.sendKeys(Keys.ENTER);
		
		WebElement link = driver.findElement(linkpath);
		ClickMethod(link);
		
		WebElement title = driver.findElement(titlepath);
		String text = title.getText();
		System.out.println("Doc Title : " + text);

		WebElement button = driver.findElement(btnpath);
		ClickMethod(button);
		
		WebElement name1 = driver.findElement(namepath);
		SendkeysMethod(name1, "Cibi");
		
		WebElement nextbtn = driver.findElement(nextpath);
		ClickMethod(nextbtn);
		
		Select select = new Select(driver.findElement(senderadrs));
		select.selectByIndex(1);
		
		waits(driver, Duration.ofSeconds(30), nextpath);
		WebElement nextbtn2 = driver.findElement(nextpath);
		ClickMethod(nextbtn2);
		Thread.sleep(2000);
//		clickNextButton();
		
		WebElement newaddress = driver.findElement(newadrs);
		ClickMethod(newaddress);
		SendkeysMethod(newaddress, "51, Beml layout, Bangalore");
		Thread.sleep(2000);
		
		waits(driver, Duration.ofSeconds(30), nextpath);
		WebElement nextbtn3 = driver.findElement(nextpath);
		ClickMethod(nextbtn3);
		Thread.sleep(2000);
		
		WebElement dateinput = driver.findElement(datepath);
		ClickMethod(dateinput);
		SendkeysMethod(dateinput, "23-03-2024");
		dateinput.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		


		
		waits(driver, Duration.ofSeconds(30), nopath);
		WebElement nobtn = driver.findElement(nopath);
		ClickMethod(nobtn);
		Thread.sleep(2000);

		waits(driver, Duration.ofSeconds(30), nextpath);
		WebElement nextbtn4 = driver.findElement(nextpath);
		ClickMethod(nextbtn4);
		Thread.sleep(2000);
		
		WebElement recepient = driver.findElement(recepname);
		SendkeysMethod(recepient, "Pranesh");
		
//		clickNextButton();

		waits(driver, Duration.ofSeconds(30), nextpath);
		WebElement nextbtn5 = driver.findElement(nextpath);
		ClickMethod(nextbtn5);
		Thread.sleep(2000);
		
		WebElement recepientadrs = driver.findElement(recepadrs);
		ClickMethod(recepientadrs);
		SendkeysMethod(recepientadrs, "15, kr puram, Bangalore");
		Thread.sleep(2000);
		

		waits(driver, Duration.ofSeconds(30), nextpath);
		WebElement nextbtn6 = driver.findElement(nextpath);
		ClickMethod(nextbtn6);
		Thread.sleep(2000);
		
		WebElement checkbox = driver.findElement(checkboxpath);
		ClickMethod(checkbox);
		

		waits(driver, Duration.ofSeconds(30), nextpath);
		WebElement nextbtn7 = driver.findElement(nextpath);
		ClickMethod(nextbtn7);
		Thread.sleep(2000);
		
		WebElement refnumber = driver.findElement(refnumpath);
		ClickMethod(refnumber);
		SendkeysMethod(refnumber, "557788");
		Thread.sleep(2000);
		

		waits(driver, Duration.ofSeconds(30), nextpath);
		WebElement nextbtn8 = driver.findElement(nextpath);
		ClickMethod(nextbtn8);
		Thread.sleep(2000);
		
		waits(driver, Duration.ofSeconds(30), nextpath);
		WebElement nextbtn9 = driver.findElement(nextpath);
		ClickMethod(nextbtn9);
		Thread.sleep(2000);
		
		waits(driver, Duration.ofSeconds(30), nextpath);
		WebElement nextbtnA = driver.findElement(nextpath);
		ClickMethod(nextbtnA);
		Thread.sleep(2000);
		
		waits(driver, Duration.ofSeconds(30), nextpath);
		WebElement nextbtnD = driver.findElement(nextpath);
		ClickMethod(nextbtnD);
		Thread.sleep(2000);
		
		WebElement oldaddress = driver.findElement(oldadrs);
		ClickMethod(oldaddress);
		SendkeysMethod(oldaddress, "32,anna street, Namakkal");
		Thread.sleep(2000);
		

		waits(driver, Duration.ofSeconds(30), nextpath);
		WebElement nextbtnB = driver.findElement(nextpath);
		ClickMethod(nextbtnB);
		Thread.sleep(2000);
		
		WebElement confcheckbox = driver.findElement(confbox);
		ClickMethod(confcheckbox);
		Thread.sleep(2000);
		
		
		waits(driver, Duration.ofSeconds(30), nextpath);
		WebElement nextbtnC = driver.findElement(nextpath);
		ClickMethod(nextbtnC);
		Thread.sleep(2000);
		
		waits(driver, Duration.ofSeconds(30), nextpath);
		WebElement finish = driver.findElement(nextpath);
		ClickMethod(finish);
		Thread.sleep(2000);	
	}
	
	public void screenshot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("C:\\Users\\monimuru\\eclipse-workspace\\Task_TestNG\\Screenshot_doc2" + ".png"));
	}
	
}