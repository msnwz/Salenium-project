package Webdriver_methods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class toexplorenavigatemethod {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
	
 ChromeDriver driver = new ChromeDriver();
  
 driver.manage().window().maximize();
 
 driver.navigate().to(new URL("https://www.youtube.com/")); 
 //driver.get("https://www.youtube.com/");
 //Thread.sleep(2000);
 
 Navigation nav = driver.navigate();//created a variable for driver.navigate
 nav.back();//via refrence back the web
 Thread.sleep(2000);//stop for 2 sec
 nav.forward();//via ref go forward in web
 Thread.sleep(2000);
 nav.refresh();//via ref refresh the web
 
	}

}

