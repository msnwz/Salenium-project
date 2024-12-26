package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class TogetScreenShotOfEntirePage {
public static void main(String[] args) throws InterruptedException, IOException {
	
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.flipkart.com/");
	Thread.sleep(3000);
	
	//taking ScreenShot
	TakesScreenshot ts= (TakesScreenshot)driver;//typecasting
	File temp = ts.getScreenshotAs(OutputType.FILE);
	File scr = new File("./ErrorShots/flipkart.png");
	org.openqa.selenium.io.FileHandler.copy(temp, scr);
}
}

