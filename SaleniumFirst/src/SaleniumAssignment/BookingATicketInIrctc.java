package SaleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookingATicketInIrctc {
public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.irctc.co.in/nget/train-search");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@role='searchbox'][1]")).sendKeys("bangalore");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//li[contains(@role,'option')][2]")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.className("")).click();
	
	driver.quit();
	}
}
