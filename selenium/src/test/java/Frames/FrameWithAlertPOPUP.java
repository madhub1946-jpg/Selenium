package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameWithAlertPOPUP {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/frames?sublist=0");
		driver.findElement(By.xpath("//a[text()='Window Alert Frame']")).click();
		driver.findElement(By.xpath("//p[text()='A high-performance laptop with Retina display.']/following-sibling::button")).click();
	}

}
