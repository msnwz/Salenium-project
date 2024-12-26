package BatchExecutionOfbikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class royalenfield {
	@Test(groups = "smoke")
	public void royalenfields() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.royalenfield.com/in/en/home/");
		Reporter.log("reyalenfield got executed", true);
		driver.quit();
	}
}
