package TestNGScriptes;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import comm.Actitime.GenericLibrary.BaseClass;

public class Listener extends BaseClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
    Reporter.log("testscript start executing",true);	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("testScrips Executed Successfully",true);
		
	}
	@Override
	public void onTestFailure(ITestResult result) {
		DateAndTime da = new DateAndTime();
		String dat = da.dTime();
		String TestScriptname = result.getName();
		TakesScreenshot t = (TakesScreenshot) driver;
		File source = t.getScreenshotAs(OutputType.FILE);
		File Dse = new File("./TakeScreenShot/" + TestScriptname+ " " +dat + ".png");
		try {
			Files.copy(source.toPath(), Dse.toPath());
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
