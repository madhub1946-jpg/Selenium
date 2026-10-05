package comm.Actitime.GenericLibrary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	public static WebDriver driver;
	FileUtility f = new FileUtility();
	@BeforeSuite
	public void ConnectWithDatabase() {
		Reporter.log("DataBase is Successfully Connected",true);
	}
	@BeforeTest
	public void LaunchBrowser() throws IOException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String url = f.ReadDatafromProperpty("url");
		driver.get(url);
		Reporter.log("Browser Launched Successfully",true);
	}
	@BeforeMethod
	public void Login() throws IOException {
		String un = f.ReadDatafromProperpty("username");
		driver.findElement(By.id("username")).sendKeys(un);
		 String pwd = f.ReadDatafromProperpty("password");
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
	}
	@AfterMethod
	public void Logout() {
	driver.findElement(By.xpath("//button[@data-testid='popup_menu_button_profile']")).click();
	driver.findElement(By.xpath("//div[text()='Logout']")).click();
	}
	@AfterTest
	public void ClouseBrowser() {
		driver.quit();
		Reporter.log("Browser is Cloused",true);
	}
	@AfterSuite
	public void DisconnectDatabase() {
		Reporter.log("Database is Disconnect",true);
	}
	
}

