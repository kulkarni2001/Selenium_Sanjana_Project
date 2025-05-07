package Basic_TestNg;

import java.sql.Time;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Working_with_Selenium {
	@Test
	public void selenium() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.selenium.dev/");
		driver.findElement(By.xpath("//span[text()='Downloads']")).click();
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
