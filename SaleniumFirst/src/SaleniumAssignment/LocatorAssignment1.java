package SaleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorAssignment1 {
public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	
	driver.findElement(By.linkText("Register")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("gender-male")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("FirstName")).sendKeys("Md");
	Thread.sleep(2000);
	
	driver.findElement(By.id("LastName")).sendKeys("Shahnawaz");
	Thread.sleep(2000);
	
	driver.findElement(By.id("Email")).sendKeys("Shahnawazm855@gmail.com");
	Thread.sleep(2000);
	
	driver.findElement(By.id("Password")).sendKeys("Lion123@");
	Thread.sleep(2000);
	
	driver.findElement(By.id("ConfirmPassword")).sendKeys("Lion123@");
	Thread.sleep(2000);
	
	driver.findElement(By.id("register-button")).click();
	Thread.sleep(2000);
}
}
