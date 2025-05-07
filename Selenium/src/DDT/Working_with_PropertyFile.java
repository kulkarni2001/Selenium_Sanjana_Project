package DDT;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_PropertyFile {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		FileInputStream fis=new FileInputStream("./files/PropertiesData.properties");
  //new FileInputStream("./files/PropertiesData.properties") 
  //this line throws the exp called FileNotFoundException
		Properties pro=new Properties();
		pro.load(fis); //load() throws the exp called IOException
		String value = pro.getProperty("url");
		System.out.println(value);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(value);
		String username = pro.getProperty("username");
		driver.findElement(By.id("email")).sendKeys(username);
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
