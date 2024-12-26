package Webdriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class toManagetheerbbrowsser {
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver(); // opens empty browser
		
		driver.get("https://www.youtube.com/");// open website
		String Titleofwebpage = driver.getTitle();//select title of website
		System.out.println(Titleofwebpage);//print title
		
		
		Dimension Sizeofthedriver = driver.manage().window().getSize(); //select size of the browser
		System.out.println(Sizeofthedriver);//printsize of the browser
	
		//driver.manage().window().maximize();  //it will maximize the browser
		
	  // driver.manage().window().setSize(new Dimension(800,400)); //manually add the size of the browser
	   
	  /* Dimension Sizeofthedriver1 = driver.manage().window().getSize();
		System.out.println(Sizeofthedriver1);*/
		
		Point p = new Point(200,200); //1 way to set position
		driver.manage().window().setPosition(p);
		
		driver.manage().window().setPosition(new Point(300,300));// 2nd way to set positon

		 Point pos = driver.manage().window().getPosition();//it will show position
			System.out.println(pos);//it will print the browser
	

	}
}
