package AutoFirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupCalanderHiddenDivision {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://renew.careinsurance.com/");
	driver.findElement(By.id("policyNumber")).sendKeys("1233");
	driver.findElement(By.id("dob")).click();
	driver.findElement(By.xpath("//div[@class='rmdp-header-values']/child::span[text()='2026']")).click();
	driver.findElement(By.xpath("//button[@aria-roledescription='button to navigate left']")).click();
	driver.findElement(By.xpath("//button[@aria-roledescription='button to navigate left']")).click();
	driver.findElement(By.xpath("//span[text()='2003']")).click();
	driver.findElement(By.xpath("(//span[text()='August'])[1]")).click();
	driver.findElement(By.xpath("//span[text()='January']")).click();
	driver.findElement(By.xpath("//span[text()='1']")).click();
	Thread.sleep(6000);
	driver.quit();
}
}
