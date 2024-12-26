package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TogetTagName {
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.actitime.com/");
		
		String tagname = driver.findElement(By.linkText("Try Free")).getTagName();
		System.out.println(tagname);
}
}