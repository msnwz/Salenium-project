package SaleniumAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.netty.channel.unix.SocketWritableByteChannel;

public class DropDownHandlingWIthoutUsingSelect {
public static void main(String[] args) {
	
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://z-upload.facebook.com/reg/");
	
	driver.findElement(By.id("day")).click();
	driver.findElement(By.xpath("(//option[@value='8'or text()='8'])[1]")).click();
	
	driver.findElement(By.id("month")).click();
	driver.findElement(By.xpath("//option[text()='Oct']")).click();

	driver.findElement(By.id("year")).click();
	driver.findElement(By.xpath("//option[@value='2003'or text()='2003']")).click();
	driver.findElement(By.id("year")).click();  
}
}
