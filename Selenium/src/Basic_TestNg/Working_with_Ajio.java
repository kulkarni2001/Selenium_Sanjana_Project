package Basic_TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Working_with_Ajio {
	@Test
	public void ajio() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.get("https://www.ajio.com/");
		driver.findElement(By.name("searchVal")).sendKeys("jeans"+Keys.ENTER);
		Thread.sleep(2000);
		driver.quit();
	}

}
