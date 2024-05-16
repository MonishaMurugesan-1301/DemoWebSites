package tC_8_legal;

import java.io.IOException;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import wP_8_legal.Address;



public class Test_address extends Driver_legal {

	@Test

	public void addresstest() throws InterruptedException, IOException  {
		
		Address a = new Address(driver);
		a.addressChange();
		a.screenshot();
		
		test = report.startTest("Test_CodeBeautify");
		test.log(LogStatus.PASS, "Test is pass");
		report.endTest(test);
		report.flush();
	}
}
