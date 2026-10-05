package AutoFirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/madhu/OneDrive/Attachments/Desktop/Selenium.html");
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("ecommer")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
//useing currently ID.name,linkText,partialLinkText,css
//driver.findElement(By.linkText("zomato")).click();<a
//driver.findElement(By.partialLinkText("ecommer")).click();<a........Zomato</a>
//driver.findElement(By.className("link")).click(); Defoult
//we are not useing classname and Tagname becouse of some drawback its executed from Starting
