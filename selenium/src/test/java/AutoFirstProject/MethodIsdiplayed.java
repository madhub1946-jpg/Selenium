package AutoFirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodIsdiplayed {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/");
		 boolean output = driver.findElement(By.xpath("//img[@data-hawkins-id='BrandNetflixLogotype']")).isDisplayed();
		 if (output == true){
			 System.out.println("Logo is Displayed");
		}else {
			System.out.println("Logo is  not Displayed");
			
		}
		 Thread.sleep(3000);
		 driver.quit();
	}
}
//
