package AutoFirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class PopupBrowerChildwindow {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://demoapps.qspiders.com/ui?scenario=1");
        driver.findElement(By.xpath("//section[text()='Popups']")).click();
        driver.findElement(By.xpath("//section[text()='Browser Windows']")).click();
        driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
        driver.findElement(By.xpath("//button[text()='Shop Now']")).click();
        Set<String> allwinid = driver.getWindowHandles();
        for (String winid : allwinid) {
            driver.switchTo().window(winid);
            driver.close();
            Thread.sleep(2000);
        }


    }
}