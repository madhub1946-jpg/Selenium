package AutoFirstProject;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POPUPmultiwindowhandles {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//section[text()='Browser Windows']")).click();
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		driver.findElement(By.xpath("//button[text()='Shop Now']")).click();
		
		 Set<String> windows = driver.getWindowHandles();
		  Iterator<String> itr = windows.iterator();
		   String parent = itr.next();
		   String child1 = itr.next();
		   String child2 = itr.next();
		   String child3 = itr.next();
		   
		   for (String win : windows) {
			   if (!win.equals(parent)) {
				   driver.switchTo().window(win);
				   System.out.println(driver.getTitle());
				   driver.close();		
			}
			
		}
		   
     }
    
	}
//driver.switchTo().window(child1);
//@Nullable
//String tex1 = driver.getTitle();
//System.out.println(tex1);
//driver.close();
//driver.switchTo().window(child2);
// @Nullable
//String tex2 = driver.getTitle();
//System.out.println(tex2);
//driver.close();
//driver.switchTo().window(child3);
//String  tex3 = driver.getTitle();
//System.out.println(tex3);
//Thread.sleep(3000);
//driver.close();
