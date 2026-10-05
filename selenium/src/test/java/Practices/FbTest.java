package Practices;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import comm.Actitime.GenericLibrary.Facebook;

public class FbTest extends Facebook {
	@Test
	public void Actions() throws AWTException, InterruptedException {
		driver.findElement(By.xpath("//span[text()='Corporate Calendar']")).click();
		driver.findElement(By.xpath("(//div[@class='components_day monthDay editable corporateHoliday'])[3]")).click();
		
		int scrol = driver.findElement(By.xpath("//div[text()='December']")).getLocation().getY();
		JavascriptExecutor j =  (JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,"+scrol+")");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@class='titleInput'])[3]")).click();
		Thread.sleep(3000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_BACK_SPACE);
		driver.findElement(By.xpath("(//input[@class='titleInput'])[3]")).sendKeys("Death");
		driver.findElement(By.xpath("(//div[text()='Mark as a Working Day'])[8]")).click();
	}
	@Test
	public void Bction2() {
		driver.findElement(By.xpath("//span[text()='Tasks']")).click();
		driver.findElement(By.xpath("//div[@class='addNewButton']")).click();
		driver.findElement(By.xpath("//div[text()='New Tasks']")).click();
		driver.findElement(By.id("closeCreateTasksPopupButton")).click();
		
	}

}
