package testLayer;

import org.testng.annotations.Test;
import testBase.Testbase;

public class TestCase extends Testbase{
	
	@Test
	public void TC01() {
				
		home.clickOnLogin();
		home.enterUsername();
		home.enterPassword();
		home.clickOnLoginButton();
		home.clickOnPhones();
		home.clickOnSamsungGalaxyS6();
		util.clickOnAddToCart();
		util.waitForAlert();
		home.clickOnHome();
		home.clickOnLaptops();
		home.clickOnDell_i7_8GB();
		util.clickOnAddToCart();
		util.waitForAlert();
		home.clickOnHome();
		home.clickOnMonitors();
		home.clickOnAsusFullHD();
		util.clickOnAddToCart();
		util.waitForAlert();
		home.clickOnCart();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		cart.costOfProductsAscendingOrder();
		cart.clickOnPlaceOrder();
		cart.enterOrderName("Sujit");
		cart.enterCountry("India");
		cart.enterCity("Pune");
		cart.enterCreditCardNumber("1234567890");
		cart.enterCreditCardExpiryMonth("6");
		cart.enterCreditCardExpiryYear("2022");
		cart.clickOnPurchase();
		cart.printOrderDetails();
	}

}
