
package EscrowstackPrivateLimitedProject;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AddProductInAmazom {

	@Test
	public void amazon() throws IOException {

		// Read properties from file
		//FileInputStream fis = new FileInputStream("./Testdata/amazondata.properties");

		// step 2- create and object of respective file type
		//Properties ps = new Properties();

		// call respective methods
		//ps.load(fis);
		//String url = ps.getProperty("url");

		// Set up WebDriver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Navigate to the demo web shop registration page
		driver.get("https://www.amazon.in/");

		// search the product in search bar
		WebElement searchtextfield = driver.findElement(By.id("twotabsearchtextbox"));
		searchtextfield.clear();
		searchtextfield.sendKeys("Wrist Watches");
		{

			// click on search
			WebElement searchbutton = driver.findElement(By.id("nav-search-submit-button"));
			searchbutton.click();

			// filtering
			WebElement filterbutton1 = driver
					.findElement(By.xpath("//span[text()='Leather']/../../..//i[@class='a-icon a-icon-checkbox']"));
			filterbutton1.click();

			WebElement filterbutton2 = driver
					.findElement(By.xpath("//span[text()='Fastrack']/../../..//i[@class='a-icon a-icon-checkbox']"));
			filterbutton2.click();

			// using javascriptexecutor to scroll down
			JavascriptExecutor js = (JavascriptExecutor) driver;
			for (;;) {
				try {
					WebElement nextpage = driver.findElement(By.linkText("2"));
					nextpage.click();
					break;
				} catch (Exception e) {
					js.executeScript("window.scrollBy(0,200)");
				}
			}

			// selecting watch
			WebElement FastrackWatch = driver.findElement(By.xpath(
					"//span[text()='Mens Stunners Quartz Analog Blue Dial Leather Strap Watch for Guys-NR3290SL01']"));
			FastrackWatch.click();
		}
		
		// changing tab
		Set<String> allwindowids = driver.getWindowHandles();
		String parentwindowsid = driver.getWindowHandle();
		allwindowids.remove(parentwindowsid);
		for (String id : allwindowids) {
			driver.switchTo().window(id);

		}
		//click on add to cart
		WebElement addtocartbutton = driver.findElement(By.id("add-to-cart-button"));
		addtocartbutton.click();
		
		//skipping the extras
		WebElement skipbutton = driver.findElement(By.xpath("//input[@type='submit'and@aria-labelledby='attachSiNoCoverage-announce']"));
		skipbutton.click();

	}

}