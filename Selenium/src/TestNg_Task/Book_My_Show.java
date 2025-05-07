package TestNg_Task;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Book_My_Show {

	@Test
	public void bookmyshow() throws InterruptedException, AWTException {
		 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.get("https://in.bookmyshow.com/");
		driver.findElement(By.xpath("//input[@placeholder='Search for your city']")).sendKeys("solapur");
	//	driver.findElement(By.xpath("//div/div/div/ul/li[1]/span/strong")).click();
		driver.findElement(By.xpath("//span[contains(@class,'flGQbT')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Thalapathy is the G.O.A.T.']")).click();
		driver.findElement(By.xpath("//div[text()='Share']")).click();
		driver.findElement(By.xpath("//section[contains(@class,'fsqEqw')]")).click();
//		Robot r=new Robot();
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_SHIFT);
//		r.keyPress(KeyEvent.VK_N);
//		r.keyRelease(KeyEvent.VK_SHIFT);
//		Thread.sleep(2000);
//		r.keyPress(KeyEvent.VK_A);
//		r.keyPress(KeyEvent.VK_V);
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}

