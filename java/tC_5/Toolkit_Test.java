package tC_5;

import org.testng.annotations.Test;

import wP_5.Toolkit;

public class Toolkit_Test extends DriverClass {

	@Test

	public void TestToolkit() {

		Toolkit t = new Toolkit(driver);

		t.homepage();

	}

}
