package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PomStart1 {
	@Test
	public void Capture() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		practiceLoconn l = new practiceLoconn(driver);
		WebElement em = l.getemail();
		WebElement pwd = l.getpassword();
		WebElement login = l.getLoginButton();
		driver.navigate().refresh();
		em.sendKeys("abc@gmail.com");
		pwd.sendKeys("abc@143");
		login.click();
		Thread.sleep(3000);
		driver.quit();
		
	}

}
