package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Working_with_ExplicitWait {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
//		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
//		
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name")));
//		driver.findElement(By.id("name")).sendKeys("Sanjana");
		
		driver.get("https://www.shoppersstack.com/");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		
	//	wait.until(ExpectedConditions.titleContains("Welcome to ShoppersStack"));
		
		
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("loginBtn")));
//		driver.findElement(By.id("loginBtn")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("women")));
		driver.findElement(By.id("women")).click();
		
		
		Thread.sleep(4000);
		driver.quit();
	}

}
