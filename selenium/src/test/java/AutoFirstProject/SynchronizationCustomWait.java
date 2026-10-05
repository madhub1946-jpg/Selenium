package AutoFirstProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SynchronizationCustomWait {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		int j = 0;
		while(j < 400) {
			try {
				driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
				break;
			} catch (Exception e) {
				j++;
			}
		}
		int k = 1;
		while (k < 300) {
			try {
				driver.findElement(By.xpath("//a[text()='Multi Select']")).click();
				break;
			} catch (Exception e) {
				k++;
			}
			
		}
		WebElement Multiva = driver.findElement(By.id("select-multiple-native"));
		Select s1 = new Select(Multiva);
		s1.selectByVisibleText("Fjallraven - Foldsac...");
		s1.selectByVisibleText("Mens Cotton Jacket...");
		s1.selectByVisibleText("Mens Casual Slim Fit...");

		s1.selectByVisibleText("John Hardy Women's L...");
		String firstOption = s1.getFirstSelectedOption().getText();
		System.out.println("Selected the First Option = "+firstOption);
		System.out.println("//Selected All The Options\\");
		List<WebElement> AllOption = s1.getAllSelectedOptions();
		int count = AllOption.size();
		for (int i = 0; i < count; i++) {
			String Relise = AllOption.get(i).getText();
			System.out.println(Relise);
		}
		driver.quit();
		
	}
   
}

