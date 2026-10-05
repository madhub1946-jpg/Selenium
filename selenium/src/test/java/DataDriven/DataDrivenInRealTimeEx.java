package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DataDrivenInRealTimeEx {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Method m = new Method();
	driver.get(m.ReadDatafromProperpty("url"));
	driver.findElement(By.id("username")).sendKeys(m.ReadDatafromProperpty("username"));
	driver.findElement(By.name("pwd")).sendKeys(m.ReadDatafromProperpty("password"));
	driver.findElement(By.id("loginButton")).click();
	driver.findElement(By.xpath("//span[text()='Tasks']")).click();
	driver.findElement(By.xpath("//div[@class='addNewButton']")).click();
	driver.findElement(By.xpath("//div[text()='New Customer']")).click();
	
	FileInputStream fis = new FileInputStream("./src/test/resources/Testdata/Employees.xlsx");
    Workbook wbf = WorkbookFactory.create(fis);
    String NewUser = wbf.getSheet("Customer Details").getRow(2).getCell(1).getStringCellValue();
    String Discription = wbf.getSheet("Customer Details").getRow(2).getCell(2).getStringCellValue();
    
    driver.findElement(By.xpath("//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")).sendKeys(NewUser);
    driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys(Discription);
    WebElement sinsele = driver.findElement(By.xpath("//div[@class='emptySelection']"));
	driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
	driver.findElement(By.id("customerLightBoxCloseButton")).click();
	
	Alert a = driver.switchTo().alert();
	String output = a.getText();
	System.out.println(output);
	a.accept();
	Thread.sleep(3000);
	driver.quit();
	}
	
}
