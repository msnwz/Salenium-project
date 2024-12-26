package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByIndex {
public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.dunzo.com/bangalore");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//p[text()='Search']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@placeholder='Search for item or a store']")).sendKeys("Apple");
	Thread.sleep(2000);
	
	                                                         
	
	
}
}
