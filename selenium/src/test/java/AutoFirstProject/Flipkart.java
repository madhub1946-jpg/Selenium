package AutoFirstProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//span[@role='button']")).click();
		 Thread.sleep(3000);
		 List<WebElement> spans = driver.findElements(By.xpath("//span"));
		  int count = spans.size();
		  System.out.println(count);
		  for(int i = 0; i < count; i++) {
			  String text = spans.get(i).getText();
			  System.out.println(text);
		  }
		  driver.quit();
	}

}
