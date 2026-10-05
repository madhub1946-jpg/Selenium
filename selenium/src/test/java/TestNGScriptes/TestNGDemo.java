package TestNGScriptes;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo {
	@BeforeSuite
	public void ConnectingToDataBase() {
		Reporter.log("DataBase Connected Successfully",true);
	}
    @BeforeTest
	public void LaunchingtheBrowserAndparallelExecution() {
		Reporter.log("Launching The Browser Successfully",true);
	}
    @BeforeMethod
  public void Login() {
	  Reporter.log(" Login successfully ",true);
  }
   @Test
    public void Creat() {
    	Reporter.log(" Coustomer Creat Successfully",true);
    }
   @Test
   public void Delete() {
	   Reporter.log("Coustomer Delete Successfully",true);
   }
   @AfterMethod
 public void Logout() {
	 Reporter.log("Logout Successfuly",true);
 }
   @AfterTest
   public void closeBrowser() {
	   Reporter.log("Closeing The Browser Successfully",true);
   }
   @AfterSuite
   public void DisconnectingTheDatabase() {
	   Reporter.log("Disconnecting The Database Successfully",true);
   }
}
