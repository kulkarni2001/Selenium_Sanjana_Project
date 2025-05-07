package TASK;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import Popups.JavaScript_Popup;

public class Task_Myntra {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.myntra.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='desktop-navLink'])[2]")).click();
		Thread.sleep(100);
		driver.findElement(By.xpath("//a[text()='Ethnic Wear']")).click();
		Thread.sleep(3000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_TAB);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='categories-list']/li[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='categories-list']/li[3]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='brand-list']/li[5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='brand-list']/li[7]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//li[@class='colour-listItem'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//li[@class='colour-listItem'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='80% and above']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//h3[text()='Vishudh']")).click();
		//driver.findElement(By.id("32611567")).click();
		driver.findElement(By.xpath("//ul[@class='results-base']/li/a[1]")).click();
		Thread.sleep(2000);
		
		Set<String> ids = driver.getWindowHandles();
		for(String str:ids)
		{
			driver.switchTo().window(str);
		}
	//	driver.findElement(By.xpath("//h3[text()='Vishudh']")).click()
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//p[@class='size-buttons-unified-size'])[4]")).click();
		driver.findElement(By.xpath("//div[contains(@class,'pdp-add-to-bag pdp-button pdp-flex pdp-center')]")).click();
		
		Thread.sleep(2000);
		driver.quit();
		}

}
