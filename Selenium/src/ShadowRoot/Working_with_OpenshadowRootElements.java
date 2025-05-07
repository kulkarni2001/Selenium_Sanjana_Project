package ShadowRoot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_OpenshadowRootElements {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/shadow?sublist=0");
		Thread.sleep(2000);
		SearchContext shadowhost = driver.findElement(By.xpath("(//div[@class='my-3'])[1]")).getShadowRoot();
		shadowhost.findElement(By.cssSelector("input[placeholder='Enter your username']")).sendKeys("Sanjana@gmail.com");
		
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
