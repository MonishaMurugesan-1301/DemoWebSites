package day_3_Ksrtc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Sampl {
	
	 public static void main(String[] args) throws InterruptedException {

	WebDriver driver;
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	
	
	driver = new ChromeDriver(options);
//	driver = new ChromeDriver();
	
	driver.get("https://www.nobroker.in/");
	driver.manage().window().maximize();	

}
}
