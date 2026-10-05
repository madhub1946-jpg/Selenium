package AutoFirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Entergmail {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement Email = driver.findElement(By.name("email"));
		Email.sendKeys("madhub1946@gmail.com");
		Thread.sleep(2000);
		driver.quit();
		
	}

}
