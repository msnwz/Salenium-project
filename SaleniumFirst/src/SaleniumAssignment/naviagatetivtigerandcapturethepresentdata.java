package SaleniumAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class naviagatetivtigerandcapturethepresentdata {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demo.vtiger.com/vtigercrm/");
		WebElement capture = driver.findElement(By.id("username"));
		capture.click();
		System.out.println(capture.getAttribute("value"));

		// wrong method
		// JavascriptExecutor js=(JavascriptExecutor) driver;
		// System.out.println(js.executeScript("arguments[0].getText()",capture));

		// wrong method
		// System.out.println(capture.getText());
	}
}
