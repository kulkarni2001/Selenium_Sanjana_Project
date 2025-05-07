package TASK;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task_Zee5 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.zee5.com/");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.partialLinkText("Watch Free | ZEE5 Manoranjan Festival"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(4000);
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		driver.findElement(By.xpath("//img[@title='Vedha Movie']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(25));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@title='Quality selector']")));
		
		
		Thread.sleep(2000);
		
		driver.quit();
	}

}
