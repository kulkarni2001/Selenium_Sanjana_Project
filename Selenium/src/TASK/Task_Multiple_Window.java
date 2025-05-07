package TASK;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_Multiple_Window {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://web.whatsapp.com/");
		String id = driver.getWindowHandle();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_T);
		Thread.sleep(2000);
		
		Set<String> ids = driver.getWindowHandles();
		for(String string:ids)
		{
			driver.switchTo().window(string);
		}
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		
		r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_T);
		Thread.sleep(2000);
		ids = driver.getWindowHandles();
		for(String string:ids)
		{
			driver.switchTo().window(string);
		}
		driver.get("https://www.flipkart.com");
	    Thread.sleep(2000);
		
		r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_T);
		Thread.sleep(2000);
		ids = driver.getWindowHandles();
		for(String string:ids)
		{
			driver.switchTo().window(string);
		}
		driver.get("https://www.youtube.com");
		
		driver.switchTo().window(id);
		driver.close();
		Thread.sleep(2000);
		driver.quit();
		//	js.executeScript("window.open('https://www.amazon.in')");
		}
		

	}


