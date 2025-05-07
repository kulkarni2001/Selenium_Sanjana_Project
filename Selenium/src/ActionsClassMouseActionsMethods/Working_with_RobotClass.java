package ActionsClassMouseActionsMethods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_RobotClass
{
	public static void main(String[] args) throws AWTException, InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demowebshop.tricentis.com/");
	
	Robot robo=new Robot();
	driver.findElement(By.partialLinkText("Regis")).click();
	for(int i=0;i<25;i++)
	{
		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(100);
	}
	driver.findElement(By.id("gender-female")).click();
	robo.keyPress(KeyEvent.VK_ENTER);
	robo.keyRelease(KeyEvent.VK_ENTER);
	
	robo.keyPress(KeyEvent.VK_S);
	robo.keyPress(KeyEvent.VK_A);
	robo.keyPress(KeyEvent.VK_N);
	robo.keyPress(KeyEvent.VK_J);
	robo.keyPress(KeyEvent.VK_A);
	robo.keyPress(KeyEvent.VK_N);
	robo.keyPress(KeyEvent.VK_A);
	
	robo.keyPress(KeyEvent.VK_TAB);
	robo.keyRelease(KeyEvent.VK_TAB);
	
	robo.keyPress(KeyEvent.VK_K);
	robo.keyPress(KeyEvent.VK_U);
	robo.keyPress(KeyEvent.VK_L);
	robo.keyPress(KeyEvent.VK_K);
	robo.keyPress(KeyEvent.VK_A);
	robo.keyPress(KeyEvent.VK_R);
	robo.keyPress(KeyEvent.VK_N);
	robo.keyPress(KeyEvent.VK_I);
	
	robo.keyPress(KeyEvent.VK_TAB);
	robo.keyRelease(KeyEvent.VK_TAB);
	
	
	robo.keyPress(KeyEvent.VK_S);
	robo.keyPress(KeyEvent.VK_A);
	robo.keyPress(KeyEvent.VK_N);
	robo.keyPress(KeyEvent.VK_J);
	robo.keyPress(KeyEvent.VK_A);
	robo.keyPress(KeyEvent.VK_N);
	robo.keyPress(KeyEvent.VK_A);
	robo.keyPress(KeyEvent.VK_SHIFT);
	robo.keyPress(KeyEvent.VK_2);
	robo.keyRelease(KeyEvent.VK_SHIFT);
	robo.keyPress(KeyEvent.VK_G);
	robo.keyPress(KeyEvent.VK_M);
	robo.keyPress(KeyEvent.VK_A);
	robo.keyPress(KeyEvent.VK_I);
	robo.keyPress(KeyEvent.VK_L);
	
	Thread.sleep(2000);
	driver.quit();
	
	}
}
