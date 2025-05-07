package IFrame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_iframeMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/frames?sublist=0");
		//Default Frame
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		driver.findElement(By.id("username")).sendKeys("Sanjana");
		driver.switchTo().parentFrame();
		
		//Nested Frame
		driver.findElement(By.partialLinkText("Nested iframe")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(0).switchTo().frame(0);
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("password")).sendKeys("abc@123");
		driver.findElement(By.id("confirm-password")).sendKeys("abc@123");
		driver.switchTo().defaultContent();//we use to come out from all frames
		
		//multiple Frame
		driver.findElement(By.partialLinkText("Multiple iframe")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		driver.findElement(By.id("email")).sendKeys("sanjanakulkarni@gmail.com");
		driver.findElement(By.id("password")).sendKeys("kulkarni");
		driver.findElement(By.id("confirm-password")).sendKeys("kulkarni");
		driver.switchTo().parentFrame(); //we use parentframe come out from the frame
		driver.switchTo().frame(1);
		driver.findElement(By.id("username")).sendKeys("rinku@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Rinku");
		driver.switchTo().parentFrame();
		
		//Nested with Multiple frame
		driver.findElement(By.partialLinkText("Nested with Multiple iframe")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(0).switchTo().frame(0).switchTo().frame(0);
		driver.findElement(By.id("email")).sendKeys("sumit@gmail.com");
		driver.switchTo().parentFrame().switchTo().frame(1);
		driver.findElement(By.id("password")).sendKeys("sumit");
		
		
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
