package ShadowRoot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_with_ClosedShadowRoot {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/shadow/closed?sublist=1");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//h1[text()='Login']")).click();
		Actions act=new Actions(driver);
//		act.sendKeys(Keys.TAB+"sanjana").perform();
//		act.sendKeys(Keys.TAB).sendKeys("7558427940").perform();
		Thread.sleep(2000);
		act.moveToLocation(639,198).click().perform();
		Thread.sleep(1000);
		act.sendKeys("Sanjana").perform();
		driver.quit();
		
	}

}
