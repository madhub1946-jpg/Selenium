package Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PomStart {
	@Test
	public void Capture() throws InterruptedException {
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		LoginCon lo = new LoginCon(driver);
		 WebElement element = lo.getEmailAddress();
		 WebElement pwd = lo.getPwdAddress();
		 WebElement Login = lo.getLoginButton();
		driver.navigate().refresh();
		element.sendKeys("Madhu@123.com");
		pwd.sendKeys("Madhu@143");
		Login.click();
		Thread.sleep(3000);
		driver.quit();
		
	}

}
