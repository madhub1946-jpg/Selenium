package AutoFirstProject;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupAlert {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		driver.findElement(By.xpath("//td[text()='Levis Shirt']/preceding-sibling::td/child::input")).click();
		driver.findElement(By.id("deleteButton")).click();
		  Alert a = driver.switchTo().alert();
		  String text = a.getText();
		  System.out.println(text);
		  a.accept();//	a.dismiss();
        driver.quit();
	}

}
