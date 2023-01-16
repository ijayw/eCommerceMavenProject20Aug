package testclasses;

import org.testng.annotations.Test;

import extentlisteners.TestNGListeners;

public class BuyProductTest extends TestNGListeners{
	
	@Test(priority = 4)
	public void verifyAddToCart()
	{
		buyproduct.BuyNow();
		
		test.info("Product added into the cart successfully");
	}

}