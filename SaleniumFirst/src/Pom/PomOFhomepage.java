package Pom;

import javax.management.loading.PrivateClassLoader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomOFhomepage {
// Constructor
	public PomOFhomepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Register")
	private WebElement register;
	
	@FindBy(linkText = "Log in")
	private WebElement login;

	public WebElement getRegister() {
		return register;
	}

	public WebElement getLogin() {
		return login;
	}
	
	
}
