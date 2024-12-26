package Webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class tocapturesessionid {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.youtube.com/");
		
		String parentid = driver.getWindowHandle();
		System.out.println(parentid);
		
		
	
}
}
