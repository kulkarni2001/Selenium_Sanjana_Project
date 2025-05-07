package Locators;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class BigbasketTask1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.bigbasket.com");
		driver.findElement(By.xpath("((//input[@type='text'])[2])")).sendKeys("mango",Keys.ENTER);
		Actions act=new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("(//h3[contains(text(),'Mango')])[1]"));
		
		ScrollOrigin scroll=ScrollOrigin.fromElement(ele);
//		ScrollOrigin scroll1 = ScrollOrigin.fromElement(ele);
		act.scrollFromOrigin(scroll, 0, 200).perform();
	
		ele.click();
		
		Set<String> ids =driver.getWindowHandles();
		for(String string:ids)
		{
			Thread.sleep(2000);
			driver.switchTo().window(string);
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[text()='Add to basket'])[1]")).click();

				
		Thread.sleep(5000);
		driver.quit();
	}

}
