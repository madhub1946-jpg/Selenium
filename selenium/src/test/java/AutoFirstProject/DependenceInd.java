package AutoFirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DependenceInd {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		 Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@role='button']")).click();
		 Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("realme 14T");
		 Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		 Thread.sleep(3000);
		String value = driver.findElement(By.xpath("//div[text()='realme 14T 5G (OBSIDIAN BLACK, 128 GB)']/ancestor::a/descendant::div[@class='hZ3P6w DeU9vF']")).getText();
        System.out.println(value);
        Thread.sleep(3000);
        driver.quit();
		
	}
	}
