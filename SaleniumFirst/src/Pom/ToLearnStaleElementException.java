package Pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnStaleElementException {
public static void main(String[] args) {
	
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://www.facebook.com/");
	
	WebElement emailfield = driver.findElement(By.id("email"));
	emailfield.sendKeys("shahnawaz");
	
	driver.navigate().refresh();
	
	emailfield.sendKeys("shahnawaz");
	
}
}
