package WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TocapturemultipleElementAtaTime {
public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.woodenstreet.com/");
	
	for(;;) {
		try {
			driver.findElement(By.id("loginclose1")).click();
			break;
		} catch (Exception e) {
			Thread.sleep(3000);
		}
	}
	
	List<WebElement> multiElement = driver.findElements(By.xpath("//ul[@class='container flex']/li"));
	for(WebElement ele:multiElement) {
	
	System.out.println(ele.getText());
	driver.quit();
}
}
}
