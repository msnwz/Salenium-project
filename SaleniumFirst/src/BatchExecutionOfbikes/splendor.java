package BatchExecutionOfbikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class splendor {
	@Test(groups = "smoke")
public void splendors() {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.heromotocorp.com/en-in/motorcycles/practical/splendor-plus.html");
	Reporter.log("splendor got executed", true);
	driver.quit();
}
}
