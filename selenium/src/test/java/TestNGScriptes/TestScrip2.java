package TestNGScriptes;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScrip2 {
	@Test(priority = 0,invocationCount = 10)//Printing same test script in Multipal Times
	public void Register() {
		Reporter.log("Customer is Registered in that Application",true);//it's print and console and Report
	}
	@Test(priority = 1)
	public void Login() {
		Reporter.log("Customer Login the application",true);
	}
	@Test(priority = 2,dependsOnMethods = "Logout")
	public void EditProfile() {
		Reporter.log("Customer Edit the Profile In Application",true);
		
	}
	@Test(priority =  3)
	public void Logout() {
		Assert.fail();//failing the TestScript
		Reporter.log("Customer Logout  in the Application",true);
	}
	
}
