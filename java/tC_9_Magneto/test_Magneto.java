package tC_9_Magneto;

import org.testng.annotations.Test;

import wP_9_Magneto.homepage_Magneto;

public class test_Magneto extends Driver_Magneto {
	
	@Test
	
	public void MagnetoTest(){

		homepage_Magneto hm = new homepage_Magneto(driver);
		hm.sectionMen();
		
	}
	
	

}
