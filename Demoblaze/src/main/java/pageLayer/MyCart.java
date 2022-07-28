package pageLayer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import testBase.Testbase;

public class MyCart extends Testbase {

	public MyCart() {
		PageFactory.initElements(driver, this);
	}

	public void costOfProductsAscendingOrder() {
		List<WebElement> data = driver.findElements(By.xpath("//tbody//tr//td[3]"));
		List<Integer> data1 = new ArrayList<>();
		for(WebElement a : data)
		{
			data1.add(Integer.valueOf(a.getText()));
		}
		Collections.sort(data1);
		System.out.println(data1);
		
		int a = data1.get(0);
		int b = data1.get(1);
		int c = data1.get(2);
		int result = a+b+c;
		String s = Integer.toString(result);
		Assert.assertEquals(s, "1290");
	}
	
	// Click on place order button
	@FindBy(xpath = "//button[contains(text(),'Place Order')]")
	private WebElement place_order_btn;

	public void clickOnPlaceOrder() {
		place_order_btn.click();
	}

	// Enter name in placeorder form
	@FindBy(xpath = "//input[@id='name']")
	private WebElement order_name;

	public void enterOrderName(String name) {
		order_name.sendKeys(name);
	}

	// Enter country in placeorder form
	@FindBy(xpath = "//input[@id='country']")
	private WebElement order_country;

	public void enterCountry(String country) {
		order_country.sendKeys(country);
	}

	// Enter city in placeorder form
	@FindBy(xpath = "//input[@id='city']")
	private WebElement order_city;

	public void enterCity(String city) {
		order_city.sendKeys(city);
	}

	// Enter credit card details in placeorder form
	@FindBy(xpath = "//input[@id='card']")
	private WebElement credit_card_number;

	public void enterCreditCardNumber(String cc_number) {
		credit_card_number.sendKeys(cc_number);
	}

	// Enter credit card expiry month
	@FindBy(xpath = "//input[@id='month']")
	private WebElement credit_card_expiry_month;

	public void enterCreditCardExpiryMonth(String month) {
		credit_card_expiry_month.sendKeys(month);
	}

	// Enter credit card expiry year
	@FindBy(xpath = "//input[@id='year']")
	private WebElement credit_card_expiry_year;

	public void enterCreditCardExpiryYear(String year) {
		credit_card_expiry_year.sendKeys(year);
	}

	// click on Purchase
	@FindBy(xpath = "//button[contains(text(),'Purchase')]")
	private WebElement purchase;

	public void clickOnPurchase() {
		purchase.click();
		logger.info("Product/s ordered succeessfully");
	}

	// purchase popup
	@FindBy(xpath = "//body/div[10]/p[1]")
	private WebElement order_details;

	public void printOrderDetails() {
		System.out.println("Order details:");
		String text = order_details.getText();
		System.out.println(text);
	}

}
