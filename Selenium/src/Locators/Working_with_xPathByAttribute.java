package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_xPathByAttribute {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		Thread.sleep(2000);
		
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("7558427940"); //1 xpath By Attribute
//	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Sanjana");

	driver.findElement(By.xpath("//input[contains(@name,'pas')]")).sendKeys("SanjanaK"); // xpath by contains
	driver.findElement(By.xpath("//div[contains(text(),'Log')]")).click();
//		List<WebElement> ele =driver.findElements(By.xpath("//input[@name='password']"));
//			ele.get(0).sendKeys("Sanjana");
	 //driver.findElement(By.xpath("//input[@name='username' and name='password']")).sendKeys("Sanjana","Kulkarni");
	
	Thread.sleep(2000);
	driver.get("https://www.flipkart.com");
	
//	driver.findElement(By.xpath("//span[text()='Flight Bookings']")).click(); // 2 xpath By Text()

	driver.findElement(By.xpath("//span[contains(text(),'Flight')]")).click(); 	// 3 xpathByContains
		Thread.sleep(2000);
		driver.quit();
	}

}
