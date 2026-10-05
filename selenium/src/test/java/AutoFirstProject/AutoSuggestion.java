package AutoFirstProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[@role='button']")).click();
		driver.findElement(By.name("q")).sendKeys("I Phone17");
		
		List<WebElement> AutoValue = driver.findElements(By.xpath("//li[@class='Swx5kP']"));
	    int count = AutoValue.size();
	    for (int i = 0; i < count; i++) {
	    	 String OutPut = AutoValue.get(i).getText();
	    	 System.out.println(OutPut);	
		}
       driver.quit();
	
	}
}