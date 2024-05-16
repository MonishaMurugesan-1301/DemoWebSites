package tC_4_NoBroker;

import org.testng.annotations.Test;

import wP_4_NoBroker.NoBroker_Page;

public class NoBroker_Test extends Driver_NoBroker{
	
	@Test
	
	public void PostyourProperty() throws InterruptedException {
		
		NoBroker_Page np = new NoBroker_Page(driver);
		
		np.Login();
		Thread.sleep(2000);
		
		np.MobileNumber();
		Thread.sleep(2000);
		
		np.Passwordbtn();
		Thread.sleep(2000);
		
		np.Password();
		Thread.sleep(3000);
		
		np.continuebtn();
		Thread.sleep(2000);
		
		np.PropertyOwner();
		Thread.sleep(2000);
		
		np.Sale();
		Thread.sleep(2000);
		
		np.scrollDown();
		Thread.sleep(2000);
		
		np.postnow();
		Thread.sleep(2000);
		
		np.scrollup();
		Thread.sleep(2000);
		
		np.city();
		Thread.sleep(2000);
		
		np.propertyType();
		Thread.sleep(2000);
		
		np.Resale();
		Thread.sleep(2000);
		
		np.postAd();
		Thread.sleep(2000);
		
		np.plotArea();
		Thread.sleep(2000);
		
		np.scrollDown2();
		Thread.sleep(2000);

		np.boundarybtn();
		Thread.sleep(2000);
		
		np.saveandcont();
		Thread.sleep(2000);
		
		np.locality();
		Thread.sleep(2000);
		
		np.landmark();
		Thread.sleep(2000);
		
		np.saveandcont2();
		Thread.sleep(2000);
		
		np.exprice();
		Thread.sleep(2000);
		
		np.calender();
		Thread.sleep(2000);
		
		np.saveandcont3();
		Thread.sleep(2000);
		
		np.saveandcont4();
		Thread.sleep(2000);
		
		np.saveandcont5();
		Thread.sleep(2000);
		
		np.saveandcont6();
		Thread.sleep(2000);
		
		np.clickButton(driver);
		Thread.sleep(2000);
		
		np.preview();
		Thread.sleep(2000);
		
	}

}
