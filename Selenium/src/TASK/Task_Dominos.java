package TASK;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Task_Dominos {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://pizzaonline.dominos.co.in/");
		driver.findElement(By.xpath("//span[text()='Skip']")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,2000);");
		try {
			driver.findElement(By.xpath("//span[text()='Lunch Feast @ ₹149']"));
		}
		catch(RuntimeException re) {
			driver.findElement(By.xpath("(//div[@class='menu-img-wrap'])[2]")).click();			
		}

		
		js.executeScript("window.scrollBy(3000,0);");
		WebElement ele=driver.findElement(By.xpath("//span[text()='Double Cheese Margherita']"));
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		ele.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='separater-before'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='View Cart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Change']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@data-testid='user-input']")).sendKeys("Gadital Hadpsar",Keys.ENTER);
		driver.findElement(By.xpath("//div[contains(@class,'SuggestedLocationsListstyle')]/div[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("BuildingNumber")).sendKeys("701");
		driver.findElement(By.name("Name")).sendKeys("sanjana");
		driver.findElement(By.name("MobileNumber")).sendKeys("9234567891");
		ele=driver.findElement(By.xpath("//span[.='Save Address']"));
		js.executeScript("arguments[0].click();", ele);		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshots/dominos2.png");
		FileHandler.copy(temp, dest);
		Thread.sleep(2000);
		driver.quit();
		
	}

}


