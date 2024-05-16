package tC_Tricentis;

import java.io.IOException;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import wP_Tricentis.Tricentis;

public class Test_Tricentis extends Driver_Tricentis {

	@Test

	public void legalTest() throws IOException, InterruptedException {

		Tricentis t = new Tricentis(driver);
		
		t.clickDigitalDownload();
		t.screenshot();
		

		test = report.startTest("Test_CodeBeautify");
		test.log(LogStatus.PASS, "Test is pass");
		report.endTest(test);
		report.flush();
	}

}
