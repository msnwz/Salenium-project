package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class byname {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		driver.findElement(By.name("username")).sendKeys("6202548863");
		Thread.sleep(2000);
		
		driver.findElement(By.name("password")).sendKeys("absdef@123");
		Thread.sleep(2000);
		
	}
}
