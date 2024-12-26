package SaleniumAssignment;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class task5 {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("https://www.giallozafferano.com/");
	
	Navigation nav = driver.navigate();//created a variable for driver.navigate
	 nav.back();//via refrence back the web
	 nav.forward();//via ref go forward in web
	 nav.refresh();//via ref refresh the web
	 driver.quit();
}
}
