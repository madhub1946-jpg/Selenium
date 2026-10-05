package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/frames?sublist=0");
		driver.findElement(By.xpath("//a[text()='Nested iframe']")).click();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		String EMAIL = driver.findElement(By.xpath("//p[text()='Admin@gmail.com']")).getText();
		driver.switchTo().frame(0);
		driver.findElement(By.id("email")).sendKeys(EMAIL);
		driver.switchTo().parentFrame();
		String PWD = driver.findElement(By.xpath("//p[text()='Default Email']/following-sibling::p[text()='Admin@gmail.com']")).getText();
		driver.switchTo().frame(0);
		driver.findElement(By.id("password")).sendKeys(PWD);
		driver.findElement(By.id("confirm-password")).sendKeys("Admin@1234");
		driver.findElement(By.id("submitButton")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.quit();
		
		
		
	}

}
