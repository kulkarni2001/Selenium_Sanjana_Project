package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workin_with_className {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/");
		driver.findElement(By.className("ga-nav")).click();
		
		
		List<WebElement> cls=driver.findElements(By.className("ga-nav"));
		System.out.println(cls.size());
		for(int i=0;i<cls.size();i++)
		{
			String cname=cls.get(i).getText();
			System.out.println(cname);
		
		}
	//	className Method
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-register")).click();
//		
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
