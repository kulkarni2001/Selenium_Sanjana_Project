package JavaScriptExecutor_i;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_disabledElements {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.oracle.com/in/database/technologies/oracle-database-software-downloads.html");
		
		WebElement ele= driver.findElement(By.xpath("//h2[text()='Oracle Database Enterprise Edition']"));
		driver.executeScript("arguments[0].scrollIntoView(true);",ele);
		
		driver.findElement(By.xpath("(//a[text()='ZIP'])[1]")).click();
		WebElement ele1=driver.findElement(By.xpath("//a[text()='Download WINDOWS.X64_193000_db_home.zip']"));
		driver.executeScript("arguments[0].click();", ele1);
		
		//driver.executeScript("", args)
		Thread.sleep(2000);
		driver.quit();
		
	}

}
