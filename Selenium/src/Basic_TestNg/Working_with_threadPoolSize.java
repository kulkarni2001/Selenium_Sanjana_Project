//parallel test execution
package Basic_TestNg;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Working_with_threadPoolSize {
	@Test(invocationCount = 3,threadPoolSize = 4)
	public void demo() throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.redbus.in/");
		
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.quit();
	}

}
