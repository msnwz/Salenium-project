package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathBySurrounding {
public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.shoppersstack.com/");
	Thread.sleep(20000);
	
	driver.findElement(By.xpath("//span[text()='JOMPERS']/../..//button[@id='addToCart']")).click();
	Thread.sleep(20000);
	
	
}
}
