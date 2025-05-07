package TASK;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task_ShopperStack {
	public static void main(String[] args) throws InterruptedException {
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.shoppersstack.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("loginBtn")));
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath("//h1[text()='Featured Products']"));
		Thread.sleep(3000);
		driver.executeScript("arguments[0].scrollIntoView(true);", ele);
		driver.findElement(By.xpath("//span[contains(text(),'FOREVER 21  Casual Regular Sleeves')]")).click();
		driver.findElement(By.id("compare")).click();
		Thread.sleep(2000);
		Set<String> ids = driver.getWindowHandles();
		
		for(String string:ids)
		{
			driver.switchTo().window(string);
			System.out.println();
			String title=driver.getTitle();
			if(title.contains("Amazon.in"))
			{
				driver.close();
			}
		}
		
//		driver.findElement(By.xpath("//img[@alt='FOREVER 21  Casual Regular Sleeves Solid Women Black Top']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[name()='svg' and @data-testid='InfoOutlinedIcon']")).click();
//		Thread.sleep(3000);
//		Set<String> ids = driver.getWindowHandles();
//		ArrayList<String> al = new ArrayList<String>();
//		for (String string : ids) {
//			al.add(string);
//		}
//		System.out.println(al.size());
//		System.out.println(al);
//		driver.switchTo().window(al.get(2));
//		driver.close();

		Thread.sleep(2000);
		driver.quit();
	}

}
