package pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.Testbase;

public class Homepage extends Testbase{
	
	public Homepage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//click on login link
	@FindBy(xpath="//a[@id='login2']")
	private WebElement login;
	
	public void clickOnLogin() {
		login.click();
	}
	
	//enter username
	@FindBy(xpath="//input[@id='loginusername']")
	private WebElement username;
	
	public void enterUsername() {
		username.sendKeys("sctqaautomation@grr.la");
	}
	
	//enter password
	@FindBy(xpath="//input[@id='loginpassword']")
	private WebElement password;
	
	public void enterPassword() {
		password.sendKeys("Spring@123");
	}
	
	//click on login button
	@FindBy(xpath="//button[contains(text(),'Log in')]")
	private WebElement login_btn;
	
	public void clickOnLoginButton() {
		login_btn.click();
		logger.info("Logged In with credentials");
	}

	//click on phones
	@FindBy(xpath="//a[contains(text(),'Phones')]")
	private WebElement phones;
	
	public void clickOnPhones() {
		try{
			phones.click();
		}
		catch(Exception e)
		{
			WebElement phone = driver.findElement(By.xpath("//a[contains(text(),'Phones')]"));
			phone.click();
		}
	}
	
	//click on Laptops
	@FindBy(xpath="//a[contains(text(),'Laptops')]")
	private WebElement laptops;
	
	public void clickOnLaptops() {
		laptops.click();
	}
	
	//click on Monitors
	@FindBy(xpath="//a[contains(text(),'Monitors')]")
	private WebElement monitors;
	
	public void clickOnMonitors() {
		monitors.click();
	}
	
	//click on Samasng Galaxy s6
	@FindBy(xpath="//a[contains(text(),'Samsung galaxy s6')]")
	private WebElement samsung_galaxy_s6;
	
	public void clickOnSamsungGalaxyS6() {
		samsung_galaxy_s6.click();
	}
	
	//click on Dell i7 8 GB
	@FindBy(xpath="//a[contains(text(),'Dell i7 8gb')]")
	private WebElement dell_i7_8gb;
	
	public void clickOnDell_i7_8GB() {
		dell_i7_8gb.click();
	}
	
	//click on Asus Full HD monitor
	@FindBy(xpath="//a[contains(text(),'ASUS Full HD')]")
	private WebElement asus_full_HD;
	
	public void clickOnAsusFullHD() {
		asus_full_HD.click();
	}
	
	//click on Home
	@FindBy(xpath="//a[@class='nav-link']")
	private WebElement home_menu;
	
	public void clickOnHome() {
		home_menu.click();
	}
	
	//click on Cart
	@FindBy(xpath="//a[@id='cartur']")
	private WebElement cart;
	
	public void clickOnCart() {
		cart.click();
	}
	
	
}
