package Qspiders;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ThreadGuard;

import io.opentelemetry.sdk.metrics.internal.exemplar.AlwaysOffFilter;

public class Working_with_manage {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in"); 
		driver.manage().window().maximize(); //1
		Thread.sleep(2000);
		driver.manage().window().minimize();  //2
		Thread.sleep(2000);
		driver.manage().window().fullscreen();//3
		Thread.sleep(2000);
		 Dimension oldSize=driver.manage().window().getSize();
		 System.out.println(oldSize);
		 Thread.sleep(2000);
		 Dimension newSize=new Dimension(800,700);
		driver.manage().window().setSize(newSize);
		Thread.sleep(2000);
		
		Point oldPosition= driver.manage().window().getPosition();
		System.out.println(oldPosition);
		Thread.sleep(2000);
		Point newPosition=new Point(500,500);
		driver.manage().window().setPosition(newPosition);
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
