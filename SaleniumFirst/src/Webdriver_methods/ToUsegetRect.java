package Webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUsegetRect {
public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.instagram.com/");
	Thread.sleep(2000);
	
	Rectangle rect = driver.findElement(By.xpath("//button[@type='submit']")).getRect();
	System.out.println(rect.height);
	System.out.println(rect.width);
	System.out.println(rect.x);
	System.out.println(rect.y);
	driver.quit();
	
}
}
