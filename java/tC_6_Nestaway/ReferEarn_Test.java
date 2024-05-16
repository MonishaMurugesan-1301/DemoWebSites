package tC_6_Nestaway;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import wP_6_Nestaway.ReferEarn;

public class ReferEarn_Test extends Driver_Nestaway {

	@Test
	public void ReferAndEarn() throws InterruptedException {
		ReferEarn re = new ReferEarn(driver);
		re.refer();
		Thread.sleep(2000);
	}

	@Test(dataProvider = "getData")
	public void referTest(String name, String phnum, String frndname, String frndphnum, String location) throws InterruptedException, IOException {
		ReferEarn re = new ReferEarn(driver);
		re.invitefrnds(name, phnum, frndname, frndphnum, location);
		
		test = report.startTest("ReferEarn_Test");
		test.log(LogStatus.PASS, "Test is pass");
		report.endTest(test);
		report.flush();
	}

	@DataProvider
	public Object[][] getData() {
		String sheetname = "Sheet2";
		int rows = excel.getRowCount(sheetname);
		int cols = excel.getColumnCount(sheetname);

		Object[][] data = new Object[rows - 1][cols];

		for (int rowNum = 2; rowNum <= rows; rowNum++) {
			for (int colNum = 0; colNum < cols; colNum++) {
				data[rowNum - 2][colNum] = excel.getCellData(sheetname, colNum, rowNum);
			}
		}
		return data;
	
	
}
}
