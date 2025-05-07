package TASK;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Task_Dell {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.dell.com/en-in");

		WebElement ele = driver.findElement(By.xpath("//span[.='Computers & Accessories']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(ele).perform();
		ele = driver.findElement(By.xpath("//button[text()='Laptops']"));
		actions.moveToElement(ele).perform();
		driver.findElement(By.partialLinkText("View All Laptops")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		try {
			Thread.sleep(2000);
			WebElement ele1 = driver.findElement(By.xpath("//button[@aria-label='close']"));
			js.executeScript("arguments[0].click();", ele1);
		} catch (Exception e) {
			// TODO: handle exception
		}
		driver.findElement(By.xpath("//span[text()='Performance']")).click();
		

		WebElement dropdown = driver.findElement(By.id("sort-dropdown"));
		Select sel = new Select(dropdown);
		sel.selectByContainsVisibleText("Lowest Price");
		try {
			Thread.sleep(2000);
			WebElement ele1 = driver.findElement(By.xpath("//button[@aria-label='close']"));
			js.executeScript("arguments[0].click();", ele1);
		} catch (Exception e) {
			// TODO: handle exception
		}
		Thread.sleep(3000);
		List<WebElement> button = driver.findElements(By.xpath("//span[@role='button']"));
		button.get(0).click();
		button.get(1).click();
		button.get(2).click();

		ele = driver.findElement(By.xpath("//span[text()='Compare']"));
		actions.contextClick(ele).perform();
		
		Thread.sleep(4000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);

		Set<String> ids = driver.getWindowHandles();
		for (String string : ids) {
			Thread.sleep(2000);
			driver.switchTo().window(string);
		}
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/dell.png");
		FileHandler.copy(temp, dest);

		Thread.sleep(2000);
		driver.quit();

	}

}
