package AutoFirstProject;

import org.openqa.selenium.chrome.ChromeDriver;

public class gettitle {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver Driver = new ChromeDriver();
		Driver.get("https://student.qspiders.com/login");
		Thread.sleep(5000);
		Driver.manage().window().maximize();
		 String Title = Driver.getTitle();//String URL = Driver.getCurrentUrl();
		 System.out.println(Title);//System.out.println(URL);
		Thread.sleep(5000);
		Driver.close();
	}

}
