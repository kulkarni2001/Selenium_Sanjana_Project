package ExecutionTest2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Zee5 {
	@Test
	public void zee() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.zee5.com/");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("searchInput")));
		driver.findElement(By.id("searchInput")).sendKeys("baaghi"+Keys.ENTER);
		Thread.sleep(4000);
		driver.findElement(By.id("close")).click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='slick-list']/div/div")));
		
		driver.findElement(By.xpath("//div[@class='slick-list']/div/div")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
