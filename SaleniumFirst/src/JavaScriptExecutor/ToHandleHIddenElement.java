package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleHIddenElement {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://en-gb.facebook.com/reg/");
	WebElement lgbt = driver.findElement(By.id("custom_gender"));
	
	JavascriptExecutor js= (JavascriptExecutor) driver;
	js.executeScript("arguments[0].value='i identify as a attack helicopter'", lgbt);
}
}
 