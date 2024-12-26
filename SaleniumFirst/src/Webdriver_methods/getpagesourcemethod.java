package Webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class getpagesourcemethod {
	public static void main(String[] args) {
	
	
ChromeDriver driver=new ChromeDriver();

driver.manage().window().maximize();

//driver.navigate().to(new URL("https://www.youtube.com/")); //
driver.get("https://www.youtube.com/");
String sourcecode = driver.getPageSource();
System.out.println(sourcecode);

}
}