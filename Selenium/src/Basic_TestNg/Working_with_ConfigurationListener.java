package Basic_TestNg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Working_with_ConfigurationListener {
	
	WebDriver driver;
	static WebDriver sDriver;
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("@BeforeSuite");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("@BeforeTest");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("@BeforeClass");
		
		String browser="chrome";
		if(browser.contains("chrome"))
		{
			driver=new ChromeDriver();
		}else if(browser.contains("edge"))
		{
			driver=new EdgeDriver();
		}else if(browser.contains("firefox"))
		{
			driver=new FirefoxDriver();
		}else {
			System.out.println("Please Enter Valid Browser Name");
		}
		
		sDriver=driver;
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.flipkart.com");
		
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("@BeforeMethod");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("@AfterMethod");
	}
	@AfterClass
	public void afterClass() throws InterruptedException
	{
		System.out.println("@AfterClass");
		Thread.sleep(3000);
		driver.quit();
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("@AfterTest");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("@AfterSuite");
	}
	

}
