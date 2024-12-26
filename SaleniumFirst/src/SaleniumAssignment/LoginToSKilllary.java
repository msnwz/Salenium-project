package SaleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToSKilllary {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver(); //to perform cross browser testing
	driver.manage().window().maximize();
	
	driver.get("https://demoapp.skillrary.com/");
	Thread.sleep(3000);
	
	driver.findElement(By.linkText("LOGIN")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.id("email")).sendKeys("Shahnawazm855@gmail.com");
	Thread.sleep(3000);
	
	driver.findElement(By.id("password")).sendKeys("Msnwz1234@");
	Thread.sleep(3000);
	
	driver.findElement(By.id("last")).click();
}
}
