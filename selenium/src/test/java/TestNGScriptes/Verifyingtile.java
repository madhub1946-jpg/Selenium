package TestNGScriptes;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Verifyingtile {
	@Test
	
	public void Title() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		@Nullable
		String ActualTitle = driver.getTitle();
		String ExpectedtTitle = "Faceboak";
////		if (ActualTitle.equals(ExpectedtTitle)) {
////			Reporter.log("ExpectedtTitle is Same",true);
////			
////		} else {
////			Reporter.log("ExpectedtTitle is not Same",true);
////
////		}
//		Assert.assertEquals(ActualTitle,ExpectedtTitle);//it has Satatic Method
		SoftAssert s = new SoftAssert();
		//s.assertEquals(ActualTitle, ExpectedtTitle);//AssertNotEqual(A,E)
		s.assertTrue(false);
		s.assertFalse(false);
		s.assertNull(ActualTitle, ExpectedtTitle);
		s.assertNotNull(ExpectedtTitle);
		
		Thread.sleep(2000);
        driver.quit();	
        s.assertAll();
		
		
		
	}

}
