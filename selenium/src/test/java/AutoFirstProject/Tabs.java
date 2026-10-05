package AutoFirstProject;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tabs {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	driver.findElement(By.xpath("//section[text()='Popups']")).click();
	driver.findElement(By.xpath("//section[text()='Browser Windows']")).click();
	driver.findElement(By.xpath("//a[text()='New Tab']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//h2[text()='Laptop']/following-sibling::button")).click();
	 Set<String> windows = driver.getWindowHandles();
	  Iterator<String> itr = windows.iterator();
	   String patab = itr.next();
	   String ctab = itr.next();
	   driver.switchTo().window(ctab);   
	 String text = driver.findElement(By.xpath("//h1[text()='High-Performance Laptop']")).getText();
	 System.out.println(text);
	 driver.quit();
}
}

