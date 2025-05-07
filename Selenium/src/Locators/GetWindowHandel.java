package Locators;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandel {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.get("https://secure.indeed.com/auth?hl=en_IN&co=IN&continue=https%3A%2F%2Fin.indeed.com%2F&tmpl=desktop&from=gnav-util-homepage&jsContinue=https%3A%2F%2Fprofile.indeed.com%2Fwelcome%3Fhl%3Den_IN%26co%3DIN%26from%3Dgnav-homepage%26continue%3Dhttps%253A%252F%252Fonboarding.indeed.com%252Fonboarding%253Fhl%253Den_IN%2526co%253DIN%2526from%253Dgnav-homepage&empContinue=https%3A%2F%2Faccount.indeed.com%2Fmyaccess");
	driver.manage().window().fullscreen();
	String id=driver.getWindowHandle();
	System.out.println(id);
	System.out.println();
	driver.findElement(By.xpath("//span[contains(text(),'Apple')]")).click();
	Set<String> ids=driver.getWindowHandles();
	for(String string:ids)
	{
		driver.switchTo().window(string);
	}
	
	driver.findElement(By.id("account_name_text_field")).sendKeys("Sanjana");
	Thread.sleep(2000);
	driver.switchTo().window(id);
	driver.findElement(By.xpath("//span[contains(text(),'Google')]")).click();
	
	Set<String> ids1=driver.getWindowHandles();
	ids1.removeAll(ids);
	System.out.println("ID's 1:"+ids1.size());
	for(String string:ids1)
	{
		driver.switchTo().window(string);
		
	}
	Thread.sleep(2000);
	driver.findElement(By.partialLinkText("Help")).click();
	Thread.sleep(5000);
	driver.quit();
	
	}
}
