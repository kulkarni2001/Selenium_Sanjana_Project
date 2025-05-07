package Basic_TestNg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Working_With_Priority {
	
	
	@Test(priority=1)
	public void login(){
		System.out.println("Login");
	}
	//enabled = false
	@Test(priority = 0 )
	public void register() throws InterruptedException
	{
		System.out.println("Register");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.ajio.com");
		System.out.println(driver.getTitle());
		
		Thread.sleep(1000);
		driver.quit();
	}
	@Test(priority =2 ,dependsOnMethods = {"login","register"})
	public void delete()
	{
		System.out.println("Delete");
	}

}
