package webPages;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Method to scroll down the page
	public void scrollDown() {
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 800)");
    }
	
	public void closebtn(){
		WebElement cls = driver.findElement(By.xpath("//div[@id='splashscreen-container']//child::span//img"));
		cls.click();
	}

	// Method to click the "Next" link
	public void clickNext() {
		By nxt = By.xpath("//div[@id='toolCenter']//child::div/div[3]/ul/li[2]/a");
		WebElement nxtbtn = driver.findElement(nxt);
		nxtbtn.click();
	}
	
	// Method to enter username
	public void enterUsername(String username) {
		
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

        //User should be able to enter the username.

		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement usernameField  = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='username']//child::input")));
       
        usernameField.click();
        usernameField.sendKeys(username);
    }
   	
	//Method to click continue button
	 public void clickContiButton1() {
		 By contBtn = By.id("continueBtn");
		 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(30));
			WebElement continuebtn1 = wait2.until(ExpectedConditions.visibilityOfElementLocated(contBtn));
	        continuebtn1.click();
	    }

	 // Method to click the login using password
	 public void passwordLogin() {
		 WebElement loginbtn = driver.findElement(By.xpath("//form[@id='loginForm']//child::section/div/button"));
		 loginbtn.click();
	 }
	 
	// Method to enter password
    public void enterPassword(String password) {

    	By pswdinput = By.xpath("//input[@id='current-password']");
        WebElement passwordField = driver.findElement(pswdinput);
        passwordField.click();
        passwordField.sendKeys(password);
    }
    
    
    public void scrollDownA() {
    	 ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 200)");		
	}

    //Method to continue btn
    public void clickContiButton2() {
    	 By contBtn = By.id("continueBtn");
    	 
        WebElement continuebtn2 = driver.findElement(contBtn);
        continuebtn2.click();
    }
  
 // Method to click on the "Featured" button
    public void clickonFeatured() {
   	 By ftrBtn = By.xpath("//a[text()=' Featured ']");
   	 WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(30));
   	 WebElement FeaturedBtn = wait3.until(ExpectedConditions.visibilityOfElementLocated(ftrBtn));
     FeaturedBtn.click();
     
   }
    
    // Method to print the text of a heading element
    public void printText() {
    	By text = By.xpath("//h1[text()=' BE FUTURE READY! ']");
    	WebElement text1 = driver.findElement(text);
    	String Txt = text1.getText();
    	System.out.println("Heading 1 : "+ Txt);
    }
    
    // Method to scroll down the page
    public void scrollDown2() {
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 300)");
    }
    
    // Method to click on a link sustainability campus
    public void SustainabilityCampus() {
    	By title = By.xpath("//a[@title='SUSTAINABILITY CAMPUS']");
    	WebElement link = driver.findElement(title);
    	link.click();
    }
    
    // Method to print the text of a heading element
    public void printText2() {
    	By text2 = By.xpath("(//div[@class='guts-p-full-0 grid__col-12'])[1]//child::h2");
    	
    	 WebDriverWait waitX = new WebDriverWait(driver, Duration.ofSeconds(30));
       	 WebElement text3 = waitX.until(ExpectedConditions.visibilityOfElementLocated(text2));
    	 String Txt1 = text3.getText();
    	 System.out.println("Heading 2 : "+ Txt1);
    }
    
    // Method to scroll down the page
    public void scrollDown3() {
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 1600)");
    }
    
    
    // Method to click on an image
    public void sustImg() {
    	By title1 = By.xpath("//img[@alt='Sustainability Globe Awareness Module']");
    	WebElement link2 = driver.findElement(title1);
    	link2.click();
    }
    
    public void pageUrl() {
   	 String newPageUrl = driver.getCurrentUrl();
   		System.out.println("New Page URL: " + newPageUrl);
   	 }
    
    // Method to switch windows and print the text of a heading element
     public void module() {
    	// Handle window switching
         String Parent_Window = driver.getWindowHandle();
         Set <String> st = driver.getWindowHandles();
         Iterator <String> It = st.iterator();
         while(It.hasNext()){
             String Child_Window = It.next();
             if(!(Parent_Window.equals(Child_Window))) {
                 driver.switchTo().window(Child_Window);
             }
         }
     }
        
     public void NewpageUrl() {
            String newPageUrl = driver.getCurrentUrl();
           	System.out.println("New Page URL 2: " + newPageUrl);
          }
     
     public void scrollDown4() {
         ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 200)");
     }
    
     public void startbtn() {
    	//WebDriverWait waitV = new WebDriverWait(driver, Duration.ofSeconds(20));
  	    driver.findElement(By.xpath("//div[@class='pane-content']//descendant::li[3]/a")).click();
    //	WebElement start = driver.findElement(By.xpath("//button[text()='Start']"));//div[@id='primaryActSection']//child::div[2]/button
       // start.click();
       }
}


