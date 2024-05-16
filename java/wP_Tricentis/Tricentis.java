package wP_Tricentis;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Tricentis extends Baseclass_Tricentis {

	WebDriver driver;
	JavascriptExecutor js;

	public Tricentis(WebDriver driver) {
		this.driver = driver;
		this.js = (JavascriptExecutor) driver;
	}
	
	By digipath = By.xpath("//div[@class='header-menu']/ul[1]/li[5]/a");
	By sortpath = By.xpath("//div[@class='product-selectors']/div[2]/select/option[4]");
	By listpath = By.xpath("//div[@class='product-selectors']/div[1]/select/option[2]");
	By titlepath = By.xpath("//div[@class='product-list']/div[3]/div/div[2]/div[2]");
	By productpath = By.xpath("//div[@class='product-list']/div[3]/div/div[2]/h2/a");
	By quatpath = By.xpath("//input[@id='addtocart_51_EnteredQuantity']");
	By cartpath = By.xpath("//input[@id='add-to-cart-button-51']");
	By shopcartpath = By.xpath("//div[@class='header-links']/ul/li[3]");
	By checkboxpath = By.xpath("//div[@class='terms-of-service']/input");
	By btnpath = By.xpath("//button[@id='checkout']");
	By guestbtnpath = By.xpath("//input[@class='button-1 checkout-as-guest-button']");
	By frname = By.xpath("//input[@id='BillingNewAddress_FirstName']");
	By lname = By.xpath("//input[@id='BillingNewAddress_LastName']");
	By mailpath = By.xpath("//input[@id='BillingNewAddress_Email']");
	By cntpath = By.xpath("//select[@id='BillingNewAddress_CountryId']");
	By citypath = By.xpath("//input[@id='BillingNewAddress_City']");
	By adrspath = By.xpath("//input[@id='BillingNewAddress_Address1']");
	By pincode = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
	By phnumbr = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
	By continuebtn = By.xpath("//input[@title='Continue']");
	By cbtn = By.xpath("//input[@class='button-1 payment-method-next-step-button']");
	By paymentpath = By.xpath("//div[@id='checkout-payment-info-load']/descendant::td/p");
	By cobtn = By.xpath("//input[@class='button-1 payment-info-next-step-button']");
	By confirmpath = By.xpath("//input[@class='button-1 confirm-order-next-step-button']");
	By orderpath = By.xpath("//div[@class='section order-completed']/div[1]/strong");
	By ordnum = By.xpath("//div[@class='section order-completed']/ul/li[1]");
	
	public void clickDigitalDownload() throws InterruptedException {
		
		WebElement digdownload = driver.findElement(digipath);
		ClickMethod(digdownload);
		
		WebElement sort = driver.findElement(sortpath);
		ClickMethod(sort);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		
		WebElement list = driver.findElement(listpath);
		ClickMethod(list);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(900));
		
		js.executeScript("window.scrollBy(0, 300)");

		WebElement title = driver.findElement(titlepath);
		String text = title.getText();
		System.out.println("Album :" + text);
		
		WebElement product = driver.findElement(productpath);
		ClickMethod(product);
		
		// Handle window switching
        String Parent_w = driver.getWindowHandle();
        Set <String> set = driver.getWindowHandles();
        Iterator <String> I = set.iterator();
        while(I.hasNext()){
            String Child_w = I.next();
            if(!(Parent_w.equals(Child_w))) {
                driver.switchTo().window(Child_w);
            }
        }
        
        js.executeScript("window.scrollBy(0, 300)");
        
        waits(driver, Duration.ofSeconds(20), quatpath);
		WebElement quantity = driver.findElement(quatpath);
		quantity.clear();
		Thread.sleep(2000);
		quantity.sendKeys("10");
		
		WebElement addtocart = driver.findElement(cartpath);
		ClickMethod(addtocart);
		
		js.executeScript("window.scrollBy(0, -300)");
		
		WebElement shoppingcart = driver.findElement(shopcartpath);
		ClickMethod(shoppingcart);
		
		js.executeScript("window.scrollBy(0, 300)");
		
		waits(driver, Duration.ofSeconds(20), checkboxpath);
		WebElement checkbox = driver.findElement(checkboxpath);
		ClickMethod(checkbox);
		
		WebElement checkout = driver.findElement(btnpath);
		ClickMethod(checkout);
		
		WebElement guest = driver.findElement(guestbtnpath);
		ClickMethod(guest);
		
		WebElement firstname = driver.findElement(frname);
		SendkeysMethod(firstname, "cibi");
		
		WebElement lastname = driver.findElement(lname);
		SendkeysMethod(lastname, "kavi");
		
		WebElement email = driver.findElement(mailpath);
		SendkeysMethod(email, "kaci@gmail.com");
		
		Select select = new Select(driver.findElement(cntpath));
		select.selectByVisibleText("India");
		
		WebElement city = driver.findElement(citypath);
		SendkeysMethod(city, "Salem");
		
		WebElement address = driver.findElement(adrspath);
		SendkeysMethod(address, "Namakkal,Tamilnadu");
		
		WebElement zipcode = driver.findElement(pincode);
		SendkeysMethod(zipcode, "637020");
		
		WebElement mobnumber = driver.findElement(phnumbr);
		SendkeysMethod(mobnumber, "9876543210");
		
		WebElement Continue = driver.findElement(continuebtn);
		ClickMethod(Continue);
		
		WebElement Continuebtn2 = driver.findElement(cbtn);
		ClickMethod(Continuebtn2);
		
		WebElement payment = driver.findElement(paymentpath);
		String info = payment.getText();
		System.out.println("Payment mode :" + info);
		
		WebElement Continuebtn3 = driver.findElement(cobtn);
		ClickMethod(Continuebtn3);
		
		  js.executeScript("window.scrollBy(0, 400)");
		
		WebElement confirm = driver.findElement(confirmpath);
		ClickMethod(confirm);
	}
	
	public void screenshot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("C:\\Users\\monimuru\\eclipse-workspace\\Task_TestNG\\Screenshot_order" + ".png"));
	
		WebElement order = driver.findElement(orderpath);
		String text2 = order.getText();
		System.out.println("Response: " + text2);
		
		WebElement ordernum = driver.findElement(ordnum);
		String text3 = ordernum.getText();
		System.out.println("Product : " + text3);
		
		
		
	}
}