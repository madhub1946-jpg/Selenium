package Pom;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//declaartion
public class LoginCon {
	@FindBy(name = "email") private WebElement  EmailAddress;
	@FindBy(name = "pass") private WebElement PwdAddress;
	@FindBy(xpath = "//span[text()='Log in']") private WebElement LoginButton;
	
	//intilization
	public LoginCon(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
   //utilisation
	public WebElement getEmailAddress() {
		return EmailAddress;
	}

	public WebElement getPwdAddress() {
		return PwdAddress;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}

}
