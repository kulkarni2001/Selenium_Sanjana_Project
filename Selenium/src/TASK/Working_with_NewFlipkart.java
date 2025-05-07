package TASK;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_with_NewFlipkart {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com");
		driver.findElement(By.name("q")).sendKeys("Vivo" +Keys.ENTER);
		driver.findElement(By.xpath("//div[contains(text(),'vivo ')]")).click();
		
		Set<String> id = driver.getWindowHandles();
		
		for(String ids:id)
		{
		driver.switchTo().window(ids);
		}

		JavascriptExecutor js=(JavascriptExecutor)driver ;
		Thread.sleep(2000);
		
		try {
			WebElement ele = driver.findElement(By.xpath("//button[text()='Add to cart']"));
			js.executeScript("aruguments[0].click();", ele);
			
		} catch (Exception e) {
			driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2 JTo6b7']")).click();
		}
		
	}

}
