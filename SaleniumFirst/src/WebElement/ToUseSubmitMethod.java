package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseSubmitMethod {
public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.instagram.com/");
	Thread.sleep(2000);
	
	driver.findElement(By.name("username")).sendKeys("shahnawazm855");
	Thread.sleep(2000);
	
	driver.findElement(By.name("password")).sendKeys("Msnwz855@");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[@type='submit']")).submit();
	//driver.quit();
}
}
