package wP_2_AbhiBus;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbhiBus_Offers {

	WebDriver driver;
	JavascriptExecutor js;

	public AbhiBus_Offers(WebDriver driver) {
		this.driver = driver;
		this.js = (JavascriptExecutor) driver;
	}
	
	
	public void clickOffers() {
		By offpath = By.xpath("//div[@id='mySidenav']//child::li[6]");
		WebElement offer = driver.findElement(offpath);
		offer.click();
	}
	
	public void pageUrl() {
		
		  WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(30));      
	      WebElement url = wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='offer-cards-tab-container']/h2")));
	   
		String link = url.getText();
		System.out.println("Offers page url:" + link);
	}
	
	public void FromStation() {
		By stn = By.xpath("//input[@placeholder='From Station']");
		driver.findElement(stn).click();
		driver.findElement(By.xpath("//li[@data-id='Bangalore']")).click();
		}
	
	public void ToStation() {
		By stn2 = By.xpath("//div[@id='search-to']");
		WebElement tostation = driver.findElement(stn2);
		tostation.click();
		driver.findElement(By.xpath("//li[@data-id='Chennai']")).click();
		
	}

	public void selectdate() throws InterruptedException {
		//By date = By.xpath("//div[@id='scroll-element']/a[8]");
		By date1 = By.xpath("//div[@id='jaurney-date']");
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		    WebElement dateField = wait.until(ExpectedConditions.elementToBeClickable(date1));
		    dateField.click();
	
	   while(!driver.findElement(By.xpath("//div[@class='container month ']/child::div[2]/span[1]")).getText().contains("April")){
		   driver.findElement(By.xpath("//div[@class='container month ']/child::div[3]/span")).click();
		   Thread.sleep(500);
	   }
	   driver.findElement(By.xpath("//span[@data-date='1']")).click();
	}
 
	public void searchbtn() throws InterruptedException {
		By btn = By.xpath("//div[@id='search-button']");
		
		WebElement search = driver.findElement(btn);
		search.click();
		Thread.sleep(2000);
	}
	
	public void scrollDown() {
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 1000)");
    }
	
	public void pickbus() {
		 WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(20));      
	     WebElement url = wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='service-operator-info-1917810433']/descendant::h5")));
	   
		 String name = url.getText();
		 System.out.println("Bus Name:" + name);
	}
	
	public void policy() throws InterruptedException {
		WebElement cp = driver.findElement(By.xpath("//div[@id='service-operator-bus-info-1917810433']"));
		cp.click();
		String text = cp.getText();
		System.out.println("policies :" + text);
	}
	
	public void seats() {
		WebElement seat = driver.findElement(By.xpath("//div[@id='service-operator-select-seat-1917810433']/button"));
		seat.click();
	}
	
	public void seatbooking() {
		WebElement seat2 = driver.findElement(By.xpath("(//button[@class='seat sleeper'])[6]"));
		seat2.click();
	}
	
	
	public void boardingpt() {

		WebElement bp = driver.findElement(By.xpath("//p[text()='Madiwala']"));
		bp.click();
	}
	
	public void droppingpt() {
		WebElement dp = driver.findElement(By.xpath("//p[text()='Sriperumbudur']"));
		dp.click();
	}
	
	public void contbtn() {
		WebElement cont = driver.findElement(By.xpath("//button[@class='btn btn-shake filled primary md inactive button']"));
		cont.click();
	}
	
	public void skipbtn() {
		WebElement sbtn = driver.findElement(By.xpath("//a[text()='Skip']"));
		sbtn.click();
	}
	
	public void entername() {
		WebElement name = driver.findElement(By.xpath("//input[@placeholder='Name']"));
		name.click();
		name.sendKeys("Monisha");
	}
	
	public void enterage() {
		WebElement age = driver.findElement(By.xpath("//input[@placeholder='Age']"));
		age.click();
		age.sendKeys("22");
	}
	
	public void gender() {
		WebElement fe = driver.findElement(By.xpath("//button[text()='Female']"));
		fe.click();
	}
	
	public void mobnumber() {
		WebElement phnum = driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']"));
		phnum.click();
		phnum.sendKeys("8344598576");
	}
	public void email() {
		WebElement mail = driver.findElement(By.xpath("//input[@placeholder='Enter Email Address']"));
		mail.click();
		mail.sendKeys("mmonisha5577@gmail.com");
	}
	
	public void paybtn() {
		WebElement pay = driver.findElement(By.xpath("//div[@class='container card   md ']/button"));
		pay.click();
	}
	
	public void submitbtn() {
		WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(30));      
	    WebElement a = wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Proceed to pay']")));
	   
		//WebElement pay1 = driver.findElement(a);
		a.click();
	}

}

