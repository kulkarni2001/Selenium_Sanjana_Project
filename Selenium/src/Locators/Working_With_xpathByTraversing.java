package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Working_With_xpathByTraversing {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]")).click();//xpath by group indexing
		Thread.sleep(2000);
		String text=driver.findElement(By.xpath("(//a[@class='ico-cart'])[1]/span[2]")).getText();//xpath by traversing
    	System.out.println(text);
		
		Thread.sleep(2000);
		driver.quit();
	}

}
