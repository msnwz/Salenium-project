package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGEtLocationOfWebElement {
public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.instagram.com/");
	Thread.sleep(2000);
	
   Point locationofwebelement = driver.findElement(By.xpath("//button[@type='submit']")).getLocation();
   System.out.println(locationofwebelement);
   System.out.println(locationofwebelement.getX());
   System.out.println(locationofwebelement.getY());
    
}
}
