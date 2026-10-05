package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class practiceLoconn {
	@FindBy(name = "email") private WebElement email;
	@FindBy(name = "pass") private WebElement password;
	@FindBy(xpath = "//span[text()='Log in']") WebElement LoginButton;
	
	public practiceLoconn (WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	public WebElement getemail() {
		return email;	
	}
	public WebElement getpassword() {
		return password;
	}
	public WebElement getLoginButton() {
		return LoginButton;
	}
}
