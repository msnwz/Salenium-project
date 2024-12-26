package SaleniumAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class vtigerAssignment {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://www.vtiger.com/");

	Actions action=new Actions(driver);
	WebElement company = driver.findElement(By.partialLinkText("Company"));
	action.moveToElement(company).perform();
	
	WebElement contact = driver.findElement(By.partialLinkText("Contact Us"));
	action.moveToElement(contact).click().perform();
	
	WebElement blrno = driver.findElement(By.xpath("//p[contains(text(),'+91 9243602352')]"));
	System.out.println(blrno.getText());
	
	driver.quit();
}
}
