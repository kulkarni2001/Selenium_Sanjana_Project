package Basic_TestNg;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Working_with_Hard {
	@Test
	public void hard() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com");
		@Nullable
		String title = driver.getTitle();
		
		Assert.assertEquals(title, "Facebook – log in or sign up");
		
//		Assert.assertNotEquals(title, "Facebook – log in or sign ");
//		Assert.assertNull(title);
//		Assert.assertNotNull(title);
		
		WebElement ele = driver.findElement(By.partialLinkText("Create new account"));
//		Assert.assertTrue(ele.isDisplayed());
//		Assert.assertFalse(ele.isDisplayed());
//		Assert.fail();
		ele.click();
		Thread.sleep(2000);
		
		driver.quit();
	}

}
