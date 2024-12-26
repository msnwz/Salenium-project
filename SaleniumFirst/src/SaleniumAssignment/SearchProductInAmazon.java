package SaleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchProductInAmazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();

driver.get("https://www.amazon.in/");
Thread.sleep(2000);

driver.findElement(By.xpath("//input[@aria-label='Search Amazon.in']")).sendKeys("laptops");

driver.findElement(By.xpath("//input[@value='Go']")).click();
}

}
