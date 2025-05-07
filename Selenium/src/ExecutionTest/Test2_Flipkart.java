package ExecutionTest;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2_Flipkart {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		List<WebElement> ele = driver.findElements(By.xpath("//a"));
		int size=ele.size();
		System.out.println("Total Links "+size);
		HashSet<String> hs=new HashSet<String>();
		for(WebElement wb:ele)
		{
			@Nullable
			WebElement li=driver.findElement(By.xpath("//a"));
			String links = wb.getAttribute("href");
			hs.add(links);
		}
		System.out.println("Unique Links "+hs.size());
		int unique=hs.size();
		int res=size-unique;
		System.out.println("Duplicate Links "+ res);

		Thread.sleep(2000);
		driver.quit();
	}

}
