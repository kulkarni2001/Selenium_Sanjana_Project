package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_getSize_getLocation_getReact {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Point location=driver.findElement(By.id("email")).getLocation();
		//System.out.println(location);
		System.out.println(location.getX());
		System.out.println(location.getY());
		
		Dimension size=driver.findElement(By.name("login")).getSize();
		//System.out.println(size);
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		
		Rectangle rect =driver.findElement(By.partialLinkText("Forgotten password?")).getRect();
		System.out.println(rect.getDimension());
//		System.out.println(rect.getX());
//		System.out.println(rect.getY());
//		System.out.println(rect.getHeight());
//		System.out.println(rect.getPoint());
		Thread.sleep(2000);
		driver.quit();
	}

}
