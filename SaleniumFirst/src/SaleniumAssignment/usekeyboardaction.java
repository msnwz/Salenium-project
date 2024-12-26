package SaleniumAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class usekeyboardaction {
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
	driver.get("https://www.instagram.com/");
	
	WebElement un = driver.findElement(By.name("username"));
	un.sendKeys("udaychopra");
	un.sendKeys(Keys.CONTROL+"A");
	un.sendKeys(Keys.CONTROL+"C");
	
	WebElement pwd = driver.findElement(By.name("password"));
	pwd.sendKeys(Keys.CONTROL+"V");  
	
}
}
