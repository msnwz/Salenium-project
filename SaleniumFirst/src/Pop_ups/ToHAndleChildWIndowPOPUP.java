package Pop_ups;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHAndleChildWIndowPOPUP {
	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.amazon.in/");

		String pwindows = driver.getWindowHandle();

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhone 16");
		driver.findElement(By.id("nav-search-submit-button")).click();

		driver.findElement(By.xpath("//span[text()='Apple iPhone 16 (128 GB) - Pink']")).click();

		Set<String> allwindow = driver.getWindowHandles();
		allwindow.remove(pwindows);
		for (String windowHandle : allwindow) {
			driver.switchTo().window(windowHandle);
		}

		Thread.sleep(5000);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File tSCR = ts.getScreenshotAs(OutputType.FILE);
		File ESHOT = new File("./ErrorShots/iphone16Scrnshot.png");
		org.openqa.selenium.io.FileHandler.copy(tSCR, ESHOT);

		driver.switchTo().window(pwindows);

	}
}
