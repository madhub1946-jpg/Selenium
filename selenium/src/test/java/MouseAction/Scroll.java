package MouseAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.bbc.com/");
	int scrol = driver.findElement(By.xpath("//h2[text()='Watch']")).getLocation().getY();
	
	JavascriptExecutor j =  (JavascriptExecutor)driver;
	j.executeScript("window.scrollBy(0,"+scrol+")");
	Thread.sleep(2000);
	}

}
