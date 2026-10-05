package DataDriven;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseMethedUnderUpdate {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
     	WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
     	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		BaseMethod B = new BaseMethod();//Same Object class for everyone
		
		driver.get(B.ReadDatafromProperpty("url"));
		driver.findElement(By.id("username")).sendKeys(B.ReadDatafromProperpty("username"));
		driver.findElement(By.name("pwd")).sendKeys(B.ReadDatafromProperpty("password"));
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		driver.quit();
	
		String data = B.readDatafromExcel("Customer Details", 1, 1);	
		System.out.println(data);
		
//		 double data1 = B.readDataforExcelNumericvalue("Customer Details", 1, 1);
//		 System.out.println(data1);  
		B.UpdateOfExcelFile("Customer Details", 1, 1, "Mahanthesh");
	}

}
