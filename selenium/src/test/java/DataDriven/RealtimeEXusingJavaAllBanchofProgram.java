package DataDriven;

import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RealtimeEXusingJavaAllBanchofProgram {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Method m  = new Method();
		 String URL = m.ReadDatafromProperpty("url");
		 String UN = m.ReadDatafromProperpty("username");
		 String PWD = m.ReadDatafromProperpty("password");
		 
		 driver.get(URL);
		 driver.findElement(By.id("username")).sendKeys(UN);
		 driver.findElement(By.name("pwd")).sendKeys(PWD);
		 driver.findElement(By.xpath("//div[text()='Login ']")).click();
		 Thread.sleep(6000);
		 driver.quit();
		 

		
		 
		
				
				
				

	}
}

 


