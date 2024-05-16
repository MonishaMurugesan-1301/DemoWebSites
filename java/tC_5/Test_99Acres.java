package tC_5;

import org.testng.annotations.Test;

import wP_5.TransactionPrice;

public class Test_99Acres extends DriverClass {

	@Test

	public void TestAcres() throws InterruptedException {

		TransactionPrice tp = new TransactionPrice(driver);

		tp.homepage();
	}
}
