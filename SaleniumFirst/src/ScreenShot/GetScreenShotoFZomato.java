package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class GetScreenShotoFZomato {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.zomato.com/");
		Thread.sleep(3000);

		TakesScreenshot scrn = (TakesScreenshot) driver;
		File tempsc = scrn.getScreenshotAs(OutputType.FILE);
		File mainsrc = new File("./ErrorShots/zomato.png");
		FileHandler.copy(tempsc, mainsrc);
	}
}
