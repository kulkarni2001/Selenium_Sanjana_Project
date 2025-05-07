package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_getAttribute {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement value=driver.findElement(By.id("email"));
		value.sendKeys("sanjana@gmail.com");
		System.out.println(value.getAttribute("value"));
		System.out.println(value.getDomProperty("value"));
		System.out.println(value.getDomAttribute("type"));
		Thread.sleep(2000);
		driver.quit();
		
	}

}
