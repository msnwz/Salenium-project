package DemoWebShopAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Toaddabook extends BaseClass {
	@Test
	public void tobook() throws InterruptedException {
		
		String expecteddata = "Books";
		 String booksButton = driver.findElement(By.partialLinkText("Books")).getText();
		//if (booksButton.equals(expecteddata)) {
		//	Reporter.log("Book section got opened", true);
		//}else {
		//Reporter.log("Book section failed tom   opened", true);
		//}
		 
		 // instead of if else in selenium we use assert to validate the data
		 Assert.assertEquals(booksButton, expecteddata);
		 Reporter.log("Book section got opened", true);
		 

	}
}
