package ShadowRoot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_with_NestedShadowRoot {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/shadow/nested?sublist=2");
		SearchContext shadowHost = driver.findElement(By.xpath("//div[@class='shadowOuter']")).getShadowRoot();
		shadowHost.findElement(By.cssSelector("label[@for='email']")).click();
		Actions act =new Actions(driver);
		act.sendKeys(Keys.TAB);
		
	}

}
