package DDT;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_jSONfile {
	public static void main(String[] args) throws IOException, ParseException, InterruptedException {
		FileReader fr=new FileReader("./Files/jsonData.json");
		JSONParser parser=new JSONParser();
		Object obj = parser.parse(fr);
		JSONObject map=(JSONObject) obj;
		Object url=map.get("url");
		Object user = map.get("username");
		Object pass = map.get("password");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url.toString());
		driver.findElement(By.id("email")).sendKeys(user.toString());
		driver.findElement(By.id("pass")).sendKeys(pass.toString());
		Thread.sleep(1000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
