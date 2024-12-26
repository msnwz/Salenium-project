package SaleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosePopupInWoodenStreet {
public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.woodenstreet.com/");
	for(;;) {
		try {
			driver.findElement(By.id("loginclose1")).click();
			break;
		} catch (Exception e) {
			Thread.sleep(3000);
		}
	}
	
	driver.findElement(By.linkText("Sofas")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//p[text()='Feltro Sheesham Wood Sofa Bed With Storage (King Size, Walnut Irish Cream)']")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.id("button-cart-buy-now")).click();
	Thread.sleep(3000);
	System.out.println("sofa added to cart");
	
	
	driver.findElement(By.linkText("Study & Office")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//p[text()='Calisto Engineered Wood Study Table (Exotic Teak Frosty White)']")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.id("button-cart-buy-now")).click();
	Thread.sleep(3000);
	System.out.println("studytable added to cart");
	
	
	driver.findElement(By.linkText("Outdoor")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//h3[text()='Sienna 4 Seater Outdoor Set (Dual Tone)']")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.id("button-cart-buy-now")).click();
	Thread.sleep(3000);
	System.out.println("outdoor table added to cart");
	
	
	driver.findElement(By.id("cart-total")).click();
	Thread.sleep(10000);
	
	driver.quit();
	}
}
