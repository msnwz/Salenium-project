package SaleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CHeckfbLogoIsDisplayed {
public static void main(String[] args) throws InterruptedException {
	  ChromeDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.facebook.com/");
	  Thread.sleep(2000);
	  
	  boolean show = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
	 
	 if(show==true) {
		 System.out.println("logo is displayed");
	 }else {
		 System.out.println("logo is not showing");
	 }
	 driver.quit();
}
}
