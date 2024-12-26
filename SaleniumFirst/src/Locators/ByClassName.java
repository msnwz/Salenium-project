package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByClassName {
public static void main(String[] args) {
	 ChromeDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 
	// driver.get("https://www.instagram.com/");
	 
	 //classname findelelement doesnt work when class name contain alphanumerical value like _aa4b _add6 _ac4d _ap35..
	 //driver.findElement(By.className("_aa4b _add6 _ac4d _ap35")).sendKeys("shahnawazm855@gmail.com");
	 
	 driver.get("https://demowebshop.tricentis.com/");
	 
	 driver.findElement(By.linkText("Log in")).click();
	 
	 //these kind of findelament class name will work because it cotain only one smal  l word...
	 driver.findElement(By.className("email")).sendKeys("shahnawazm855@gmail.com");
}
}
