package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Realtimedatadriven {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		FileInputStream fis  = new  FileInputStream("./src/test/resources/Testdata/commandata.properties");
		Properties p1 = new Properties();
		p1.load(fis);
		String data = p1.getProperty("url");
		driver.get(data);
		 String un = p1.getProperty("username");
		driver.findElement(By.id("username")).sendKeys(un);
		 String pw = p1.getProperty("password");
		 driver.findElement(By.name("pwd")).sendKeys(pw);
		 driver.findElement(By.xpath("//div[text()='Login ']")).click();
		 Thread.sleep(6000);
		 driver.quit();
	
		
	}

}
