package Webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tousedisplayedandenablewebmethod {
public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.instagram.com/");
	Thread.sleep(2000);
	
	WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
	System.out.println("without data");
	System.out.println(loginbutton.isDisplayed());
	System.out.println(loginbutton.isEnabled());
	System.out.println("passing the data");
	driver.findElement(By.name("username")).sendKeys("Shahnawazm855");
	driver.findElement(By.name("password")).sendKeys("Msnwz8552");
	System.out.println(loginbutton.isDisplayed());
	System.out.println(loginbutton.isEnabled());
	driver.quit();
}
}
