package MouseAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropXaxisYaxis {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/dragDrop?sublist=0");
		 WebElement middleelement = driver.findElement(By.xpath("//div[text()='Drag Me']"));
		 Actions a = new Actions(driver);
		 a.dragAndDropBy(middleelement, 100, -100).perform();
		 Thread.sleep(3000);
		 a.dragAndDropBy(middleelement, -100, 100).perform();
		 Thread.sleep(3000);
		 driver.quit();
	}

}
