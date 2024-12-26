package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToReadTHeDataFromexcelFile {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		// step1-create an object of fileinputstream
		FileInputStream fis = new FileInputStream("./Testdata/Book1.xlsx");

		// step 2- create and object of respective file type
		Workbook wb = WorkbookFactory.create(fis);

		// call respective methods
		String URL = wb.getSheet("Sheet1").getRow(0).getCell(0).toString();
		String username = wb.getSheet("Sheet1").getRow(1).getCell(0).toString();
		String password = wb.getSheet("Sheet1").getRow(2).getCell(0).toString();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get(URL);

		driver.findElement(By.id("email")).sendKeys(username);

		driver.findElement(By.id("pass")).sendKeys(password);
	}
}
