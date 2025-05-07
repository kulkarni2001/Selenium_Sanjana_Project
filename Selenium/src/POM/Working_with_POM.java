package POM;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Working_with_POM {

	@Test
	public void demo() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demowebshop.tricentis.com/books");
		
		Books_Page bookpage=new Books_Page(driver);
//		
//		Select sel=new Select(bookpage.getSortByDD());
//		
//		List<WebElement> options = sel.getOptions();
//		
//		for (int i = 0; i < options.size(); i++) {
//			sel.selectByIndex(i);		
//		}
		bookpage.getLinks().get(3).click();
		bookpage.getRegisterLink();
//		Computers c=new Computers(driver);
//		c.getLink().click();
		Thread.sleep(2000);
		driver.quit();
	}
	
}
