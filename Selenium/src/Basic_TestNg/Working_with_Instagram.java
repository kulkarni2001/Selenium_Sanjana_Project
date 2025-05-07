package Basic_TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Working_with_Instagram {
	@Test
	public void instagram() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.get("https://www.instagram.com/");
		driver.findElement(By.name("username")).sendKeys("sanjana@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Sanjana");
		
		Thread.sleep(2000);
		driver.quit();
	}

}
