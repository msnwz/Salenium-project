package Pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;

public class DMS_TC_001 {
public static void main(String[] args) {
	
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://demowebshop.tricentis.com/");
	
	PomOFhomepage hp= new PomOFhomepage(driver);
	hp.getLogin().click();
	
	pomOfLoginPage lp= new pomOfLoginPage(driver);
	lp.getEmailfield().sendKeys("msnwz");
	lp.getPasswordfield().sendKeys("msnwz");
	lp.getLoginbutton().click();
}

}
