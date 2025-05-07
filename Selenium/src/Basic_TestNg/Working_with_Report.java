package Basic_TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Working_with_Report {
	@Test
	public void demo() throws InterruptedException
	{
		System.out.println("Hello TestNg");
		Reporter.log("Hii");
		Reporter.log("Sanjana",false);
		Reporter.log("Kulkarni",true);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.flipkart.com");
		driver.findElement(By.name("q")).sendKeys("Vivo"+Keys.ENTER);
		Thread.sleep(2000);
		driver.quit();
	}

}
