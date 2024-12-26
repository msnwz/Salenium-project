package BatchExecutionOfbikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ducati {
	@Test(groups = "system")
	public void ducatis() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ducati.com/in/en/home");
		Reporter.log("ducati got executed", true);
		driver.quit();
	}
}
