package Tollge_Test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Tollge_webpage.Tollge_login;

public class Tge_Test extends Tollge_Driver {
	
	@Test
	
	public void TollgeLoginTest() throws InterruptedException, IOException {
		
		Tollge_login tl = new Tollge_login(driver);
		
		tl.login();
		
		tl.enquiry();
		
		tl.search();
		
		test = report.startTest("Tge_Test");
		test.log(LogStatus.PASS, "Test is pass");
		report.endTest(test);
		report.flush();
		
		
	}
		
}

