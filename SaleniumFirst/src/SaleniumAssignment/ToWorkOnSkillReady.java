package SaleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkOnSkillReady {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver(); //to perform cross browser testing
	driver.manage().window().maximize();
	
	driver.get("https://demoapp.skillrary.com/");
	Thread.sleep(3000);
	
	driver.findElement(By.linkText("LOGIN")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.id("registerClick")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Md");
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Shahnawaz");
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("mdaShahnawazm855@gmail.com");
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("(//input[@name='password'and @class=\"form-control controlForm\" and @placeholder='Password' and @type='password'] )[2]")).sendKeys("Msnwz1234@");
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@type='password'and@name='repassword']")).sendKeys("Msnwz1234@");
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@value='Register']")).click();
	Thread.sleep(3000);
	
	String text = driver.findElement(By.xpath("//h2[text()='Thank you for Registering.']")).getText();
	System.out.println(text);
	
	
	
	
	
	
}
}
