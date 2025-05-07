package Basic_TestNg;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Working_with_ListenerEx implements ITestListener {
	
	public void onTestFailure(ITestResult result) {
		TakesScreenshot ts=(TakesScreenshot)Working_with_ConfigurationListener.sDriver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshots/listeners.png");
	try {
		FileHandler.copy(temp,dest);
	} catch (Exception e) {
		// TODO: handle exception
	}
		
	}

}