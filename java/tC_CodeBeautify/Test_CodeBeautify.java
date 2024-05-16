package tC_CodeBeautify;

import java.io.IOException;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import wP_7_CodeBeautify.CodeBeautify;

public class Test_CodeBeautify extends Driver_CodeBeautify{
	
	@Test 
	
	public void codeBeautifyTest() throws IOException {
		
		CodeBeautify cb = new CodeBeautify(driver);
		cb.ClickOnCalculator();
		
		test = report.startTest("Test_CodeBeautify");
		test.log(LogStatus.PASS, "Test is pass");
		report.endTest(test);
		report.flush();
		
	}

}
