package TestNGScriptes;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import comm.Actitime.GenericLibrary.Facebook;
@Listeners(ConnOverride.class)
public class Connection extends Facebook {
	@Test
	public void Actions() {
		driver.findElement(By.xpath("//span[text()='View Time-Track']")).click();
		driver.findElement(By.xpath("//td[text()='                Export to PDF            ']")).click();
		driver.findElement(By.name("closeViewTTPdfPreviewLightboxButton")).click();	
	}
	@Test
	public void Amezan12() {
		driver.findElement(By.xpath("//span[text()='View Time-Track']")).click();
		driver.findElement(By.xpath("//td[text()='                Export to PDF            ']")).click();
		driver.findElement(By.name("closeViewTTPdfPreviewLightboxButton")).click();	
		
	}

}
