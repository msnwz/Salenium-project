package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToMoveByOffset {
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
	driver.findElement(By.id("password")).sendKeys("123456");
	
    Actions action=new Actions(driver);
    
    action.moveByOffset(1295, 315).clickAndHold().perform();
}
}
