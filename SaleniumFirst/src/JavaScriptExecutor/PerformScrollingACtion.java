package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PerformScrollingACtion {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

		driver.get("https://www.google.co.in/");

		driver.findElement(By.id("APjFqb")).sendKeys("Bikes", Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='Images']")).click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		for (;;) {
			try {
				driver.findElement(By.xpath("//div[text()='Top Sports Bikes Under Rs 2 Lakh to Buy ...']   ")).click();
				break;
			} catch (Exception e) {
				js.executeScript("window.scrollBy(0,200)");
			}
		}
	}
}
