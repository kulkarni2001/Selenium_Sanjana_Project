package TASK;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task_Flipkart2 {
	
//	 WebDriver driver;
//	public static void search(String productName,String path)
//	{
//		driver.findElement(By.name("q")).sendKeys(productName +Keys.ENTER);
//		//driver.findElement(By.xpath("//span[contains(text(),'vivo')]")).click();
//		driver.findElement(By.xpath("(//div[contains(text(),path)])[1]")).click();
//		
//		Set<String> ids = driver.getWindowHandles();
//		System.out.println(ids.size());
//		for (String string : ids) {
//			driver.switchTo().window(string);
//		}
//		Thread.sleep(1000);
//		try {
//			 driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
//			
//		} catch (Exception e) {
//			driver.findElement(By.xpath("//button[contains(@class,'QqFHMw vslbG+')]")).click();
//			// TODO: handle exception
//		}
//	}
		
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		Thread.sleep(4000);
		
		//first product
		driver.findElement(By.name("q")).sendKeys("motorola mobile 5g"+Keys.ENTER);
		Thread.sleep(7000);
		driver.findElement(By.xpath("//div[contains(text(),'Motorola Edge 50 ')]")).click();

		JavascriptExecutor js=(JavascriptExecutor) driver;
		Set<String> ids = driver.getWindowHandles();
		System.out.println(ids.size());
		for (String string : ids) {
			driver.switchTo().window(string);
		}
		Thread.sleep(2000);
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add to cart']")));
		try {
			WebElement cart = driver.findElement(By.xpath("//button[text()='Add to cart']"));
			js.executeScript("arguments[0].click();", cart);
			
		} catch (Exception e) {
			 WebElement cart = driver.findElement(By.xpath("//button[contains(@class,'QqFHMw vslbG+ In9uk2')]"));
			js.executeScript("arguments[0].click();", cart);
			// TODO: handle exception
		}
		Thread.sleep(2000);
		
		//second product
		driver.findElement(By.name("q")).sendKeys("Oppo Pro 5G"+Keys.ENTER);
		Thread.sleep(7000);
		driver.findElement(By.xpath("(//div[contains(text(),'OPPO A3 Pro 5G')])[1]")).click();
		
		ids.removeAll(ids);
		 ids = driver.getWindowHandles();
		System.out.println(ids.size());
		
		for (String string : ids) {
			driver.switchTo().window(string);
		}
		Thread.sleep(2000);
		try {
			 driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		} catch (Exception e) {
			Thread.sleep(2000);
			WebElement cart = driver.findElement(By.xpath("(//button[contains(@class,'QqFHMw')])[1]"));
			js.executeScript("arguments[0].click();", cart);
			// TODO: handle exception
		}
		Thread.sleep(2000);

		//third product
		driver.findElement(By.name("q")).sendKeys("iphone 15 "+Keys.ENTER);
		Thread.sleep(7000);
		driver.findElement(By.xpath("(//div[contains(text(),'Apple iPhone 15')])[1]")).click();
		
		ids.removeAll(ids);
		 ids = driver.getWindowHandles();
		System.out.println(ids.size());
		
		for (String string : ids) {
			driver.switchTo().window(string);
		}
		Thread.sleep(2000);
		try {
			 driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
			
		} catch (Exception e) {
			WebElement cart = driver.findElement(By.xpath("(//button[contains(@class,'QqFHMw')])[1]"));
			js.executeScript("arguments[0].click();", cart);
			// TODO: handle exception
		}
		Thread.sleep(2000);
		
//		String p1 = driver.findElement(By.xpath("(//span[contains(@class,'LAlF6k')])[2]")).getText();
//		Thread.sleep(1000);
//		String p2 = driver.findElement(By.xpath("(//span[contains(@class,'LAlF6k')])[4]")).getText();
//		Thread.sleep(1000);
//		String p3 = driver.findElement(By.xpath("(//span[contains(@class,'LAlF6k')])[6]")).getText();
//		
//		p1=p1.replaceAll("[^0-9]", "");
//		p2=p2.replaceAll("[^0-9]", "");
//		p3=p3.replaceAll("[^0-9]", "");
//		
//		int price1=Integer.parseInt(p1);
//		int price2=Integer.parseInt(p2);
//		int price3=Integer.parseInt(p3);
//		
//		if(price1>price2 && price3>price2)
//		{
//			System.out.println(price2);
//			driver.findElement(By.xpath("(//div[text()='Remove'])[2]")).click();
//		}else if(price1>price3)
//		{
//			driver.findElement(By.xpath("(//div[text()='Remove'])[3]")).click();
//			System.out.println(price3);
//		}else
//		{
//			driver.findElement(By.xpath("(//div[text()='Remove'])[1]")).click();
//			System.out.println(price1);
//		}
//		
		
		Thread.sleep(2000);
		driver.quit();
		
			
	}

}



