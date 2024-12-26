package SaleniumAssignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class Captureamzontitleandurl {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	String Gettitle = driver.getTitle();
	System.out.println(Gettitle);
	String geturl = driver.getCurrentUrl();
	System.out.println(geturl);
	
}
}
