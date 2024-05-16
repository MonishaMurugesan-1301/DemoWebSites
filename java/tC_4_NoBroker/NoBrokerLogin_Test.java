package tC_4_NoBroker;

import org.testng.annotations.Test;

import wP_4_NoBroker.Login_NoBroker;

public class NoBrokerLogin_Test extends Driver_NoBroker{
	// This test method verifies user login functionality
	@Test
	
	public void UserLogin() throws InterruptedException {
		
		Login_NoBroker lp = new Login_NoBroker(driver);
		// Perform login steps
		lp.Login();
		Thread.sleep(2000);
		
		lp.MobileNumber();
		Thread.sleep(2000);
		
		lp.Passwordbtn();
		Thread.sleep(2000);
		
		lp.Password();
		Thread.sleep(2000);
		
		lp.continuebtn();
		Thread.sleep(2000);
		
		
	}
	
	

}
