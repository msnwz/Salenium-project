package AdvanceSalenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGandTHreadpoolsize {
	@Test(priority = -1,invocationCount = 6,threadPoolSize = 2)
	public void crickbuzz() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/");
		Reporter.log("crickbuss got executed", true);
		driver.quit();
	}

	
	@Test(priority = 3,invocationCount = 3,threadPoolSize = 2)
	public void amazon() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Reporter.log("amazon got executed", true);
		driver.quit();
	}

	@Test(priority = 0,invocationCount= 4,threadPoolSize = 4)
	public void baskinrobbin() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://baskinrobbinsindia.com/");
		Reporter.log("baskin robbin got executed", true);
		driver.quit();
	}
}
