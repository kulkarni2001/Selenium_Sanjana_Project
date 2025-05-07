package WebElementMethods;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_WebMethods {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	//	driver.get("https://demowebshop.tricentis.com/");
		
//      isDisplayed()
//		boolean displayed=driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).isDisplayed();
//		System.out.println(displayed);

		//isEnabled()
//		boolean enable= driver.findElement(By.xpath("//input[@type='submit']")).isEnabled();
//		System.out.println(enable);

		//isSelected()
//		WebElement ele=driver.findElement(By.id("pollanswers-1"));
//		System.out.println(ele.isSelected());		
//		ele.click();
//		System.out.println(ele.isSelected());

		//clear()
		driver.get("https://demo.opensourcebilling.org/en/users/sign_in");
//		driver.findElement(By.id("email")).clear();
		
		//submit
		//driver.findElement(By.xpath("//button[text()='Submit']")).submit();
		
		//GetCssValue
//		String css=driver.findElement(By.className("logo")).getCssValue("color");
//		System.out.println(css);
		
		//GetTagName
//		String tag=driver.findElement(By.xpath("//h2[text()='Sign In']")).getTagName();
//		System.out.println(tag);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.w3schools.com/");
		String text = driver.findElement(By.xpath("//h1[@class='learntocodeh1']")).getText();
		System.out.println(text);
		
		text=driver.findElement(By.xpath("//h1[@class='learntocodeh1']")).getAttribute("class");
		System.out.println(text);
		
		Dimension size = driver.findElement(By.xpath("//h1[@class='learntocodeh1']")).getSize();
		System.out.println(size);
		Point lo = driver.findElement(By.xpath("//h1[@class='learntocodeh1']")).getLocation();
		System.out.println(lo);
		driver.quit();
	}

}
