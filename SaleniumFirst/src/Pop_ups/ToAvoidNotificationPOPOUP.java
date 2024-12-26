package Pop_ups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToAvoidNotificationPOPOUP {
public static void main(String[] args) {
	
	//change browser setting
	ChromeOptions setting=new ChromeOptions();
	setting.addArguments("--disable-notifications");
	
	WebDriver driver=new ChromeDriver(setting);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://www.yatra.com/");
}
}
