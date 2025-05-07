package JavaScriptExecutor_i;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_disabledTextField {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapp.skillrary.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement ele =driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		js.executeScript("arguments[0].value='Hello Sanjana';", ele);
		Thread.sleep(2000);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		js.executeScript("window.scrollBy(0,400);");
		driver.findElement(By.id("hide-textbox")).click();
		WebElement ele2 =driver.findElement(By.id("displayed-text"));
		js.executeScript("arguments[0].value='Bye'", ele2);
		//driver.findElement(By.id("show-textbox")).click();
		Thread.sleep(2000);
		
		driver.quit();
	}

}
