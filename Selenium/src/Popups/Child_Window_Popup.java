package Popups;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Window_Popup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com");
		
		String id = driver.getWindowHandle();
		System.out.println(id);
		System.out.println();
		
		driver.findElement(By.name("q")).sendKeys("Iphone 15"+Keys.ENTER);
		List<WebElement> ele = driver.findElements(By.xpath("//div[contains(text(),'Apple iPhone 15')]"));
		ele.get(0).click();
		ele.get(1).click();
		
		Set<String> ids = driver.getWindowHandles();
		int size=ids.size();
		System.out.println(size);
		Thread.sleep(2000);
		
		for(String string:ids) {
			System.out.println(string);
		Thread.sleep(1000);
		driver.switchTo().window(string);
		
		String title=driver.getTitle();
		if(title.contains("blue"))
		{
			try {
				driver.findElement(By.xpath("//button[text()='GO TO CART']")).click();
				break;
			}catch (Exception e) {
				driver.findElement(By.xpath("(//button[contains(@class,'QqFHMw')])[1]")).click();
			}
		}
		}
		Thread.sleep(2000);
		driver.quit();
	}

}
