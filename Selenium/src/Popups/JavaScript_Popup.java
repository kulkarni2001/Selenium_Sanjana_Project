package Popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Popup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		//alert popup
		driver.findElement(By.xpath("//button[contains(text(),'alert box')]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
		//Confirmation Popup
		driver.findElement(By.linkText("Alert with OK & Cancel")).click();
		driver.findElement(By.xpath("//button[contains(text(),'a confirm box ')]")).click();
		driver.switchTo().alert().accept();
		
		//Prompt Popup
		driver.findElement(By.partialLinkText("Alert with Textbox")).click();
		WebElement ele1= driver.findElement(By.xpath("//button[contains(text(),'prompt box ')]"));
		ele1.click();
		System.out.println(driver.switchTo().alert().getText());
		
		
		driver.findElement(By.xpath("//button[contains(text(),'prompt box ')]")).click();
		Alert ele = driver.switchTo().alert();
		ele.sendKeys("Sanjana Kulkarni");
		Thread.sleep(2000);
		ele.accept();
		Thread.sleep(2000);
		driver.quit();
	}

}
