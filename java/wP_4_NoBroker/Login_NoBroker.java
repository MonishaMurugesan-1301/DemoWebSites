package wP_4_NoBroker;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_NoBroker {
    
    WebDriver driver;
    
    // Constructor to initialize WebDriver
    public Login_NoBroker(WebDriver driver) {
        this.driver = driver;
    }
    
    // Method to perform login action
    public void Login() {
        // Find and click on the login element
        WebElement loginpath = driver.findElement(By.xpath("//div[@class='flex items-center']/div[2]"));
        loginpath.click();
    }
    
    // Method to input mobile number
    public void MobileNumber() throws InterruptedException {
        // Find the mobile number input field
        WebElement phnum = driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']"));
        phnum.click(); // Click on the input field
        phnum.sendKeys("8610792699"); // Input the mobile number
        Thread.sleep(2000); // Wait for 2 seconds
    }
    
    // Method to select password option
    public void Passwordbtn() throws InterruptedException {
        // Initialize WebDriverWait to wait for an element to be visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        // Wait until the password radio button is visible
        WebElement pswdbtn  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='login-signup-form-login-radio-password']")));  
        pswdbtn.click(); // Click on the password radio button
    }
    
    // Method to input password
    public void Password() throws InterruptedException {
        // Find the password input field
        WebElement pswd1 = driver.findElement(By.xpath("//input[@id='login-signup-form__password-input']"));
        pswd1.click(); // Click on the password input field
        Thread.sleep(3000); // Wait for 3 seconds
        pswd1.sendKeys("moni3808"); // Input the password
        Thread.sleep(4000); // Wait for 4 seconds
    }
    
    // Method to click on the continue button
    public void continuebtn() throws InterruptedException {
        // Find and click on the continue button
        WebElement cont = driver.findElement(By.xpath("//button[@id='signUpSubmit']"));
        cont.click(); // Click on the continue button
        Thread.sleep(3000); // Wait for 3 seconds
    }

}
