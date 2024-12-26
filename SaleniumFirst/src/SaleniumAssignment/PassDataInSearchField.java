package SaleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PassDataInSearchField {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.myntra.com/");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("samsung");
}
}
