package AutoFirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/madhu/OneDrive/Attachments/Desktop/Selenium.html");
		Thread.sleep(2000);
		driver.findElement(By.id("youtube")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.id("zomato")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.id("zeepty")).click();
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
