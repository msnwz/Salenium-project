package Webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class Getmethod {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.youtube.com/");
	driver.get("https://www.facebook.com/");
}
}
