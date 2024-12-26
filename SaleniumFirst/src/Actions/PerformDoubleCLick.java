package Actions;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformDoubleCLick {
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://demoapp.skillrary.com/product.php?product=selenium");
	
	WebElement clickbutton = driver.findElement(By.id("add"));
	
	Actions action=new Actions(driver);
	action.doubleClick(clickbutton).perform();
}
}
