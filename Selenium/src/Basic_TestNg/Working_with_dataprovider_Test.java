package Basic_TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Working_with_dataprovider_Test {
	@Test(dataProviderClass = Working_with_dataProvider_data.class, dataProvider = "dataProvider")
	public void data(String un,String pwd) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys(un);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		Thread.sleep(2000);
		driver.quit();
	}

}


//public class Working_with_dataprovider_Test extends Working_with_DataProvider{
//	@Test( dataProvider = "dataProvider")
//	public void data(String un,String pwd) throws InterruptedException
//	{
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		driver.get("https://demowebshop.tricentis.com/login");
//		driver.findElement(By.id("Email")).sendKeys(un);
//		driver.findElement(By.id("Password")).sendKeys(pwd);
//		driver.findElement(By.xpath("//input[@value='Log in']")).click();
//		
//		Thread.sleep(2000);
//		driver.quit();
//	}

//}