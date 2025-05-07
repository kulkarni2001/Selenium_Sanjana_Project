package Basic_TestNg;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Working_with_Soft {
	
	@Test
	public void soft() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.get("https://www.facebook.com");
		@Nullable
		String title = driver.getTitle();
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(title, "Facebook – log in or sign up");
//		sa.assertNotEquals(title, "Facebook – log in or sign ");
//		sa.assertNull(title);
//		sa.assertNotNull(title);
		WebElement ele = driver.findElement(By.partialLinkText("Create new account"));
//		sa.assertTrue(ele.isDisplayed());
//		sa.assertFalse(ele.isDisplayed());
		ele.click();
		sa.assertAll();
		Thread.sleep(2000);
		driver.quit();
	}
}
