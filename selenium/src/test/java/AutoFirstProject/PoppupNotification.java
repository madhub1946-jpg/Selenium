package AutoFirstProject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PoppupNotification {
	public static void main(String[] args) {
     ChromeOptions Option = new ChromeOptions();
     Option.addArguments("--disable notifications");
     WebDriver driver = new ChromeDriver(Option);
     driver.manage().window().maximize();
     driver.get("https://www.instagram.com/?hl=en");
     driver.quit();
	}
	

}
