package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkONDisableElement {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://www.oracle.com/in/java/technologies/downloads/");
	
	driver.findElement(By.linkText("jdk-8u421-linux-aarch64.rpm")).click();
	
	//disable element
	WebElement disableelement = driver.findElement(By.linkText("Download jdk-8u421-linux-aarch64.rpm"));
	
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].click()", disableelement);
}
}