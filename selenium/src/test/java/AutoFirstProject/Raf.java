package AutoFirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Raf {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@role='button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("Hp laptops");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//div[contains(text(),'HP Victus Intel Core i5 13th')]")).click();
        Thread.sleep(3000);
        String text = driver.findElement(By.xpath("//div[contains(text(),'HP Victus Intel Core i5 13th')]")).getText();
        System.out.println(text);
        Thread.sleep(3000);
        driver.quit();
        
        
        
	}
	}
