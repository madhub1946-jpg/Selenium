package AutoFirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSelectAllOptions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		Thread.sleep(2000);
		 WebElement element = driver.findElement(By.id("select-multiple-native"));
		 Thread.sleep(2000);
		Select s1 = new Select(element);
		 String Resise = s1.getWrappedElement().getText();
		 System.out.println(Resise);
		  boolean output = s1.isMultiple();
		  if (output == true) {
			  System.out.println("Dropdown is MultiSelect");
			
		} else {
			System.out.println("Dropdown is Single Select");

		}
		 //::Without Using For loop :://
		  //List<WebElement> AllOption = s1.getOptions();
		 //int count = AllOption.size();
		 //System.out.println(count);
		// for (int i = 0; i < count; i++) {
		//String Relise = AllOption.get(i).getText();
		//System.out.println(Relise);
		//}
		Thread.sleep(2000);
		driver.quit();
		//::Here We using Findelements Instead of getOptions();
		 //List<WebElement> AllOption = driver.findElements(By.id("select-multiple-native"));
		//int count = AllOption.size();
		//for (int i = 0; i < count; i++) {
		//	String Relise = AllOption.get(i).getText();
		//	System.out.println(Relise);
		//   }
	}

}
