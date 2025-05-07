package ExtentReports;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Working_with_ExtentReports {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		String time=LocalDateTime.now().toString().replace("-", "").replace(":", "").replace(",", "");
		ExtentSparkReporter spark=new ExtentSparkReporter("./reports/"+time+".html");
		ExtentReports reports=new ExtentReports();
		reports.attachReporter(spark);
		ExtentTest test = reports.createTest("Add To Cart");
		
		WebDriver driver=new ChromeDriver();
		test.log(Status.INFO, "Browser Launched Successfully");
		driver.manage().window().maximize();
		test.log(Status.INFO, "Browser Maximized Successfully");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.flipkart.com");
		
		test.log(Status.INFO, "Navigated To WebPage");
		
		String path="./Screenshots/extentReport.png";
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(path);
		FileHandler.copy(temp, dest);
		
		
		test.addScreenCaptureFromPath("."+path);
		
		reports.flush();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
