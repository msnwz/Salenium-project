package Pop_ups;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TOHAndleCalenderPOPUP {
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5  ));
	
	driver.get("https://www.makemytrip.com/");
	
	driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
	
	driver.findElement(By.xpath("//span[@class='shortYear']")).click();
	
	
	for(;;) {
	try {
		driver.findElement(By.xpath("//div[text()='March 2025']/../..//p[text()='25']")).click();
		break;
	}
	catch (Exception e) {
		driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
	}
}
}
}

