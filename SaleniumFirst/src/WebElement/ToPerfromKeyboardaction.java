package WebElement;

import java.sql.DriverManager;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerfromKeyboardaction {
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://www.google.co.in/");
	driver.findElement(By.id("APjFqb")).sendKeys("oneplus",Keys.ENTER);
	
}
}
