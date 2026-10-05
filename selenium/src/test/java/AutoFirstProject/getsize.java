package AutoFirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getsize {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		 Dimension value = driver.findElement(By.xpath("//span[text()='Explore the things ']")).getSize();
		 Thread.sleep(3000);
		int heigth = value.height;
		int width = value.width;
		System.out.println(value );
		System.out.println(heigth);
		System.out.println(width);
		Thread.sleep(3000);
		driver.quit();
	}

}
