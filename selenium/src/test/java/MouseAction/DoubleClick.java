package MouseAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		driver.findElement(By.xpath("//a[text()='Double Click']")).click();
		 WebElement DoubleClick = driver.findElement(By.id("btn_a"));
		 
		 Actions a = new Actions(driver);
		 a.doubleClick(DoubleClick).perform();
		 
		 Thread.sleep(3000);
		 driver.quit();
	}

}
