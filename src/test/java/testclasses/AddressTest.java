package testclasses;

import org.testng.annotations.Test;

import extentlisteners.TestNGListeners;

public class AddressTest extends TestNGListeners {

	@Test(priority = 5)
	public void enterAddress()
	{
		addresspage.addNewAddress();
		
		test.info("New Address Added Sucessfully");
	}

}
