package AutoFirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSlectDropdown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		Thread.sleep(3000);
		 WebElement code = driver.findElement(By.id("country_code"));
		 Select sr = new Select(code);
		 sr.selectByIndex(0);
		 Thread.sleep(3000);
		 driver.findElement(By.id("phone")).sendKeys("8050391946");
		 Thread.sleep(3000);
		 driver.findElement(By.id("male")).click();
		 Thread.sleep(3000);
		 WebElement country = driver.findElement(By.xpath("//div[@class='relative w-full mb-3']/child::select"));
		
		 Select s1 = new Select(country);
		 s1.selectByVisibleText("United Kingdom");
		 
		//WebElement element = driver.findElement(By.xpath("//option[text()='Select country']/parent::select"));
		//Select s = new Select(element);
		//s.selectByIndex(5);
	
	
	}
}
