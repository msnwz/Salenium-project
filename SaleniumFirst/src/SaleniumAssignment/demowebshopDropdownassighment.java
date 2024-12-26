package SaleniumAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demowebshopDropdownassighment {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://demowebshop.tricentis.com/");
	
	driver.findElement(By.partialLinkText("Books")).click();
	
	WebElement listbook = driver.findElement(By.id("products-orderby"));
	Select lists=new Select(listbook);
	
	lists.selectByVisibleText("Price: High to Low"); 
}
}
