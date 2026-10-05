package MouseAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropPosition {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(18));
		driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=2");
		WebElement item1 = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		WebElement item2 = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		WebElement des = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		
		 WebElement item3 = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement item4 = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		WebElement des1 = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		
		Actions a = new Actions(driver);
		a.dragAndDrop(item1, des).perform();
		a.dragAndDrop(item2, des).perform();
		a.dragAndDrop(item3, des1).perform();
		a.dragAndDrop(item4, des1).perform();
		
		Thread.sleep(40000);
		driver.quit();
	}

}
