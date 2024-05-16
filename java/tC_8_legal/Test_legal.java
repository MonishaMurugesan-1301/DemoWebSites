package tC_8_legal;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import wP_8_legal.legalPage;

public class Test_legal extends Driver_legal {

	@Test

	public void legalTest() throws InterruptedException, AWTException, IOException {

		legalPage l = new legalPage(driver);

		l.clickHomeDoc();
		l.screenshot();

		test = report.startTest("Test_CodeBeautify");
		test.log(LogStatus.PASS, "Test is pass");
		report.endTest(test);
		report.flush();
	}

}
