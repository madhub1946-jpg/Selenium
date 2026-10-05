package AutoFirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getlocation {
	public static void main(String[] args) throws InterruptedException  {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	 Thread.sleep(3000);
	driver.get("https://vtu.ac.in/");
	 Thread.sleep(3000);
	 int xaxis = driver.findElement(By.xpath("//img[@src='https://vtu.ac.in/wp-content/uploads/2020/09/Karnataka-rightlogo.png']")).getLocation().getX();
	 int yaxis = driver.findElement(By.xpath("//img[@src='https://vtu.ac.in/wp-content/uploads/2020/09/Karnataka-rightlogo.png']")).getLocation().getY();
	 Thread.sleep(3000);
	 int height = driver.findElement(By.xpath("//img[@src='https://vtu.ac.in/wp-content/uploads/2020/09/Karnataka-rightlogo.png']")).getSize().getHeight();
	 int width = driver.findElement(By.xpath("//img[@src='https://vtu.ac.in/wp-content/uploads/2020/09/Karnataka-rightlogo.png']")).getSize().getWidth();	
	 Thread.sleep(3000);
	 System.out.println(
			    "X = " + xaxis +
			    ", Y = " + yaxis +
			    ", Height = " + height +
			    ", Width = " + width
			);
	 Thread.sleep(3000);
	 driver.quit();
	 
	}

}
