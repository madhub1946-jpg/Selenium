package AutoFirstProject;

import org.openqa.selenium.firefox.FirefoxDriver;

public class GotoYoutube {
	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver S1 = new FirefoxDriver();
		Thread.sleep(5000);
		S1.get("https://www.facebook.com/");
		Thread.sleep(50000);
		S1.close();
	}
	
	
	}


