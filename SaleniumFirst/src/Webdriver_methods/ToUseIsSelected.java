package Webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseIsSelected {
public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
    driver.get("https://demoapp.skillrary.com/");
    Thread.sleep(2000);
    
   WebElement element = driver.findElement(By.xpath("//input[@type='Submit']"));
   System.out.println("before selecting");
   System.out.println(element.isSelected());
   System.out.println("afterselecting");
   element.click();
   System.out.println(element.isSelected());
   driver.quit();
   
}
}
