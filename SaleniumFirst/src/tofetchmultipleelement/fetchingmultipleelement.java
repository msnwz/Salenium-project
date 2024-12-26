package tofetchmultipleelement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fetchingmultipleelement {
public static void main(String[] args) {
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
	 driver.get("https://www.woodenstreet.com/");
	 driver.findElement(By.id("loginclose1")).click();
	 
	 
	 List<WebElement> multipleelement = driver.findElements(By.xpath("//ul[@class='container flex']/li"));
	 
	 for(WebElement elements:multipleelement) {
		 System.out.println(elements.getText());
	 }
	 
	 driver.quit();
}
}
