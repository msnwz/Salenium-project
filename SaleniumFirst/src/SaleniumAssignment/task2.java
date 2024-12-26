package SaleniumAssignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class task2 {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://www.youtube.com/");
	
	String weburl = driver.getCurrentUrl();
	System.out.println(weburl);
	
	driver.quit();
}
}
