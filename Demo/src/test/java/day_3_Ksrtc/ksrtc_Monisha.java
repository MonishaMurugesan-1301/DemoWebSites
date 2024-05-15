package day_3_Ksrtc;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ksrtc_Monisha {

    public static void main(String[] args) throws InterruptedException {

        // Initialize WebDriver
        WebDriver driver;
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\monimuru\\Downloads\\ChPath\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("https://www.ksrtc.in/oprs-web");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        // Click on the login link
        WebElement login = driver.findElement(By.xpath("//a[@href='/oprs-web/login/show.do']"));
        login.click();
        Thread.sleep(2000);

        // Enter username
        driver.findElement(By.id("userName")).sendKeys("monisha.murugesan@capgemini.com");
        Thread.sleep(2000);

        // Enter password
        driver.findElement(By.id("password")).sendKeys("Monish@555");
        Thread.sleep(2000);

        // Click on the Terms and Conditions checkbox
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementById('TermsConditions').checked = true;");
        Thread.sleep(2000);

        // Click on the submit button
        WebElement smtbtn = driver.findElement(By.id("submitBtn"));
        smtbtn.click();
        Thread.sleep(2000);

        // Click on "Mitra"
        WebElement mitra = driver.findElement(By.xpath("//div[@class='main-frs']/child::ul/li[2]"));
        mitra.click();
        Thread.sleep(2000);

        // Get the URL of the new page
        String newPageUrl = driver.getCurrentUrl();
        System.out.println("New Page URL: " + newPageUrl);
        Thread.sleep(2000);

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
        
        String parent = driver.getWindowHandle();
        Set<String> s = driver.getWindowHandles();
        Iterator<String> i = s.iterator();
        while(i.hasNext()) {
        	String child = i.next();
        	if(!parent.equals(child)) {
        		driver.switchTo().window(child);
        	}
        }

        // Click on the "English" link
        WebElement eng = driver.findElement(By.xpath("//a[text()='English']"));
        eng.click();

        // Click on "Contact Us"
        WebElement contact = driver.findElement(By.xpath("//a[@title='Contact Us']/span"));
        contact.click();
        Thread.sleep(2000);

        // Click on "Reach Us"
        WebElement reach = driver.findElement(By.xpath("//a[@title='Reach Us']/span"));
        reach.click();

        // Print the contact numbers
        WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(30));
        List<WebElement> productNameElements = wait5.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='contr']")));

        for (WebElement productNameElement : productNameElements) {
            String productName = productNameElement.getText();
            System.out.println("Contact numbers: " + productName);
        }
        Thread.sleep(2000);

        // Scroll the page to bring the scroll button into view
        JavascriptExecutor js3 = (JavascriptExecutor) driver;
        js3.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        // Click on the scroll top button
        WebElement scrlTop = driver.findElement(By.xpath("//a[@id='top']"));
        scrlTop.click();
        System.out.println("Scroll back to top");
        
        //close the browser
        driver.quit();
    }

}

