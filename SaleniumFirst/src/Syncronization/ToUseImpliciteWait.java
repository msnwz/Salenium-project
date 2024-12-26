package Syncronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseImpliciteWait {
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.instagram.com/");
	driver.manage().window().maximize();
	//implicite wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.name("username")).sendKeys("msnwz");  
}
}
