package Popups;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class HiddenPopUp 
	{
		public static void main(String[] args) throws InterruptedException 
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.makemytrip.com/");
			
			driver.findElement(By.xpath("//input[@data-cy='userName']")).sendKeys("7558427940");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
			
			Thread.sleep(2000);
			driver.quit();
		}
	}


