package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDOB {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).click();
		int i=0;
		
		while(true)
		{
			String text =driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			if(text.contains("May 2001"))
			{
				driver.findElement(By.xpath("//table[contains(@class,'ui-datepicker')]/tbody/tr/td/a[text()='2']")).click();
				break;
			}
			else
			{
				driver.findElement(By.xpath("//span[text()='Prev']")).click();
			}
			i++;	
		}
		
	System.out.println(i);
	Thread.sleep(3000);
		driver.quit();
	}

}
