package AutoFirstProject;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWinIdHandles {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//section[text()='Browser Windows']")).click();
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		driver.findElement(By.xpath("//button[text()='Shop Now']")).click();
		Set<String> AllwinId = driver.getWindowHandles();
		// System.out.println(AllwinId);
		for (String win : AllwinId) {
			System.out.println(win);

	}
		driver.quit();
	
	}

}
//without Quit() close the Windows//
//for (String win : AllwinId) {
	//driver.switchTo().window(win);
	//System.out.println(win);
	//driver.close();

