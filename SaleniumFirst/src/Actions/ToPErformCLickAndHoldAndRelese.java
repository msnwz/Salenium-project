package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPErformCLickAndHoldAndRelese {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");

		driver.findElement(By.id("password")).sendKeys("password1234");

		WebElement hold = driver.findElement(By.xpath("//div[@class='showPassword shownhide']"));

		Actions action = new Actions(driver);
		action.clickAndHold(hold).perform();
		Thread.sleep(3000);
		action.release(hold).perform();
	}
}
