package TASK;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Task_Croma_web {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.croma.com/");
		
		driver.findElement(By.id("searchV2")).sendKeys("Camera",Keys.ENTER);
		driver.findElement(By.id("panel0bh-header")).click();
		driver.findElement(By.xpath("//span[text()='DSLR Cameras']")).click();
		WebElement ele= driver.findElement(By.id("panel2bh-header"));
		ele.click();
		driver.findElement(By.xpath("//span[text()='Sony']")).click();
		driver.findElement(By.xpath("//span[text()='Canon']")).click();
		 
		driver.findElement(By.xpath("//p[text()='Camera Type']")).click();
		driver.findElement(By.xpath("//span[text()='DSLR Camera']")).click();
		
		driver.findElement(By.xpath("//p[text()='Delivery Mode']")).click();
		driver.findElement(By.xpath("//span[text()='Home Delivery']")).click();
		
		driver.findElement(By.xpath("//div[text()='Featured']")).click();
		driver.findElement(By.xpath("//li[text()='Price (Highest First)']")).click();
		Actions act=new Actions(driver);
		act.scrollByAmount(0, 400).perform();
		
		driver.findElement(By.xpath("//a[text()='Canon EOS R100 24.1MP DSLR Camera (18-45 mm Lens, DIGIC 8 Processor)']")).click();
		
		Set<String> ids = driver.getWindowHandles();
		for(String id:ids)
		{
			Thread.sleep(1000);
			driver.switchTo().window(id);
		}
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400);");
		
		driver.findElement(By.xpath("//button[text()='Buy Now']")).click();
		Thread.sleep(2000);
		ids=driver.getWindowHandles();
		for(String string:ids)
		{
			Thread.sleep(2000);
			driver.switchTo().window(string);
		}
		Thread.sleep(1000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshots/croma.png");
		FileHandler.copy(temp, dest);
		
		Thread.sleep(3000);
         driver.quit();
	}

}
