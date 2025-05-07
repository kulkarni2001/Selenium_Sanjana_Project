package Select_Class_Dropdown;

	import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class DropDownMethods 
	{
		public static void main(String[] args) throws InterruptedException 
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://www.facebook.com/");
			
//			//selecting single select
//			driver.findElement(By.partialLinkText("Create new account")).click();
//			WebElement day = driver.findElement(By.id("day"));
//			Select select = new Select(day);
//			select.selectByIndex(1);
//			Thread.sleep(1000);
//			
//			WebElement month = driver.findElement(By.id("month"));
//			select = new Select(month);
//			select.selectByValue("5");
////			select.deselectByValue("12"); //UnsupportedOperationException cant use deselect methods for single select
////			select.selectByContainsVisibleText("ov");
//			Thread.sleep(1000);
//			
//			WebElement year = driver.findElement(By.id("year"));
//			select = new Select(year);
//			select.selectByVisibleText("2001");
////			select.selectByContainsVisibleText("21");
//			
//			
			//multiselect
			//driver.navigate().to("file:///C:/Users/Dell/Downloads/MultipleSelect.html");
			driver.navigate().to("file:///C:/Users/HP/Downloads/MultipleSelect.html");
			
			
			WebElement car=driver.findElement(By.id("cars"));
			Select sel=new Select(car);
			sel.selectByIndex(0);
			Thread.sleep(2000);
			sel.selectByValue("audi");
			Thread.sleep(1000);
			sel.selectByVisibleText("Opel");
			Thread.sleep(1000);
			sel.deselectByVisibleText("Audi");
			Thread.sleep(1000);
		
			sel.deselectByIndex(2);
			Thread.sleep(1000);
			sel.selectByContainsVisibleText("Sa");
			Thread.sleep(1000);
			sel.selectByIndex(0);
//		//System.out.println(sel.getFirstSelectedOption().getText());
//		 List<WebElement> option=sel.getAllSelectedOptions();
//		for(WebElement op:option)
//		{
//			System.out.println(op.getText());
//		}
			System.out.println(sel.isMultiple());
			List<WebElement> options=sel.getOptions();
			for(WebElement op:options)
				System.out.println(op.getText());
//			System.out.println();
			Thread.sleep(1000);
			sel.deselectAll();
			sel.
			
			Thread.sleep(2000);
			driver.quit();
		}
	}



