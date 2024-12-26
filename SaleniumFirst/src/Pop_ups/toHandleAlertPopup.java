package Pop_ups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class toHandleAlertPopup {
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://netbanking.hdfcbank.com/netbanking/");
	
	//switch to frame
	
	driver.switchTo().frame("login_page");
	driver.findElement(By.linkText("CONTINUE")).click();
	
	Alert alertpopup = driver.switchTo().alert();
	
	System.out.println(alertpopup.getText());
	alertpopup.accept();//clicking on ok
	
	driver.findElement(By.linkText("CONTINUE")).click();
	alertpopup.dismiss();//clicking on ok
	//for alert popup we can accept or dismiss both    will click ok
	
	
	}
}
