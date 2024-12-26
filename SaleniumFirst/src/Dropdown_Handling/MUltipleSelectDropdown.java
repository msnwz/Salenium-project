package Dropdown_Handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v114.page.model.FontFamilies;
import org.openqa.selenium.support.ui.Select;

public class MUltipleSelectDropdown {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://demoapp.skillrary.com/");
	driver.manage().window().maximize();
	
	//identify listbox\
	WebElement listS = driver.findElement(By.id("cars"));
	
	//to handle listbox
	Select multiselect = new Select(listS);
	System.out.println(multiselect.isMultiple());
	
	//calling
	multiselect.selectByIndex(0);
	multiselect.selectByVisibleText("INR 100 - INR 199 ( 16 )");
	Thread.sleep(2000);
	
	//deselect all
	//multiselect.deselectAll();
	multiselect.deselectByIndex(0);
	multiselect.deselectByVisibleText("INR 100 - INR 199 ( 16 )");
}
}
