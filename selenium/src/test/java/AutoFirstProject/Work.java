package AutoFirstProject;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Work {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");
		driver.findElement(By.xpath("//td[text()='Levis Shirt']/preceding-sibling::td/child::input")).click();
		driver.findElement(By.xpath("//td[text()='SAMSUNG Galaxy']/preceding-sibling::td/child::input")).click();
		driver.findElement(By.xpath("//td[text()='APPLEIPhone']/preceding-sibling::td/child::input")).click();
		driver.findElement(By.xpath("//td[text()='HP Envy']/preceding-sibling::td/child::input")).click();
		driver.findElement(By.id("deleteButton")).click();
		  Alert A1 = driver.switchTo().alert();
		   String text = A1.getText();
		   System.out.println(text);
		  Thread.sleep(2000);
		  A1.accept();
		  
		  driver.quit();
	}
	
	
	}
	
        	
	
		

