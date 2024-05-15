package smpl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class workout {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		
	}

}
