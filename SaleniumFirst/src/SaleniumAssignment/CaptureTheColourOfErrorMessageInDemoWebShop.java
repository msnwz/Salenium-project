package SaleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureTheColourOfErrorMessageInDemoWebShop {
public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	
	driver.findElement(By.linkText("Log in")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	Thread.sleep(2000);
	
	WebElement capturethecolour = driver.findElement(By.xpath("//li[text()='No customer account found']"));
	System.out.println(capturethecolour.getCssValue("color"));
	
	driver.quit();
}
}
