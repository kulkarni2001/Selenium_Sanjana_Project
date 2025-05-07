package Basic_TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Working_with_DataProvider {
	@DataProvider(name="dataProvider")
	public Object[][] testData()
	{
		Object[][] obj=new Object[3][2];
		obj[0][0]="qspider51@gmail.com";
		obj[0][1]="Qsp@1234";
		
		obj[1][0]="qspiders2596@gmail.com";
		obj[1][1]="Qsp@1234";
		
		obj[2][0]="qspjsp@gmail.com";
		obj[2][1]="Qsp@1234";
		
		return obj;
		
	}
	
	@Test(dataProvider = "dataProvider")
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
