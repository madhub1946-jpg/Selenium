package AutoFirstProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	
    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Amezon");
	Thread.sleep(3000);
	 List<WebElement> autore = driver.findElements(By.xpath("//div[@style='flex: 1 1 0%; height: auto;']"));
	 Thread.sleep(3000);
	 int count = autore.size();
	 System.out.println(autore);
	for (int i = 0; i < count; i++) {
		String value = autore.get(i).getText();
		System.out.println(value);
		Thread.sleep(3000);
		driver.quit();
		
	}
}
}
