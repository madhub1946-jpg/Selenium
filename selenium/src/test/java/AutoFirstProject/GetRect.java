package AutoFirstProject;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRect {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vtu.ac.in/");
		Thread.sleep(3000);
		Rectangle value = driver.findElement(By.xpath("//img[@src='https://vtu.ac.in/wp-content/uploads/2020/09/Karnataka-rightlogo.png']")).getRect();
		Thread.sleep(3000);
		int xaxis = value.getX();
		  int yaxis = value.getX();
		  
		  int height = value.getHeight();
		  int width = value.getWidth();
		  
		  System.out.println( "x Axis = " + xaxis + " y Axis =" + yaxis + " Height is =" + height + "width is =" + width );
		Thread.sleep(3000);
		driver.quit();
	}

}
