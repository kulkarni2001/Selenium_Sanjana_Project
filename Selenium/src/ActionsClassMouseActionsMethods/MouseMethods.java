package ActionsClassMouseActionsMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		Actions a=new Actions(driver);
		WebElement ele= driver.findElement(By.partialLinkText("Register"));
		a.contextClick(ele).perform();
		ele=driver.findElement(By.xpath("//h3[text()='Customer service']"));
		a.scrollToElement(ele).perform();
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
