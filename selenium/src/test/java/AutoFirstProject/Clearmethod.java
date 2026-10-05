package AutoFirstProject;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clearmethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(3000);
		driver.findElement(By.id("name")).sendKeys("Madhu B");
		Thread.sleep(3000);
	
		String value = driver.findElement(By.id("name")).getAttribute("placeholder");
		System.out.println(value);
		Thread.sleep(3000);
		 String values = driver.findElement(By.xpath("//span[text()='Write a script to enter data into Text field?']")).getCssValue("font-size");
		 System.out.println(values);
		Thread.sleep(3000);
		 
		 String value2s = driver.findElement(By.xpath("//span[text()='Write a script to enter data into Text field?']")).getTagName();
		 System.out.println(value2s);
		Thread.sleep(3000);
		 
		driver.findElement(By.id("name")).clear();
		Thread.sleep(3000);
	
	}

}
//here we use xpath by text();
//we learn here getAttribute() , getcssvalue(),getTagname() and clear(),
