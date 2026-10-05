package TestNGScriptes;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class PracticesTestng {
	@Test(priority = 1,invocationCount = 2,dependsOnMethods = "Logout")
	public void signUp() {
		Reporter.log("User id And password Is Successfully Created");
	}
	@Test(priority = 2)
	public void Login() {
		Reporter.log("Account is created");
	}
	@Test(priority = 3)
	public void ProfileEdit() {
		Reporter.log("Profile is Edited");
	}
	@Test(priority = 4)
	public void AddPost() {
		Assert.fail();
		Reporter.log("Add one Postb to instagram");
	}
	@Test(priority = 5)
    public void Logout() {
        Reporter.log(" Logout");	
}
}
