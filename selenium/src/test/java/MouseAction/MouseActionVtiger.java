package MouseAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionVtiger {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.vtiger.com/");
		 WebElement element = driver.findElement(By.id("companyDropdown"));
		 Actions a = new Actions(driver);
		 a.moveToElement(element).perform();
		 driver.findElement(By.xpath("//a[text()='Contact Us']")).click();
	}

}
