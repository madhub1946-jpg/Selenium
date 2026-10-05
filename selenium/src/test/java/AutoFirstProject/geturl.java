package AutoFirstProject;

import org.openqa.selenium.firefox.FirefoxDriver;

public class geturl {
	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver Fox = new FirefoxDriver();
		Fox.get("https://www.facebook.com/");
		Fox.manage().window().maximize();
		String Title = Fox.getTitle();
		System.out.println(Title);
		Thread.sleep(2000);
		String URL = Fox.getCurrentUrl();
		System.out.println(URL);
		Thread.sleep(2000);
		String Source = Fox.getPageSource();
		System.out.println(Source);
		Thread.sleep(2000);
		
		Fox.quit();
		
	}

}
