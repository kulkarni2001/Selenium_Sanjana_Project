package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_linkText_partialLinkTextMethos {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		/*driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
	//	driver.findElement(By.linkText("Create new account")).click();
	  List<WebElement> elements=driver.findElements(By.partialLinkText("Create"));
	//	List<WebElement> elements=driver.findElements(By.partialLinkText("Create a Page"));
		System.out.println(elements.size());
		elements.get(0).click(); */
		
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com");
		//driver.findElement(By.partialLinkText("Books")).click();
		List<WebElement> ele=driver.findElements(By.partialLinkText("Books"));
		System.out.println(ele.size());
		for(int i=0;i<ele.size();i++)
		{
			ele.get(i).click();
		}
		
		
		Thread.sleep(2000);
		driver.quit();
	}

}
