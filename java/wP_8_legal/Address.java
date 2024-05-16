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

public class Address extends Baseclass_legal {

	WebDriver driver;

	public Address(WebDriver driver) {
		this.driver = driver;
	}

	// By locators
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
		WebElement search = driver.findElement(searchpath);
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

		// Click next button using the method from the base class
		clickNextButton();

		Select select = new Select(driver.findElement(senderadrs));
		select.selectByIndex(1);

		// Click next button using the method from the base class
		clickNextButton();

		WebElement newaddress = driver.findElement(newadrs);
		ClickMethod(newaddress);
		SendkeysMethod(newaddress, "51, Beml layout, Bangalore");

		// Click next button using the method from the base class
		clickNextButton();

		WebElement dateinput = driver.findElement(datepath);
		ClickMethod(dateinput);
		SendkeysMethod(dateinput, "23-03-2024");
		dateinput.sendKeys(Keys.ENTER);

		waits(driver, Duration.ofSeconds(30), nopath);
		WebElement nobtn = driver.findElement(nopath);
		ClickMethod(nobtn);
		Thread.sleep(2000);

		clickNextButton();

		WebElement recepient = driver.findElement(recepname);
		SendkeysMethod(recepient, "Pranesh");

		clickNextButton();

		WebElement recepientadrs = driver.findElement(recepadrs);
		ClickMethod(recepientadrs);
		SendkeysMethod(recepientadrs, "15, kr puram, Bangalore");
		Thread.sleep(2000);

		clickNextButton();

		WebElement checkbox = driver.findElement(checkboxpath);
		ClickMethod(checkbox);

		clickNextButton();

		WebElement refnumber = driver.findElement(refnumpath);
		ClickMethod(refnumber);
		SendkeysMethod(refnumber, "557788");
		Thread.sleep(2000);

		clickNextButton();
		clickNextButton();
		clickNextButton();
		clickNextButton();

		WebElement oldaddress = driver.findElement(oldadrs);
		ClickMethod(oldaddress);
		SendkeysMethod(oldaddress, "32,anna street, Namakkal");
		Thread.sleep(2000);

		clickNextButton();

		WebElement confcheckbox = driver.findElement(confbox);
		ClickMethod(confcheckbox);
		Thread.sleep(2000);

		clickNextButton();

		waits(driver, Duration.ofSeconds(30), nextpath);
		WebElement finish = driver.findElement(nextpath);
		ClickMethod(finish);
		Thread.sleep(2000);

	}

	private void clickNextButton() {
		WebElement nextButton = driver.findElement(nextpath);
		ClickMethod(nextButton);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void screenshot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,
				new File("C:\\Users\\monimuru\\eclipse-workspace\\Task_TestNG\\Screenshot_addressdoc" + ".png"));
	}

}
