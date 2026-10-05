package AutoFirstProject;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupFileUplode {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
		File f = new File("./src/test/resources/Testdata/MDRESUME.pdf");
		String path = f.getAbsolutePath();
		Thread.sleep(5000);
		driver.findElement(By.id("resume")).sendKeys(path);
		Thread.sleep(5000);
		driver.quit();
	}

}
