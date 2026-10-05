package AutoFirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(3000);
		driver.findElement(By.name("search_query")).sendKeys("kgf songs");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@title='Search']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("video-title")).click();
		Thread.sleep(3000);
		
	}

}
