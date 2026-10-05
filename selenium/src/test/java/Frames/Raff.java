package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Raff {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/frames?sublist=0");
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		driver.findElement(By.id("username")).sendKeys("Madhu");
		driver.findElement(By.id("password")).sendKeys("Madhu@143");
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		driver.get("https://vtu.ac.in/");
	}

}
