package tC_2_AbhiBus;

import org.testng.annotations.Test;

import wP_2_AbhiBus.AbhiBus_Offers;

public class AbhiBus_Offers_Test extends Driver_AbhiBus {
	
	@Test
	public void OffersTest() throws InterruptedException {
		
		
		AbhiBus_Offers a = new AbhiBus_Offers(driver);
		a.clickOffers();
		Thread.sleep(3000);
		
		a.pageUrl();
		Thread.sleep(2000);
	
		a.FromStation();
		Thread.sleep(2000);
		
		a.ToStation();
		Thread.sleep(2000);
		
		a.selectdate();
		Thread.sleep(2000);
		
		a.searchbtn();
		Thread.sleep(2000);
		
		a.scrollDown();
		Thread.sleep(2000);
		
		a.pickbus();
		Thread.sleep(3000);
		
		a.policy();
		Thread.sleep(2000);
		
		a.seats();
		Thread.sleep(2000);
		
		a.seatbooking();
		Thread.sleep(2000);
		a.boardingpt();
		Thread.sleep(2000);
		
		a.droppingpt();
		Thread.sleep(2000);
		a.contbtn();
		Thread.sleep(2000);
		
		a.skipbtn();
		Thread.sleep(2000);
		
		a.entername();
		Thread.sleep(2000);
		
		a.enterage();
		Thread.sleep(2000);

		a.gender();
		Thread.sleep(2000);

		a.mobnumber();
		Thread.sleep(2000);

		a.email();
		Thread.sleep(2000);

		a.paybtn();
		Thread.sleep(2000);
		
		a.submitbtn();
		Thread.sleep(2000);

	}
	
}
