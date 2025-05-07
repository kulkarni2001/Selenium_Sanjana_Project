package TASK;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Popups.JavaScript_Popup;

public class Practice {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.bbc.com/news");
		WebElement ele = driver.findElement(By.xpath("//h2[text()='Most read']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		
		List<WebElement> ele1 = driver.findElements(By.xpath("//div[@data-testid='cambridge-article']"));

		for(WebElement wb:ele1)
		{
			System.out.println(wb.getText());
		}
	}

}
