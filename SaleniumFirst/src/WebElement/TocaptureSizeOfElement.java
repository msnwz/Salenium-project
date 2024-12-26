package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class TocaptureSizeOfElement {
public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.instagram.com/");
	Thread.sleep(2000);
	
	 Dimension sizeofwebelement = driver.findElement(By.xpath("//button[@type='submit']")).getSize();
	 System.out.println(sizeofwebelement);
	 System.out.println(sizeofwebelement.getHeight());
	 System.out.println(sizeofwebelement.getWidth());
	

}
}
