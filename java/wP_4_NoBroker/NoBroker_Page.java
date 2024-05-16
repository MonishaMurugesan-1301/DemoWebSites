package wP_4_NoBroker;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NoBroker_Page {
	
	WebDriver driver;
	
	public NoBroker_Page(WebDriver driver) {
		this.driver = driver;
	}
	
	public void Login() {
		WebElement loginpath = driver.findElement(By.xpath("//div[@class='flex items-center']/div[2]"));
		loginpath.click();
	}
	
	public void MobileNumber() throws InterruptedException {
		WebElement phnum = driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']"));
		phnum.click();
		phnum.sendKeys("8610792699");
		Thread.sleep(2000);
		
	}
	public void Passwordbtn() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement pswdbtn  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='login-signup-form-login-radio-password']")));	
	
		//WebElement pswdbtn = driver.findElement(By.xpath("//input[@id='login-signup-form-login-radio-password']"));
		pswdbtn.click();
		//Thread.sleep(2000);
	}
	public void Password() throws InterruptedException {
		WebElement pswd1 = driver.findElement(By.xpath("//input[@id='login-signup-form__password-input']"));
		pswd1.click();
		Thread.sleep(3000);
		pswd1.sendKeys("moni3808");
		Thread.sleep(4000);
	}
	
	public void continuebtn() throws InterruptedException {
		WebElement cont = driver.findElement(By.xpath("//button[@id='signUpSubmit']"));
		cont.click();
		Thread.sleep(3000);
	}
	
	public void PropertyOwner() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement Prop  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='For Property owners']")));	
	//	WebElement Prop = driver.findElement(By.xpath("//div[@class='flex items-center tp:hidden']/div[1]/a/div/button/span"));
		Prop.click();
		Thread.sleep(3000);
	}
	
	public void Sale() throws InterruptedException {
		// Switching to the new window
	    String Parent_w = driver.getWindowHandle();
	    Set <String> set = driver.getWindowHandles();
	    Iterator <String> I = set.iterator();
	    while(I.hasNext()){
	        String Child_w = I.next();
	        if(!(Parent_w.equals(Child_w))) {
	            driver.switchTo().window(Child_w);
	        }
	        Thread.sleep(3000);
	    }
		WebElement salepath = driver.findElement(By.xpath("//div[@class='nb__33f3X']/div[3]"));
		salepath.click();
		Thread.sleep(2000);
	}
	
	public void scrollDown() {
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 400)");
    }
	public void postnow() throws InterruptedException {
		  WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
		  WebElement postbtn = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Post Now']")));
		//WebElement postbtn = driver.findElement(By.xpath("//button[text()='Post Now']"));
		postbtn.click();
	}

	public void scrollup() {
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -150)");
    }
	public void city() throws InterruptedException {
		
		 WebDriverWait waitO = new WebDriverWait(driver, Duration.ofSeconds(30));
		 WebElement citypath = waitO.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='css-151xaom-placeholder nb-select__placeholder']")));
		
	    //WebElement citypath = driver.findElement(By.xpath("//div[@class='css-151xaom-placeholder nb-select__placeholder']"));
	    citypath.click();
	    Thread.sleep(2000);
	    
	    WebDriverWait waitX = new WebDriverWait(driver, Duration.ofSeconds(40));
	    WebElement desiredCity = waitX.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='react-select-4-option-0']")));
	    desiredCity.click();
	    Thread.sleep(2000);
	}

	public void propertyType(){
		WebElement ptpath = driver.findElement(By.xpath("//div[@class='nb__3jjys']/div[3]"));
		ptpath.click();		
	}
	
	public void Resale() {
		WebElement respath = driver.findElement(By.xpath("//div[@class='nb__3fh0N']/div"));
		respath.click();	
	}
	public void postAd() throws InterruptedException {
		WebElement postpath = driver.findElement(By.xpath("//div[@class='nb__1891V']/button"));
		postpath.click();
		Thread.sleep(2000);
	}
	
	public void plotArea() throws InterruptedException {
		WebElement plot = driver.findElement(By.xpath("//input[@placeholder='Plot Area']"));
		plot.click();
		plot.sendKeys("500");
		Thread.sleep(2000);
	}
	
//		

	
	//div[@class='chat-3hDPX']/div/div/header/div/button[2]
	public void scrollDown2() {
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 200)");
    }
	public void boundarybtn() throws InterruptedException {
//		 WebDriverWait waitX = new WebDriverWait(driver, Duration.ofSeconds(30));
//		 WebElement bnd = waitX.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='flex items-center flex-1 justify-end relative bottom-0.2p'])[1]/input")));
		WebElement bnd = driver.findElement(By.xpath("(//div[@id='gated-security-toggle-input-field'])[1]/div[3]/div[1]/input"));
		bnd.click();//(//div[@class='nb__3-4zT'])[1]/child::div/div[3]/div[2]/input
		Thread.sleep(2000);
	}

	
	public void saveandcont() {
		WebElement save = driver.findElement(By.xpath("//button[@id='saveAndContinue']"));
		save.click();
	}
	public void locality() throws InterruptedException {
		WebElement area = driver.findElement(By.xpath("//input[@id='propertyLocality']"));
		area.click();
		Thread.sleep(2000);
		area.sendKeys("Brookfield");
		Thread.sleep(2000);
		area.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		area.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		
		
	}
	public void landmark() throws InterruptedException {
		WebElement lm = driver.findElement(By.xpath("//input[@id='street']"));
		lm.click();
		Thread.sleep(2000);
		lm.sendKeys("ITPL Main Road");
		Thread.sleep(2000);
//		lm.sendKeys(Keys.ARROW_DOWN);
//		Thread.sleep(2000);
//		lm.sendKeys(Keys.ENTER);
//		Thread.sleep(2000);
	}
	public void saveandcont2() throws InterruptedException {
		WebElement save2 = driver.findElement(By.xpath("//button[@id='saveAndContinue']"));
		save2.click();
		Thread.sleep(3000);
	}
	public void exprice() throws InterruptedException {
		WebElement prc = driver.findElement(By.xpath("//input[@placeholder='Enter Amount']"));
		prc.click();
		Thread.sleep(2000);
		prc.sendKeys("5000000");
		Thread.sleep(2000);
	}
	public void calender() throws InterruptedException {
		driver.findElement(By.xpath("//input[@placeholder='dd/mm/yyyy']")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@class='react-datepicker__navigation react-datepicker__navigation--next']")).click();
//		Thread.sleep(2000);
		WebElement date = driver.findElement(By.xpath("//div[@class='react-datepicker__month-container']/div[2]/div[5]/div[5]"));
		date.click();
		Thread.sleep(2000);
	}
	public void saveandcont3() throws InterruptedException {
		WebElement save3 = driver.findElement(By.xpath("//button[@id='saveAndContinue']"));
		save3.click();
		Thread.sleep(2000);
	}
	public void saveandcont4() throws InterruptedException {
		WebElement save4 = driver.findElement(By.xpath("//button[@id='saveAndContinue']"));
		save4.click();
		Thread.sleep(2000);
	}
	public void saveandcont5() throws InterruptedException {
		WebElement save5 = driver.findElement(By.xpath("//button[@id='saveAndContinue']"));
		save5.click();
		Thread.sleep(2000);
	}
	public void saveandcont6() throws InterruptedException {
		WebElement save6 = driver.findElement(By.xpath("//button[@id='saveAndContinue']"));
		save6.click();
		Thread.sleep(2000);
	}
	 public static void clickButton(WebDriver driver) {
	        // Switch to the iframe
	        WebElement iframe = driver.findElement(By.id("webWidget"));
	        driver.switchTo().frame(iframe);

	        // Find the button inside the iframe and click it
	        WebDriverWait waita = new WebDriverWait(driver, Duration.ofSeconds(30));
	        WebElement button = waita.until(ExpectedConditions.elementToBeClickable(By.tagName("button")));
	        button.click();

	        // Switch back to the default content
	        driver.switchTo().defaultContent();
	    }
	public void preview() throws InterruptedException {
		WebElement prev = driver.findElement(By.xpath("//div[@class='nb__1MJKU']/button"));
		prev.click();
		Thread.sleep(2000);
	}
	
	
}
