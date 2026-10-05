package TestNGScriptes;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupExecution {
	@Test(priority = 0,invocationCount = 10,groups = "Integration")
	public void Register() {
		Reporter.log("Customer is Registered in that Application",true);
	}
	@Test(priority = 1,groups = "Smoke")
	public void Login() {
		Reporter.log("Customer Login the application",true);
	}
	@Test(priority = 2,dependsOnMethods = "Logout")
	public void EditProfile() {
		Reporter.log("Customer Edit the Profile In Application",true);
		
	}
	@Test(priority =  3,groups = "functional")
	public void Logout() {
		Assert.fail();//failing the TestScript
		Reporter.log("Customer Logout  in the Application",true);
	}
	
}
