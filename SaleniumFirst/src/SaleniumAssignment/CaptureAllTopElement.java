package SaleniumAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureAllTopElement {
public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.myntra.com/");
	Thread.sleep(2000);
	
	List<WebElement> list = driver.findElements(By.xpath("//div[@class='desktop-navLinks']/div"));
	for(WebElement ele:list) {
		System.out.println(ele.getText());
	
	}
	driver.quit();
}
}
