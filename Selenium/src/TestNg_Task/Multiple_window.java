package TestNg_Task;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Multiple_window {
	
	@Test
	public void multiple() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.instagram.com/");
		String id = driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/");
		String id2=driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.snapchat.com/");
		Thread.sleep(1000);
		driver.close();
		driver.switchTo().window(id2);
		Thread.sleep(1000);
		driver.close();
		driver.switchTo().window(id);
		Thread.sleep(1000);
		driver.close();

}
}
