package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multipalframes {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		driver.findElement(By.id("email")).sendKeys("Admin@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Admin@1234");
		driver.findElement(By.id("confirm-password")).sendKeys("Admin@1234");
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		Thread.sleep(3000);
		driver.switchTo().frame(1);
		driver.findElement(By.id("username")).sendKeys("SuperAdmin@gmail.com");
		driver.findElement(By.id("password")).sendKeys("SuperAdmin@1234");
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.quit();
		
	}
	
}
