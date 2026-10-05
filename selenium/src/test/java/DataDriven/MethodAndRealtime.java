package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodAndRealtime {
	public String ReadDatafrompraperty(String key) throws IOException {
		FileInputStream fis  = new FileInputStream("./src/test/resources/Testdata/commandata.properties");
		Properties p = new  Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		MethodAndRealtime m = new MethodAndRealtime();
		String URL = m.ReadDatafrompraperty("url");
		String UN = m.ReadDatafrompraperty("username");
		String PWD = m.ReadDatafrompraperty("password");
		
		driver.get(URL);
		driver.findElement(By.id("username")).sendKeys(UN);
		driver.findElement(By.name("pwd")).sendKeys(PWD);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(4000);
		driver.quit();
		
		
		
	
	}
}
