package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class byid {
public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.id("email")).sendKeys("6202548863");
	Thread.sleep(2000);
	
	driver.findElement(By.id("pass")).sendKeys("absdef@123");
	Thread.sleep(2000);
	
	driver.findElement(By.name("login")).click();
	
}
}
