package tofetchmultipleelement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplelementatdemowebshop {
public static void main(String[] args) {
	
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.get("https://demowebshop.tricentis.com/");
		 
		List<WebElement> allbarelement = driver.findElements(By.xpath("//ul[@class='top-menu']/li"));
		
		for(WebElement ele:allbarelement) {
		System.out.println(ele.getText());
		}
		driver.quit();
}
}
