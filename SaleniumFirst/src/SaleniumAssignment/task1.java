package SaleniumAssignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class task1 {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://polarbear.co.in/");
	
	String Titleofwebpage2 = driver.getTitle();
	System.out.println(Titleofwebpage2);
	
	driver.quit();
	
}
}
