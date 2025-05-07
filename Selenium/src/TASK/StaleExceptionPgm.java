package TASK;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaleExceptionPgm {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/books");
		WebElement ele = driver.findElement(By.id("products-orderby"));
		Select sel=new Select(ele);
		List<WebElement> options = sel.getOptions();
		int size=options.size();
		
		for (int i = 0; i < size; i++) {
			ele = driver.findElement(By.id("products-orderby"));
			sel=new Select(ele);
			sel.selectByIndex(i);
			
		}
	Thread.sleep(2000);
	driver.quit();
	}
	

}
