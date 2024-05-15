package smpl;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class talentPg {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		
		driver.get("https://talent.capgemini.com/in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		WebElement global = driver.findElement(By.xpath("//li[@id='tab-global']/descendant::a"));
		global.click();
		
		driver.findElement(By.xpath("//div[@id='sub-nav-wrapper']/nav/ul/li[4]")).click();
		driver.findElement(By.xpath("//div[@id='6625570C-DE0B-0B90-4EED-7A7093558863']/span/a")).click();

		
	}
}
