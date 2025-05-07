package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_idMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		driver.findElement(By.name("username")).sendKeys("7558427940");
		driver.findElement(By.name("password")).sendKeys("Sanjana@2001");
		;
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("kulkarnisanjana426@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Sanjana@123");
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(3000);
		driver.quit();
	}
}
