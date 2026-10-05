package AutoFirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodEnableorDisable {
	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//main[@class='w-[100%] h-[14.5rem] ps-7 flex flex-col justify-around p-[0.5rem] rounded bg-[#feebfc] hover:shadow-slate-400 shadow-lg group aos-init aos-animate']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[text()='Disabled']")).click();
		Thread.sleep(3000);
		 boolean value = driver.findElement(By.id("email")).isEnabled();
		 Thread.sleep(3000);
		 if (value == true) {
			 System.out.println("Text field is Displayed");
			
		} else {
			System.out.println("Text fild is Not Displayed");

		}
		 Thread.sleep(3000);
		 driver.quit();
	}
}


