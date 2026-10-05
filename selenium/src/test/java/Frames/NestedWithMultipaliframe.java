package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedWithMultipaliframe {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/frames/nestedWithMultiple?sublist=3");
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		 String EMAIL = driver.findElement(By.xpath("//p[text()='Admin@gmail.com']")).getText();
		 driver.switchTo().frame(0);
		 driver.switchTo().frame(0);
		 driver.findElement(By.id("email")).sendKeys(EMAIL);
		 Thread.sleep(3000);
		 driver.switchTo().defaultContent();
		 driver.switchTo().frame(0);
		 String PWD = driver.findElement(By.xpath("//p[text()='Default Confirm Password']/preceding-sibling::p[text()='Admin@1234']")).getText();
		 Thread.sleep(3000);
		 driver.switchTo().frame(0);
		 driver.switchTo().frame(1);
		 driver.findElement(By.id("password")).sendKeys(PWD);
		 Thread.sleep(3000);
		 driver.switchTo().defaultContent();
		 driver.switchTo().frame(0);
		 String CPWD = driver.findElement(By.xpath("//p[text()='Default Confirm Password']/following-sibling::p[text()='Admin@1234']")).getText();
		 Thread.sleep(3000);
		 driver.switchTo().frame(0);
		 driver.switchTo().frame(2);
		 driver.findElement(By.id("confirm")).sendKeys(CPWD);
		 Thread.sleep(3000);
		 driver.switchTo().defaultContent();
		 driver.switchTo().frame(0);
		 driver.switchTo().frame(0);
		 driver.switchTo().frame(3);
		 driver.findElement(By.id("submitButton")).click();
		 driver.switchTo().defaultContent();
		 Thread.sleep(3000);
		 driver.quit();
		 
	}

}
