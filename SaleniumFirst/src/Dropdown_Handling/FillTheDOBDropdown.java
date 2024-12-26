package Dropdown_Handling;

import java.time.Duration;
import java.time.Month;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Webdriver_methods.getcurrenturlmethod;

public class FillTheDOBDropdown {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// implicite wait

		driver.get("https://z-upload.facebook.com/reg/");
		driver.manage().window().maximize();

		// create variable to identify dropdown
		WebElement dayD = driver.findElement(By.id("day"));
		WebElement monthD = driver.findElement(By.id("month"));
		WebElement yearD = driver.findElement(By.id("year"));

		// creat a select object to handle dropdown
		Select dayS = new Select(dayD);
		Select monthS = new Select(monthD);
		Select yearS = new Select(yearD);

		// calling each dropdown
		dayS.selectByVisibleText("8");
		monthS.selectByVisibleText("Oct");
		yearS.selectByVisibleText("2003");

		// verifying single select or multiple select
		System.out.println(dayS.isMultiple());
		System.out.println(monthS.isMultiple());
		System.out.println(yearS.isMultiple());

		// to capture all the data in dropdown
		List<WebElement> allmonths = monthS.getOptions();
		for (WebElement month : allmonths) {
			System.out.println(month.getText());

			// veryfying by putting ALL month
			monthS.selectByVisibleText(month.getText());
			Thread.sleep(3000);
		}
		driver.quit();

	}
}
