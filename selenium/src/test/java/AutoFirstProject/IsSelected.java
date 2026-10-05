package AutoFirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/checkbox?sublist=0");
		Thread.sleep(2000);
		boolean Output = driver.findElement(By.id("domain_a")).isSelected();
		if (Output == true) {
			System.out.println("Option is Selected");
			
		} else {
			System.out.println("Option is  Not Selected");

		}
		Thread.sleep(2000);
		driver.quit();
	}

}
