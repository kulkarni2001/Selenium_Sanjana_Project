package ExecutionTest2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Jio
{
	@Test
	public void jio() throws InterruptedException, AWTException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jio.com/");
		driver.findElement(By.xpath("//div[text()='Business']")).click();
		driver.findElement(By.linkText("Services")).click();
		driver.findElement(By.xpath("(//a[text()='Mobile'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//h3[text()='Jio True 5G'])[2]")).click();
		
		WebElement ele = driver.findElement(By.xpath("//div[@class='css-1t62fsj j-container l-layout--max-width']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		WebElement ele2 = driver.findElement(By.xpath("//div[@class='css-1wnex0y']"));
		ele2.click();
		driver.findElement(By.xpath("//div[@class='css-1wnex0y']")).click();
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(500);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(500);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(500);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(500);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(500);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		Thread.sleep(3000);
		driver.quit();			
		
		
	}

}
