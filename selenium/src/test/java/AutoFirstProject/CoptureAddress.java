package AutoFirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CoptureAddress {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/madhu/OneDrive/Attachments/Desktop/Selenium.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	    WebElement element = driver.findElement(By.id("youtube"));
	    System.out.println(element);
	    element.click();
	    Thread.sleep(2000);
	    driver.quit();
	}

}
