package tC_4_NoBroker;

import org.testng.annotations.Test;

import wP_4_NoBroker.SellerPlan;

public class SellerPlan_Test extends NoBrokerLogin_Test {
	
	 // Test method to verify seller plan functionality
	@Test
	
	public void SellerTest() throws InterruptedException {
		
		 // Create an instance of SellerPlan class
		SellerPlan sp = new SellerPlan(driver);
		
		 // Perform seller plan related actions
		sp.menu();
		Thread.sleep(2000);
		
		sp.sellPlan();
		Thread.sleep(2000);
		
		sp.subscription();
		Thread.sleep(2000);
		
		sp.scrollDown();
		Thread.sleep(2000);
		
		sp.title();
		Thread.sleep(2000);
		
		sp.viewall();
		Thread.sleep(2000);
		
		sp.AllahabadBank();
		Thread.sleep(2000);
		
		sp.continuebtn();
		Thread.sleep(2000);
		
		sp.printamnt();
		Thread.sleep(2000);
		
		sp.MakePayment();
		Thread.sleep(2000);
		
		
	}

}
