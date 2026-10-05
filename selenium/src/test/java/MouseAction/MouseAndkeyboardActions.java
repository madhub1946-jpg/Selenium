package MouseAction;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAndkeyboardActions {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		  WebElement elements = driver.findElement(By.xpath("//span[text()='Forgotten password?']"));
		  Actions a  = new Actions(driver);
		  a.contextClick(elements).perform();//Right click
		  
		  Thread.sleep(3000);
		  Robot r = new Robot();
		  r.keyPress(KeyEvent.VK_T);
		  Thread.sleep(3000);
		  
		  driver.quit();
	}

}
