package ExecutionTest2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Hotstar
{
		@Test
		public void hotstar() throws InterruptedException, IOException
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			driver.get("https://www.hotstar.com/");
			driver.findElement(By.xpath("//button[@data-testid='modal-close-button']")).click();
			
			WebElement ele = driver.findElement(By.xpath("//h2[text()='Top 10 in India Today - Hindi']"));
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", ele);
			driver.findElement(By.xpath("(//img[@alt='Kanneda'])[2]")).click();
			driver.findElement(By.xpath("//button[@aria-label='Add to watchlist']")).click();
//			driver.findElement(By.xpath("(//i[@class='icon-add soul-icon ON_IMAGE ICON_FONTSIZE_03'])[2]")).click();
			
			TakesScreenshot ts=(TakesScreenshot) driver;
			File temp = ts.getScreenshotAs(OutputType.FILE);
			File dest=new File("./Screenshots/hotstar.png");
			FileHandler.copy(temp,dest);
			Thread.sleep(2000);
			driver.quit();
			
		}
}

		