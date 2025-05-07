package Basic_TestNg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Working_with_CrossBrowser {

	WebDriver driver;
	@Parameters({"browserName","url"})
	@Test
	public void cross(String browser,String webUrl) throws InterruptedException
	{
		if(browser.contains("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.contains("edge"))
		{
			driver=new EdgeDriver();
		}
		else if(browser.contains("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("Enter Valid Browser Name");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(webUrl);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.quit();
	}

}
