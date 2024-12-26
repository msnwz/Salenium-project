package SaleniumAssignment;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class task3 {
	
	public static void main(String[] args) throws MalformedURLException {
		
	
ChromeDriver driver = new ChromeDriver();

    driver.manage().window().maximize();
    
    driver.navigate().to(new URL("https://www.olivegarden.com/home"));
 
    Dimension Sizeofthedriver = driver.manage().window().getSize(); //select size of the browser
	System.out.println(Sizeofthedriver);//printsize of the browser
    
	driver.manage().window().setPosition(new Point(300,300));
	
	driver.quit();
}
}