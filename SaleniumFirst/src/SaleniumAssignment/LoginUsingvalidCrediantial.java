package SaleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginUsingvalidCrediantial {
public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	
	driver.findElement(By.linkText("Log in")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("Email")).sendKeys("shahnawazm855@gmail.com");
	Thread.sleep(2000);
	
	driver.findElement(By.id("Password")).sendKeys("Lion123@");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	
}
}
