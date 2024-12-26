package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformDragAndDropAction {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
	
	//switch frame
	WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
	driver.switchTo().frame(iframe);
	
	//find images	
	WebElement img1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
	WebElement img2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
	WebElement img3 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
	WebElement img4 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
	
	//find trash
	WebElement trash = driver.findElement(By.id("trash"));
	
	//find gallery
	WebElement gallery = driver.findElement(By.id("gallery"));
	
	//drag and drop to trash
	Actions action= new Actions(driver);
	action.dragAndDrop(img1, trash).perform();
	Thread.sleep(3000); 
	action.dragAndDrop(img2, trash).perform();
	Thread.sleep(3000);
	//action.dragAndDrop(img3, trash).perform();
	
	//using drag and drop by
	action.dragAndDropBy(img3, 500, 0).perform();
	Thread.sleep(3000);
	action.dragAndDrop(img4, trash).perform();
	Thread.sleep(3000);
	
	//drag from trash to gallery
	action.dragAndDrop(img1, gallery).perform();
	Thread.sleep(3000);
	action.dragAndDrop(img2, gallery).perform();
	Thread.sleep(3000);
	
	//click and hold then move to element and relese
	//action.dragAndDrop(img3, gallery).perform();
	action.clickAndHold(img3).moveToElement(gallery).perform();
	Thread.sleep(3000);
	action.dragAndDrop(img4, gallery).perform();
	
	
	
	
	
	
}
}
