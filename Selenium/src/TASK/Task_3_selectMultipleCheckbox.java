package TASK;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_3_selectMultipleCheckbox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		List<WebElement> color = driver.findElements(By.name("color"));
		for(WebElement wb:color)
		{
			wb.click();
		}
		
		Thread.sleep(2000);
		driver.quit();
	}
	

}
