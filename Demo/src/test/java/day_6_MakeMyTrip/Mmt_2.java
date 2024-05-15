package day_6_MakeMyTrip;



	import java.time.Duration;
	import java.util.Iterator;
	import java.util.Set;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class Mmt_2 {

		public static void main(String[] args) throws InterruptedException {
			
			//initializing webDriver
					WebDriver driver;
				        System.setProperty("webdriver.chrome.driver", "C:\\Users\\monimuru\\Downloads\\ChPath\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

				        driver = new ChromeDriver();
				        driver.get("https://www.makemytrip.com");
			            driver.manage().window().maximize();
				        
				        driver.manage().deleteAllCookies();
				       
				      //driver.findElement(By.xpath("//div[@class='wrapper-outer']/div")).click();
				     
//				        try {
//				            WebElement adCloseButton = driver.findElement(By.xpath("//div[@class='wrapper']/div/a"));
//				            // If ad is present, click on the close button
//				            adCloseButton.click();
//				        } catch (Exception e) {
//				            // If ad is not present, continue with the flow
//				        }
				        
				       //login to website
				        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));		
						WebElement login = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[text()='Login or Create Account']")));
						login.click();       
				        Thread.sleep(3000);
				        
				     // Clicking on the "MyBiz Account" link
//				        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(30));		
//						WebElement Mybiz = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[text()='MyBiz Account']")));
//						Mybiz.click(); //div[@class='appendBottom25']/child::ul/li[2]
				      
				        driver.findElement(By.xpath("//div[@class='appendBottom25']/child::ul/li[2]")).click();
				        Thread.sleep(2000);
				        
				     // Entering email and password for login
				        driver.findElement(By.xpath("//input[@placeholder='Enter your work email id']")).sendKeys("monisha.murugesan@capgemini.com");	     
					    driver.findElement(By.xpath("//div[@class='makeFlex spaceBetween appendBottom10']/child::span")).click();
					    Thread.sleep(2000);
					    driver.findElement(By.xpath("//input[@placeholder='Enter a password']")).sendKeys("Monish@555");
					    driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
					    Thread.sleep(2000);
					    
					    // Clicking on the "Budget stays" menu
					    driver.findElement(By.xpath("//li[@class='menu_BudgetStays']")).click();
					    
					    // Getting the URL of the new page
					    String newPageUrl = driver.getCurrentUrl();
						System.out.println("New Page URL: " + newPageUrl);
						
						
						WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(30));		
						WebElement gotit = wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='OK GOT IT']")));
						gotit.click(); 
						Thread.sleep(3000);
						
//						WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(30));		
//						WebElement place = wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='hsw_inputBox selectHtlCity inactiveWidget activeWidget']/label")));
//						place.click();
						driver.findElement(By.xpath("//label[@for='city']")).click();
						Thread.sleep(2000);
						driver.findElement(By.xpath("//p[text()='Bengaluru']")).click();
						Thread.sleep(2000);
						
						driver.findElement(By.xpath("//input[@id='checkin']")).click();
						Thread.sleep(2000);
						
						WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(30));		
						WebElement date1 = wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@aria-label='Thu Mar 14 2024']")));
						date1.click();
						//driver.findElement(By.xpath("//div[@aria-label='Thu Mar 14 2024']")).click();
						Thread.sleep(2000);
						
						driver.findElement(By.xpath("//input[@id='checkout']")).click();
						Thread.sleep(2000);
						
						WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(30));		
						WebElement date2 = wait5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@aria-label='Fri Mar 15 2024']")));
						date2.click();
						
						//driver.findElement(By.xpath("//div[@aria-label='Fri Mar 15 2024']")).click();
						Thread.sleep(2000);
						
						driver.findElement(By.xpath("(//div[@class='gstSlctCont'])[1]/div")).click();
						Thread.sleep(2000);
						driver.findElement(By.xpath("//ul[@class='gstSlct__list']/child::li[5]")).click();
						Thread.sleep(2000);
						
						driver.findElement(By.xpath("(//div[@class='gstSlctCont'])[2]/div")).click();
						Thread.sleep(2000);
						driver.findElement(By.xpath("//ul[@class='gstSlct__list']/child::li[6]")).click();
						Thread.sleep(2000);
						
	//
//						driver.findElement(By.xpath("(//div[@class='gstSlctCont'])[3]/div")).click();
//						driver.findElement(By.xpath("//ul[@class='gstSlct__list']/child::li[4]")).click();
//						
//						 // Scrolling down the page
//						  ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 300)");
//						  
//						  
//					      driver.findElement(By.xpath("(//div[@class='gstSlctCont gstDrpDown__cont'])[1]")).click();
//					      Thread.sleep(2000);
//						  driver.findElement(By.xpath("(//span[@class='gstSlct__text'])[4]")).click();
//						  Thread.sleep(2000);
//						  
//						  driver.findElement(By.xpath("(//div[@class='gstSlctCont gstDrpDown__cont'])[2]")).click();
//					      Thread.sleep(2000);		      
//						  driver.findElement(By.xpath("//div[@class='rmsGst__slctAge']//child::div[2]/div//child::ul/li[4]")).click();
//						  Thread.sleep(2000);
//						  
//						  driver.findElement(By.xpath("(//div[@class='gstSlctCont gstDrpDown__cont'])[3]")).click();
//					      Thread.sleep(2000);
//						  driver.findElement(By.xpath("//div[@class='rmsGst__slctAge']//child::div[3]/div//child::ul/li[1]")).click();
//						  Thread.sleep(2000);
						  
					
						  driver.findElement(By.xpath("//button[text()='Apply']")).click();
						  Thread.sleep(2000);
						  driver.findElement(By.xpath("//div[@class='slctFareType']//child::ul/li[2]")).click();
						  Thread.sleep(2000);
						  driver.findElement(By.xpath("//div[@class='slctFareType']//child::ul/li[3]")).click();
						  Thread.sleep(2000);
						  
						  driver.findElement(By.xpath("//button[@id='hsw_search_button']")).click();
						  Thread.sleep(2000);
						  
						  driver.findElement(By.xpath("//span[text()='Golf Inn']")).click();
						  Thread.sleep(2000);
						  
						// Switching to the new window
						    String Parent_w = driver.getWindowHandle();
							  Set <String> set = driver.getWindowHandles();
							  Iterator <String> I = set.iterator();
							  while(I.hasNext()){
								  String Child_w = I.next();
								  if(!(Parent_w.equals(Child_w))) {
									  driver.switchTo().window(Child_w);
								  }
							  }
							  Thread.sleep(2000);
							  
							// Getting the URL of the new page
							    String crntPageUrl = driver.getCurrentUrl();
								System.out.println("New Page URL: " + crntPageUrl);
							  
							  driver.findElement(By.xpath("//span[@class='bookNowBtn ']")).click();
							  Thread.sleep(2000);
							
//							  driver.findElement(By.xpath("//button[@class='approveReq_btn']")).click();
//							  Thread.sleep(2000);
						  
							  String review =driver.findElement(By.xpath("//div[@class='rvHeader__inner']/p")).getText();
							  System.out.println(review);
							
		}

	}

