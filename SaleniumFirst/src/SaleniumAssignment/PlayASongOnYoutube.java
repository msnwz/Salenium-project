package SaleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlayASongOnYoutube {
public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.youtube.com/");
	Thread.sleep(2000);
	
	driver.findElement(By.name("search_query")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.name("search_query")).sendKeys("yuhi chala chal rahi");
	Thread.sleep(2000);
	
	driver.findElement(By.id("search-icon-legacy")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("video-title")).click();
}
}
