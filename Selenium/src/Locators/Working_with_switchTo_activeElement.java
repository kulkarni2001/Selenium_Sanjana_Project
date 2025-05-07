package Locators;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_switchTo_activeElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("https://www.facebook.com/");
		driver.switchTo().activeElement().sendKeys("kulkarni@gmail.com"+Keys.TAB);
		driver.switchTo().activeElement().sendKeys("Sanjana"+Keys.TAB+Keys.TAB);
		Thread.sleep(2000);
		driver.switchTo().activeElement().click();
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
