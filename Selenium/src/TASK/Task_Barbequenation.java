package TASK;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
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
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task_Barbequenation {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.barbequenation.com/");
		String id = driver.getWindowHandle();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Happiness Cards']")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[name()='svg' and @height='24'])[5]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Search...']")).sendKeys("Pune"+Keys.ENTER);
		WebElement ele = driver.findElement(By.xpath("//li[text()='Amanora']"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).click().perform();
		Thread.sleep(2000);
		ele=driver.findElement(By.xpath("//span[text()='Send Enquiry']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", ele);
		ele=driver.findElement(By.partialLinkText("Corporate Enquiry"));
		act.scrollByAmount(0, 800);
		act.contextClick(ele).perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		Set<String> ids = driver.getWindowHandles();
		for(String string:ids)
		{ 
			Thread.sleep(2000);
			driver.switchTo().window(string);
		}
		driver.findElement(By.xpath("//input[@id='edit-name']")).sendKeys("Sanjana");
		ele=driver.findElement(By.xpath("(//div[@class=\"clearfix text-formatted field field-summary text-with-summary\"])[2]"));
		System.out.println(ele.getText());
		Thread.sleep(2000);
		driver.switchTo().window(id);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@alt='Barbeque Nation']")).click();
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshots/barbeqe.png");
		FileHandler.copy(temp, dest);
		
		Thread.sleep(3000);
		driver.quit();
	}

}
