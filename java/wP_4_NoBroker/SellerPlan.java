package wP_4_NoBroker;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SellerPlan extends Login_NoBroker {

    public SellerPlan(WebDriver driver) {
        super(driver);
    }

    // Method to click on the menu button
    public void menu() {
        WebElement menubtn = driver.findElement(By.xpath("//div[text()='Menu']"));
        menubtn.click();
    }

    // Method to click on the seller plan button
    public void sellPlan() {
        WebElement spbtn = driver.findElement(By.xpath("//div[@id='main-menu']/div[2]/a[10]"));
        spbtn.click();
    }

    // Method to click on the subscription button
    public void subscription() {
        WebElement subsbtn = driver.findElement(By.xpath("//div[@class='nb__1mPKH']/div[3]/div/div[4]/button/span"));
        subsbtn.click();
    }

    // Method to scroll down the page
    public void scrollDown() {
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 300)");
    }

    // Method to get the title text and print it
    public void title() throws InterruptedException {
        WebElement titlebar = driver.findElement(By.xpath("(//div[@class='d-flex jc-space-between card-title-container'])[3]/child::div[1]"));
        String Text = titlebar.getText();
        System.out.println("payment method: " + Text);
        Thread.sleep(2000);
    }

    // Method to click on the view all button
    public void viewall() throws InterruptedException {
        WebElement viewbtn = driver.findElement(By.xpath("(//div[@class='d-flex jc-space-between card-title-container'])[3]/child::div[2]"));
        viewbtn.click();
        Thread.sleep(2000);
    }

    // Method to select Allahabad Bank
    public void AllahabadBank() {
        WebElement bank = driver.findElement(By.xpath("//div[@class='content-container ']/div[3]/div[13]/div[3]"));
        bank.click();
    }

    // Method to click on the continue button
    public void continuebtn() throws InterruptedException {
        WebElement cont = driver.findElement(By.xpath("//div[@class='single-form-input']/button"));
        cont.click();
        Thread.sleep(2000);
    }

    // Method to get the amount text and print it
    public void printamnt() throws InterruptedException {
        WebElement amount = driver.findElement(By.xpath("(//div[@class='d-flex jc-space-between semi-bold fs-18 mb-0'])[2]"));
        String Textprint = amount.getText();
        System.out.println("Total: " + Textprint);
        Thread.sleep(2000);
    }

    // Method to click on the make payment button
    public void MakePayment() {
        WebElement paybtn = driver.findElement(By.xpath("//button[text()='Make Payment']"));
        paybtn.click();
    }
}
