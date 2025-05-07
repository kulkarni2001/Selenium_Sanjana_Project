package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMethods {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/");
	
		Actions act=new Actions(driver);
		
		//moveToElement(driver)
		WebElement ele = driver.findElement(By.partialLinkText("GIFT"));
		act.moveToElement(ele).perform();
        
		//moveByOffset(x,y)
		WebElement ele2 = driver.findElement(By.partialLinkText("DIGITAL DOWNLOADS"));
		act.moveToLocation(ele2.getLocation().getX(), ele2.getLocation().getY()).perform();
//		act.moveToElement(ele2).perform();
		
		//moveToLocation(x,y)
		 Point ele1 = driver.findElement(By.partialLinkText("JEWELRY")).getLocation();
		act.moveToLocation(ele1.getX(), ele1.getY()).perform();
		
		WebElement ele3 = driver.findElement(By.partialLinkText("ELECTRONICS"));
		act.moveToElement(ele3).perform();
		
		
		Thread.sleep(2000);
		driver.quit();
	}
}
