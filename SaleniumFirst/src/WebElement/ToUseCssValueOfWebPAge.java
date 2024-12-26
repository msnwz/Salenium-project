package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseCssValueOfWebPAge {
public static void main(String[] args) {
	
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.actitime.com/");
	
	WebElement TogetCssvalue = driver.findElement(By.linkText("Try Free"));
	System.out.println(TogetCssvalue.getCssValue("border-radius"));
	System.out.println(TogetCssvalue.getCssValue("font-size"));
	System.out.println(TogetCssvalue.getCssValue("background-color"));
	System.out.println(TogetCssvalue.getCssValue("line-height"));
	driver.quit();
}
}
