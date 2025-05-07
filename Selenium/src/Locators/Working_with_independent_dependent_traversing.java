package Locators;

import java.security.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_independent_dependent_traversing {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.flipkart.com");
//		driver.findElement(By.name("q")).sendKeys("Iphone 16"+Keys.ENTER);
		Thread.sleep(3000);
		//forward and backward traversing
	//	driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[1]/../../div[2]/div[1]/div[1]/div[1]")).click();
//      driver.findElement(By.xpath("(//div[text()='Apple iPhone 16 (Black, 128 GB)']/../../div[2]/div[1]/div[1]/div[1]")).click();
		driver.get("https://www.selenium.dev/");
		driver.findElement(By.xpath("//span[text()='Downloads']")).click();
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//p[text()='Java']/../p[2]/a"));
		ele.sendKeys(Keys.PAGE_DOWN);
		ele.click();
		//System.out.println(text);
		
		Thread.sleep(2000);
		driver.quit();
	}

}
