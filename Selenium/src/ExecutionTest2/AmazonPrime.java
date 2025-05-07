package ExecutionTest2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonPrime
{
	@Test
	public void amazonePrime() throws InterruptedException
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
	driver.get("https://www.primevideo.com/");
	Thread.sleep(3000);
//	driver.findElement(By.xpath("//a[@aria-label='Movies']")).click();
	driver.findElement(By.xpath("(//a[@class='ODY5qo yHcUia'])[2]")).click();
	WebElement ele = driver.findElement(By.xpath("//h1[text()='Movies']"));
	JavascriptExecutor js =(JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true);", ele);
	driver.findElement(By.xpath("(//span[text()='See more'])[1]")).click();
	driver.findElement(By.xpath("//div[@data-testid='packshot']")).click();
	js.executeScript("window.scrollBy(0,300);");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='_3G1q6i']")).click();
	Thread.sleep(2000);
	driver.quit();
	
	
	}
}
