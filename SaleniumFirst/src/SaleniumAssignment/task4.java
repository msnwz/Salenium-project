package SaleniumAssignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class task4 {
	
	public static void main(String[] args) {
		
	
		ChromeDriver driver = new ChromeDriver();
		
	    driver.manage().window().maximize();
		
		driver.get("https://www.barbequenation.com/");
		
		String parentid = driver.getWindowHandle();
		System.out.println(parentid);
		
		String weburl = driver.getCurrentUrl(); //  this will select web url
		System.out.println(weburl); // print url

		Dimension Sizeofthedriver = driver.manage().window().getSize(); //select size of the browser
		System.out.println(Sizeofthedriver);//printsize of the browser
		
		driver.manage().window().setSize(new Dimension(500,500));
			
			driver.quit();

  
	}
}
