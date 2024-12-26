package AdvanceSalenium;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ToLearnConfiguratin {

	@BeforeSuite
	public void beforesuite() {
		Reporter.log("before suite got executed", true);
	}
	
	@AfterSuite
	public void aftersuite() {
		Reporter.log("after suite got executed", true);
	}
	
	@BeforeTest
	public void beforetest() {
		Reporter.log("before test got executed", true);
	}
	
	@AfterTest
	public void aftertest() {
		Reporter.log("after test got executed", true);
	}
	
	@BeforeClass
	public void beforeclass() {
		Reporter.log("before class got executed", true);
	}
	
	@AfterClass
	public void Afterclass() {
		Reporter.log("after class got executed", true);
	}
	
	@BeforeMethod
	public void beforemethod() {
		Reporter.log("before method got executed", true);
	}
	
	@AfterMethod
	public void Aftermethod() {
		Reporter.log("After method got executed", true);
	}
	
	@Test
	public void test() {
		Reporter.log("test got executed", true);
	}
}
