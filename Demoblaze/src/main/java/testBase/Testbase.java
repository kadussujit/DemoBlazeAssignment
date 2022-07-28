package testBase;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageLayer.Homepage;
import pageLayer.MyCart;
import utility.UtilClass;

public class Testbase {
	
	public static WebDriver driver;
	public static Logger logger;
	
	public Homepage home;
	public UtilClass util;
	public MyCart cart;
	
	@BeforeClass
	public void start() {
		logger = Logger.getLogger("Demoblaze Framework");
		PropertyConfigurator.configure("log4j.properties");
		logger.info("Framework Execution Started");
	}
	
	@AfterClass
	public void stop() {
		logger.info("Framework Execution stopped");
	}
	
	@BeforeMethod
	public void setUp() {
		
		String br = "chrome";
		
		if(br.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			logger.info("Chrome Browser Launched");
		}
		else if(br.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			logger.info("Firefox Browser Launched");
		}
		else if(br.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			logger.info("Edge Browser Launched");
		}
		else
		{
			System.out.println("Enter correct browser name");
		}
		
		driver.get("https://demoblaze.com/");
		logger.info("Website Launched");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		logger.info("Implicitly wait provided");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		home = new Homepage();
		util = new UtilClass();
		cart = new MyCart();
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		logger.info("Chrome Browser closed.");
	}

}
