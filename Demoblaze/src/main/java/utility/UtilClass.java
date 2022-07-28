package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testBase.Testbase;

public class UtilClass extends Testbase {

	public UtilClass() {
		PageFactory.initElements(driver, this);
	}

	// Click on Add to cart
	@FindBy(xpath = "//a[contains(text(),'Add to cart')]")
	private WebElement add_to_cart;

	public void clickOnAddToCart() {
		add_to_cart.click();
	}

	// wait for alert to appear

	public void waitForAlert() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
	}
	
	public static void takeSS(String filename)
	{
		String path = "C:\\Users\\SUJIT\\eclipse-workspace\\Demoblaze\\Screenshots\\";
		
		
		try {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File(path+filename+System.currentTimeMillis()+".png");
			FileHandler.copy(src, dest);
		} 
		catch (IOException e) {

			System.out.println("File path is incorrect");
		}
		
	}

}
