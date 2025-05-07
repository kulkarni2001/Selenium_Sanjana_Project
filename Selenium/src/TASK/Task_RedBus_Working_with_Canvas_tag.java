package TASK;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task_RedBus_Working_with_Canvas_tag {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.redbus.in/");
		Thread.sleep(2000);
		driver.findElement(By.id("src")).sendKeys("Bangalore");
		driver.findElement(By.xpath("(//ul[contains(@class,'sc-dnqmqq ')]/li)[1]")).click();
		driver.findElement(By.id("dest")).sendKeys("pune");
		driver.findElement(By.xpath("(//ul[contains(@class,'sc-dnqmqq ')]/li)[1]")).click();
		driver.findElement(By.xpath("//div[contains(@class,'DatePicker__MainBlock')]/div[3]/div/span/div/span[text()='14']")).click();
		driver.findElement(By.id("search_button")).click();
		
		driver.findElement(By.xpath("//div[text()='View Seats']")).click();
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.moveToLocation(638,409).click().perform();
		
		Thread.sleep(2000);
		driver.quit();
		
		
		
	}

}
