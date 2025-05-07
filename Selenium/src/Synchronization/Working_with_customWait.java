package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Working_with_customWait {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		int count=0;
		while(true)
		{
			try {
				driver.findElement(By.id("name")).sendKeys("Sanjana");
				break;
			} catch (NoSuchElementException e) {
				count++;
			}
			
		}
		System.out.println(count);
		Thread.sleep(1000);
		driver.quit();
		
	}

}
