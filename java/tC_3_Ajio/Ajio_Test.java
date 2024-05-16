package tC_3_Ajio;

import org.testng.annotations.Test;

import wP_3_Ajio.AjioPage;

public class Ajio_Test extends Driver_Ajio {
	
	@Test
	public void serviceTest() throws InterruptedException {
		
		AjioPage ap = new AjioPage(driver);
		ap.clickServices();
		Thread.sleep(2000);
		
		ap.clicklink();
		Thread.sleep(2000);
		
		ap.clickIndianStores();
		Thread.sleep(2000);
		
		ap.scrollDown();
		Thread.sleep(2000);
		
		ap.onlinestore();
		Thread.sleep(2000);
		
		ap.amazon();
		Thread.sleep(2000);
		
		ap.todaysdeal();
		Thread.sleep(2000);
	}
	

}
