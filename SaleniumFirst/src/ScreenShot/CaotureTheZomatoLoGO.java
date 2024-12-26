package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaotureTheZomatoLoGO {
public static void main(String[] args) throws InterruptedException, IOException {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.zomato.com/");
	Thread.sleep(2000);
	
	File temp = driver.findElement(By.xpath("//img[@role='presentation'and@src=\'https://b.zmtcdn.com/web_assets/8313a97515fcb0447d2d77c276532a511583262271.png\']")).getScreenshotAs(OutputType.FILE); 
	File src = new File("./ErrorShots/zoamtologo.png");
	FileHandler.copy(temp, src);
}
}
