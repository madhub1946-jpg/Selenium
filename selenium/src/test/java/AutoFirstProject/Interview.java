package AutoFirstProject;

import java.time.Duration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Interview {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[@role='button']")).click();
		Set<String> products = new LinkedHashSet<>();

        while (true) {

            // Get all product titles from current page
            List<WebElement> titles =
                    driver.findElements(By.xpath("//h2"));

            // Add titles to Set
            for (WebElement title : titles) {
                products.add(title.getText());
            }

            // Find Next button
            WebElement next =
                    driver.findElement(By.xpath("//button[text()='Next']"));

            // Stop when Next is disabled
            if (!next.isEnabled()) {
                break;
            }

            // Go to next page
            next.click();
        }

        // Display all product titles
        System.out.println("Product Titles:");

        for (String product : products) {
            System.out.println(product);
        }

        // Close browser
        driver.quit();
    }
}
		


