package Basic_TestNg;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Working_with_ListenerEx.class)
public class Working_with_Listeners extends Working_with_ConfigurationListener{
	
	@Test
	public void demo()
	{
		driver.findElement(By.id("sc")).click();
	}

}
