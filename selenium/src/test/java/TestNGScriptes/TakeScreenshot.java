package TestNGScriptes;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TakeScreenshot {
	@Test
	public void ScreenShot() throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://online.actitime.com/tosca/login.do");
		TakesScreenshot t = (TakesScreenshot) driver;
		File source = t.getScreenshotAs(OutputType.FILE);
		File Dse = new File("./TakeScreenShot/ss.png");
		Files.copy(source.toPath(), Dse.toPath());
		Thread.sleep(2000);
		driver.quit();
		
	}

}
