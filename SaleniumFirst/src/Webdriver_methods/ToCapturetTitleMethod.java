package Webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCapturetTitleMethod {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver(); // opens empty browser
		
		driver.get("https://www.youtube.com/");// open website
		String Titleofwebpage = driver.getTitle();//select title of website
		System.out.println(Titleofwebpage);//print title
		
		
		driver.get("https://www.facebook.com/");
		String Titleofwebpage2 = driver.getTitle();
		System.out.println(Titleofwebpage2);
		
	}
	}


