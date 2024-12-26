package Webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class getcurrenturlmethod {
public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver(); // opens empty browser
		
		driver.get("https://www.youtube.com/");// open website
		String Titleofwebpage = driver.getTitle();//select title of website
		System.out.println(Titleofwebpage);//print title
		
		String weburl = driver.getCurrentUrl(); //  this will select web url
		System.out.println(weburl); // print url
}
}
