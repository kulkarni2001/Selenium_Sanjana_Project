package ExecutionTest;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test1_ShopperStack {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.shoppersstack.com/");
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("loginBtn")));
		driver.findElement(By.id("loginBtn")).click();
		
		driver.findElement(By.id("Email")).sendKeys("rinku@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Abc@2002");
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		
		WebElement ele = driver.findElement(By.xpath("//h1[text()='Featured Products']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		driver.findElement(By.xpath("//*[name()='svg' and @id='addToWishlist']")).click();
		driver.findElement(By.xpath("//*[name()='svg' and @data-testid='SettingsIcon']")).click();
		driver.findElement(By.xpath("//ul[@role=\"menu\"]/li[3]")).click();
		Thread.sleep(2000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File t = ts.getScreenshotAs(OutputType.FILE);
		File d=new File("./Screenshots/wish.png");
		FileHandler.copy(t, d);
		
		Thread.sleep(2000);
		WebElement temp = driver.findElement(By.xpath("//h2[contains(text(),'forever21')]"));
		WebElement dest=driver.findElement(By.xpath("//*[name()='svg' and @id='cartIcon']"));
		Actions act=new Actions(driver);
		act.dragAndDrop(temp, dest).perform();
		
		driver.findElement(By.xpath("//*[name()='svg' and @id='cartIcon']")).click();
		Thread.sleep(2000);
		 File te = ts.getScreenshotAs(OutputType.FILE);
		 File de = new File("./Screenshots/add.png");
		FileHandler.copy(te, de);
		
		Thread.sleep(2000);
		driver.quit();
	}

}
