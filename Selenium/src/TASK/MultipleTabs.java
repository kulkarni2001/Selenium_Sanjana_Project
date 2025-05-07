package TASK;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultipleTabs {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com");
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(2000);
		driver.get("https://web.whatsapp.com");
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(2000);
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(2000);
		driver.get("https://www.flipkart.com");
		
		Set<String> ids = driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>();
		for(String string:ids)
		{
			al.add(string);
		}
		System.out.println(al.size());
		System.out.println(al);
		driver.switchTo().window(al.get(1));
		driver.close();
		driver.switchTo().window(al.get(3));
		driver.findElement(By.name("q")).sendKeys("Iphone"+Keys.ENTER);
		
		Thread.sleep(2000);
		List<WebElement> prices = driver.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));
		
		HashSet hs=new HashSet();
		for(WebElement ele:prices)
		{
			hs.add(ele.getText());
		}
		System.out.println(hs);
		
		Thread.sleep(2000);
		driver.quit();
	}

}
