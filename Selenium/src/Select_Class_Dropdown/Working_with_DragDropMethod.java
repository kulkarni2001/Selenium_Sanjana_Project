package Select_Class_Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_with_DragDropMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Actions act=new Actions(driver);
		WebElement temp = driver.findElement(By.id("box3"));
		
//		act.clickAndHold(temp).perform();
		WebElement dest=driver.findElement(By.id("box103"));
//		act.release(dest).perform();
		act.dragAndDrop(temp, dest).perform();
		
		temp=driver.findElement(By.id("box2"));
		dest=driver.findElement(By.id("box102"));
				act.dragAndDrop(temp, dest).perform();
		Thread.sleep(2000);
		driver.quit();
	}

}
