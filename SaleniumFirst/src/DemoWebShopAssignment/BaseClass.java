package DemoWebShopAssignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

public class BaseClass {
	public WebDriver driver;

	String expectedtitle = "Demo Web Shop";
    @Parameters("browser")
	@BeforeClass
	public void tolauch (@Optional("edge")String bname) {
    	if (bname.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}else if (bname.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}else if (bname.equalsIgnoreCase("opera")) {
			//driver=new 
		}
		
		Reporter.log("browser got launched", true);
		driver.manage().window().maximize();
		Reporter.log("browser got msximized", true);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	}

	@BeforeMethod
	public void tologin() throws IOException {
		// Read properties from file
		FileInputStream fis = new FileInputStream("./Testdata/demowebshop.properties");
		Properties ps = new Properties();
		ps.load(fis);

		String url = ps.getProperty("url");
		String firstname = ps.getProperty("Firstname");
		String lastname = ps.getProperty("Lastname");
		String email = ps.getProperty("email");
		String password = ps.getProperty("Password");

		driver.get(url);
		String actualtital = driver.getTitle();
		/*if (actualtital.equals(expectedtitle)) {
			Reporter.log("navigated to the web application succesfully", true);
		} else {
			Reporter.log("error in navigating to application", true);
		}*/
		
		// using assert to validate
		Assert.assertEquals(actualtital, expectedtitle);
		Reporter.log("navigated to the web application succesfully", true);

		// Click the "Log in" link
		driver.findElement(By.linkText("Log in")).click();

		// Enter email
		WebElement emailtextfield = driver.findElement(By.id("Email"));
		emailtextfield.clear();
		emailtextfield.sendKeys(email);
		String emailField = emailtextfield.getAttribute("value");

		/*if (emailField.equals(email)) {
			Reporter.log("Email text field verified", true);
		} else {
			Reporter.log("Error in email text field", true);
		}*/
		
		// using assert to validate
			Assert.assertEquals(emailField, email);
			Reporter.log("Email text field verified", true);

		// Enter password
		WebElement passwordtextfield = driver.findElement(By.id("Password"));
		passwordtextfield.clear();
		passwordtextfield.sendKeys(password);
		String passwordField = passwordtextfield.getAttribute("value");

		/*if (passwordField.equals(password)) {
			Reporter.log("Password text field verified", true);
		} else {
			Reporter.log("Error in password text field", true);
		}*/
		
		// using assert to validate
		Assert.assertEquals(passwordField, password);
		Reporter.log("Password text field verified", true);

		// Click the login button
		driver.findElement(By.cssSelector("input[type='submit'][value='Log in']")).click();
		Reporter.log("Login button clicked", true);
	}

	@AfterMethod
	public void logout() {
		driver.findElement(By.linkText("Log out")).click();
		Reporter.log("application logout succesfully", true);
	}

	@AfterClass
	public void quit() {
		Reporter.log("browser quit succesfully", true);
		driver.quit();
	}
}
