package Pom;

import javax.management.loading.PrivateClassLoader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomOfLoginPage {
	    // Constructor
		public pomOfLoginPage (WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
			@FindBy(id = "Email")
			private WebElement  emailfield;
			
			@FindBy(id = "Password")
			private WebElement  passwordfield;
			
			@FindBy(xpath = "//input[@value='Log in']")
			 private WebElement loginbutton;

			public WebElement getEmailfield() {
				return emailfield;
			}

			public WebElement getPasswordfield() {
				return passwordfield;
			}

			public WebElement getLoginbutton() {
				return loginbutton;
			}
			
			
}
