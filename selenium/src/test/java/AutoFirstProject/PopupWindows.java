package AutoFirstProject;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupWindows {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/browser");
		
		driver.findElement(By.xpath("//h2[text()='Watches']/following-sibling::button")).click();
		driver.findElement(By.xpath("//p[text()='A luxury watch with excellent craftsmanship.']/following-sibling::button")).click();
		
		 Set<String> window = driver.getWindowHandles();
		  Iterator<String> itr = window.iterator();
		   String parent = itr.next();
		   String child = itr.next();
		 driver.switchTo().window(child);  
		 driver.close();
	}

}
