package BatchExecutionOfbikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class bmv {
	@Test(groups = "functional")
	public void bmws() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.in.gov/bmv/");
		Reporter.log("bmw got executed", true);
		driver.quit();
	}
}
