package tC_6_Nestaway;

import java.io.IOException;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import wP_6_Nestaway.ReferEarn;

public class Test_ReferAndEarn extends Driver_Nestaway {
	
	@Test
	public void ReferAndEarn() throws InterruptedException, IOException {
		ReferEarn re = new ReferEarn(driver);
		re.refer();
		Thread.sleep(2000);
		
//		re.invitefrnds();
		Thread.sleep(2000);
		
		test = report.startTest("Tge_Test");
		test.log(LogStatus.PASS, "Test is pass");
		report.endTest(test);
		report.flush();
	}
	

}
