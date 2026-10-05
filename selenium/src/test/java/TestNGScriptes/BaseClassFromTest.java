package TestNGScriptes;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import comm.Actitime.GenericLibrary.BaseClass;
import net.bytebuddy.implementation.Implementation;

@Listeners(Listener.class)//class name of MethodOverrid that we to enter inside the Brackets

public class BaseClassFromTest extends BaseClass  {
	@Test
public void HomePageActions() {
		driver.findElement(By.xpath("//span[text()='View Time-Track']")).click();
		driver.findElement(By.xpath("//td[text()='                Export to PDF            ']")).click();
		driver.findElement(By.name("closeViewTTPdfPreviewLightboxButton")).click();	
	
}
	

}
