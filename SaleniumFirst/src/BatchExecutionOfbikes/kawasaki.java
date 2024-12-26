package BatchExecutionOfbikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class kawasaki {
	
	@Test(groups="smoke")
	public void kawasakis() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://kawasaki-india.com/");
		Reporter.log("kawasaki got executed", true);
		driver.quit();
	}
}
