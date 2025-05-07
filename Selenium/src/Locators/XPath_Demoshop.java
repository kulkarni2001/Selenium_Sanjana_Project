package Locators;

import java.security.Key;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_Demoshop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Random r=new Random();
		int num=r.nextInt();
		System.out.println(num);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("book",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		Thread.sleep(2000);
		WebElement element=driver.findElement(By.xpath("//span[text()='Shopping cart']"));
		//element.sendKeys(Keys.PAGE_UP);
		Thread.sleep(2000);
		element.click();
		driver.findElement(By.xpath("//input[@name='updatecart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='updatecart']")).click();
		Thread.sleep(2000);
		
		//register
		
//		driver.findElement(By.xpath("//a[@href='/register']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@value='F']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Sanjana");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Kulkarni");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("kulkarni"+num+"@gmail.com");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Sanjana123");
//	   Thread.sleep(2000);
//	   driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("Sanjana123");
//	   Thread.sleep(2000);
//	   driver.findElement(By.xpath("//input[@id='register-button']")).click();
//	   Thread.sleep(2000);
	 
		driver.quit();
	}
}
