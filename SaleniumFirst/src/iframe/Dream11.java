package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dream11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.get("https://www.dream11.com/");

//use this for index based
//driver.switchTo().frame(0);

//use this for string based
//driver.switchTo().frame("send-sms-iframe");

//use this for element based
WebElement iframe = driver.findElement(By.xpath("//iframe[@ title='Iframe Example']"));
driver.switchTo().frame(iframe);
driver.findElement(By.id("regEmail")).sendKeys("62025448863");

driver.switchTo().parentFrame();

driver.findElement(By.linkText("About Us")).click();
	}

}
