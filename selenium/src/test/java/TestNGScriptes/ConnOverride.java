package TestNGScriptes;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import comm.Actitime.GenericLibrary.Facebook;

public class ConnOverride extends Facebook implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		ConneDate c = new ConneDate();
		 String dar = c.Cannvo();
		 String nameChangeing = result.getName();
		TakesScreenshot t = (TakesScreenshot) driver;
		 File src = t.getScreenshotAs(OutputType.FILE);
		 File des = new File("./TakeScreenShot/" + nameChangeing +" "+ dar + ".png");
		 try {
			Files.copy(src.toPath(), des.toPath());
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}
	

}
