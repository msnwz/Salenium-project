package SaleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class taskusingbyid {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.actitime.com/free-online-trial");
		
		driver.findElement(By.id("FirstName")).sendKeys("md");
		Thread.sleep(2000);
		
		driver.findElement(By.id("LastName")).sendKeys("shahnawaz");
		Thread.sleep(2000);
		
		driver.findElement(By.id("Email")).sendKeys("shahnawazm855@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.id("Company")).sendKeys("qspider");
		Thread.sleep(2000);
	
		
	}
}
