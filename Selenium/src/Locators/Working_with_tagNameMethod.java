package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_tagNameMethod {
	public static void main(String[] args) throws InterruptedException {
		
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
			List<WebElement> links=driver.findElements(By.tagName("a"));
			System.out.println(links.size());
			for(int i=0;i<links.size();i++)
			{
				String text=links.get(i).getAttribute("href");
				if(text.isEmpty())
				{
					
				}
				else
				{
					System.out.println(text);
				}
			} 
			Thread.sleep(2000);
			driver.quit();
}
}
