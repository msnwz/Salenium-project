package Pop_ups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TohandleConfirmationpopup {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://licindia.in/");
	
	driver.findElement(By.partialLinkText("Login")).click();
	
	Alert confirmpopup = driver.switchTo().alert();
	System.out.println(confirmpopup.getText());
	confirmpopup.dismiss();

	
	driver.findElement(By.partialLinkText("Login")).click();
	confirmpopup.accept();   
	
	
	
}
}
