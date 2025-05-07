package Qspiders;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_switchToMethod {
        public static void main(String[] args) throws InterruptedException {
        	WebDriver driver=new ChromeDriver();
        	driver.manage().window().maximize();
        	driver.get("https://www.snapchat.com");
        //	driver.switchTo().newWindow(WindowType.TAB); 
        	driver.switchTo().newWindow(WindowType.WINDOW); 
        	
        	driver.get("https://www.instagram.com");
        	Thread.sleep(2000);
        	//driver.close();
        	driver.quit();
        	
}
}
