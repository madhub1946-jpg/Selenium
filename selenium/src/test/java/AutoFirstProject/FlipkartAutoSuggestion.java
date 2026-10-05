package AutoFirstProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAutoSuggestion {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@role='button']")).click();
		
		driver.findElement(By.name("q")).sendKeys("Iphone 15");
		Thread.sleep(3000);
		 List<WebElement> Autorefer = driver.findElements(By.xpath("//lI[@class='Swx5kP']"));
		 int count = Autorefer.size();
		 System.out.println(count);
		 
		 for (int i = 0; i < count; i++) {
		String texts = Autorefer.get(i).getText();
		System.out.println(texts);
			
		}
	}
}
