package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebshopExcelData {
    public static void main(String[] args) throws EncryptedDocumentException, IOException {
        // Step 1: Create an object of FileInputStream
        FileInputStream fis = new FileInputStream("./Testdata/demowebshop.xlsx");

        // Step 2: Create an object of the respective file type
        Workbook wb = WorkbookFactory.create(fis);

        // Call respective methods
        String url = wb.getSheet("Sheet1").getRow(0).getCell(0).toString();
        String firstname = wb.getSheet("Sheet1").getRow(1).getCell(0).toString();
        String lastname = wb.getSheet("Sheet1").getRow(2).getCell(0).toString();
        String email = wb.getSheet("Sheet1").getRow(3).getCell(0).toString();
        String password = wb.getSheet("Sheet1").getRow(4).getCell(0).toString();

        // Set up WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  

        // Navigate to the demo web shop registration page
        driver.get(url);

        // Click the "Register" link
        WebElement register = driver.findElement(By.linkText("Register"));
        register.click();

        // Choose gender (male)
        WebElement gender = driver.findElement(By.id("gender-male"));
        gender.click();

        // Enter first name
        WebElement firstNameField = driver.findElement(By.id("FirstName"));
        firstNameField.clear();
        firstNameField.sendKeys(firstname);
        String firstnamevalidation = firstNameField.getAttribute("value");
        if (firstnamevalidation.equals(firstname)) {
            System.out.println("First name validated");
        } else {
            System.out.println("Error in validating first name");
        }

        // Enter last name
        WebElement lastNameField = driver.findElement(By.id("LastName"));
        lastNameField.clear();
        lastNameField.sendKeys(lastname);
        String lastnamevalidation = lastNameField.getAttribute("value");
        if (lastnamevalidation.equals(lastname)) {
            System.out.println("Last name validated");
        } else {
            System.out.println("Error in validating last name");
        }

        // Enter email
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.clear();
        emailField.sendKeys(email);
        String emailvalidation = emailField.getAttribute("value");
        if (emailvalidation.equals(email)) {
            System.out.println("Email validated");
        } else {
            System.out.println("Error in validating email");
        }

        // Enter password
        WebElement passwordField = driver.findElement(By.id("Password"));
        passwordField.clear();
        passwordField.sendKeys(password);
        String passwordvalidation = passwordField.getAttribute("value");
        if (passwordvalidation.equals(password)) {
            System.out.println("Password validated");
        } else {
            System.out.println("Error in validating password");
        }

        // Confirm password
        WebElement confirmPasswordField = driver.findElement(By.id("ConfirmPassword"));
        confirmPasswordField.clear();
        confirmPasswordField.sendKeys(password);
        String confirmPasswordvalidation = confirmPasswordField.getAttribute("value");
        if (confirmPasswordvalidation.equals(password)) {
            System.out.println("Confirm password validated");
        } else {
            System.out.println("Error in validating confirm password");
        }

        // Quit the browser
        System.out.println("Registration completed successfully!");
        driver.quit();
    }
}
