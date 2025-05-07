//to capture particular webelement screenshot
package TakeScreenshot_I;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Working_with_takescreenshot_webelement {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com");
		WebElement ele=driver.findElement(By.partialLinkText("Create new account"));
		
		File temp=ele.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshots/webEleSS.png");
		FileHandler.copy(temp, dest);
		Thread.sleep(3000);
		driver.quit();
	}

}
