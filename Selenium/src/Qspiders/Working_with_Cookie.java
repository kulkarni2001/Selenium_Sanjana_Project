// get all cookies 


package Qspiders;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Working_with_Cookie {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
	//Add a cookie	
		Cookie newCookie =new Cookie("QSP","Selenium");
		driver.manage().addCookie(newCookie);
		//getting specified cookie
		//System.out.println(driver.manage().getCookieNamed("QSP"));
		//getting all the cookies present in web page
		Set<Cookie> cookies =driver.manage().getCookies();
		for(Cookie cookie:cookies)
		{
			System.out.println(cookie);
			System.out.println();
          /*System.out.println(cookie.getName());
			System.out.println(cookie.getValue());
			System.out.println(cookie.getDomain());
			System.out.println(cookie.getSameSite());
			System.out.println(cookie.getPath());
			System.out.println(cookie.getExpiry());
			System.out.println("================================"); */
			
		
		}
		
	//	driver.manage().deleteCookieNamed("QSP");
	//	driver.manage().deleteCookie(newCookie);
	//	driver.manage().deleteAllCookies();
	//	System.out.println(driver.manage().getCookies());
		Thread.sleep(2000);

		driver.quit();
		}
}
   