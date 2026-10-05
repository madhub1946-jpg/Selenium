package comm.Actitime.GenericLibrary;

import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Facebook {
	public static WebDriver driver;
	FileUtility fis  = new FileUtility();
	@BeforeSuite
	public void ConnectWithDatabase() {
		Reporter.log("DataBase Connected Successfully",true);
	}
	@BeforeTest
public void LaunchBrowser() throws IOException {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	String url = fis.ReadDatafromProperpty("url");
	driver.get(url);
	Reporter.log("Browser is Launch Successfully",true);

}
	@BeforeMethod
	public void Login() throws IOException {
		String un = fis.ReadDatafromProperpty("username");
		 driver.findElement(By.id("username")).sendKeys(un);
		String pwd = fis.ReadDatafromProperpty("password");
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		 driver.findElement(By.xpath("//div[text()='Login ']")).click();
		 Reporter.log("Login Successfully",true);
		
	}
	@AfterMethod
	public void Logout() {
		driver.findElement(By.xpath("//button[@data-testid='popup_menu_button_profile']")).click();
		driver.findElement(By.xpath("//div[text()='Logout']")).click();
		Reporter.log("Logout Succesfully ",true);
	}
	@AfterTest
	public void Close() {
		driver.quit();
		Reporter.log("Browser is Closed",true);
	}
	public void DisconnectingDataBase() {
		Reporter.log("Disconnecting The DataBase Successfully",true);
	}
}
