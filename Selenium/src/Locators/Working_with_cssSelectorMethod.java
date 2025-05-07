package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_cssSelectorMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:/www.facebook.com");
		
		//driver.findElement(By.cssSelector("input#email")).sendKeys("sanjana@gmail.com");
		List<WebElement> ele=driver.findElements(By.cssSelector("input.inputtext"));
		ele.get(0).sendKeys("Sanjana@gmail.com");
		ele.get(1).sendKeys("Sanjana@123");
		//WebElement Methods
	    String value=driver.findElement(By.tagName("a")).getDomProperty("href");
		System.out.println(value);
//		String value=driver.findElement(By.id("email")).getDomProperty("placeholder");
		String value1=driver.findElement(By.id("email")).getDomAttribute("type");
		System.out.println(value1);
		String value2=driver.findElement(By.id("email")).getAccessibleName();
		System.out.println(value2);
		String aria=driver.findElement(By.id("email")).getAriaRole();
		System.out.println(aria);
		Thread.sleep(2000);
		driver.quit();
	}

}
