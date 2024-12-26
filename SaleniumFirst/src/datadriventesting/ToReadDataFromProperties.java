package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToReadDataFromProperties {
public static void main(String[] args) throws IOException {
	
	//step1-create an object of fileinputstream
	FileInputStream fis=new FileInputStream("./Testdata/Testdata.properties");
	
	//step 2- create and object of respective file type
	Properties ps= new Properties();
	
	//call respective methods
	ps.load(fis);
	String url = ps.getProperty("url");
	String username = ps.getProperty("username");
	String password = ps.getProperty("password");
	
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get(url);
	
	driver.findElement(By.id("email")).sendKeys(username);
	
	driver.findElement(By.id("pass")).sendKeys(password);
	

	
}
}
