package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class takeTheSCrnShotOFanElement {
public static void main(String[] args) throws IOException, InterruptedException {

	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.udemy.com/");
	Thread.sleep(2000);
	
	
	
	File temp = driver.findElement(By.xpath("//img[@alt='Udemy']")).getScreenshotAs(OutputType.FILE);
	File src = new File("./ErrorShots/udemi.jpeg");
	org.openqa.selenium.io.FileHandler.copy(temp, src);
	
}
}
