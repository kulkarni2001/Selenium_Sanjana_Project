package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_xpath {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.wikipedia.org/");
//		driver.findElement(By.xpath("(//span[@class='other-project-title jsl10n'])[1]")).click();
//		Thread.sleep(2000);
		driver.get("https://www.facebook.com");
	//	driver.findElement(By.xpath("//strong[text()='English']")).click();
		
		////a[contains(text().'Page']
		driver.findElement(By.xpath("//input[@type='text' and @name='email']")).sendKeys("Sanjana@123");
		driver.findElement(By.xpath("//input[@name='pass' or @id='pass']")).sendKeys("kulkarni");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
//NoSuchElementException	
		
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
