package Locators;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getWindowHandels {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.flipkart.com/");
		
		String id=driver.getWindowHandle();
		System.out.println(id);
		System.out.println();
		driver.findElement(By.name("q")).sendKeys("iphone 15"+ Keys.ENTER);
		List<WebElement> ele= driver.findElements(By.xpath("//div[contains(text(),'Apple iPhone 15')]"));
		ele.get(0).click();
		ele.get(1).click();
		ele.get(2).click();
		
		Set<String> ids=driver.getWindowHandles();
		int size=ids.size();
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.addAll(ids);
		
		System.out.println("ArrayList size :" +arrayList.size());
		Thread.sleep(2000);
		
		Thread.sleep(2000);
		driver.switchTo().window(arrayList.get(2));
		Thread.sleep(2000);
		driver.quit();
		
	}

}
