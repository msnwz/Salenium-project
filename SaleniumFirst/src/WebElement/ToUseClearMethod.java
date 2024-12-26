package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseClearMethod {
public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demo.vtiger.com/vtigercrm/");
	Thread.sleep(2000);
	
	WebElement username = driver.findElement(By.name("username"));
	username.clear();
	username.sendKeys("snwz");
	Thread.sleep(2000);
	
	WebElement password = driver.findElement(By.name("password"));
	password.clear();
	password.sendKeys("1234");
	
}
}
