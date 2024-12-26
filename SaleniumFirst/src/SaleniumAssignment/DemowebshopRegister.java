package SaleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemowebshopRegister {
    public static void main(String[] args) {
        String expectedTitle = "Demo Web Shop";
        String expectedEmail = "shahnawazm855@gmail.com";
        String expectedPassword = "Msnwz855@";
        String firstName = "MD";
        String lastName = "Shahnawaz";

        // Set up WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Navigate to the Demo Web Shop registration page
        driver.get("https://demowebshop.tricentis.com/");
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Web page accessed successfully");
        } else {
            System.out.println("Error accessing the web page");
        }

        // Click the "Register" link
        driver.findElement(By.linkText("Register")).click();
        System.out.println("Register link clicked");

        // Select gender
        driver.findElement(By.id("gender-male")).click();
        System.out.println("Gender selected");

        // Enter first name
        driver.findElement(By.id("FirstName")).sendKeys(firstName);
        System.out.println("First name entered: " + firstName);

        // Enter last name
        driver.findElement(By.id("LastName")).sendKeys(lastName);
        System.out.println("Last name entered: " + lastName);

        // Enter email
        driver.findElement(By.id("Email")).sendKeys(expectedEmail);
        System.out.println("Email entered: " + expectedEmail);

        // Enter password
        driver.findElement(By.id("Password")).sendKeys(expectedPassword);
        System.out.println("Password entered");

        // Confirm password
        driver.findElement(By.id("ConfirmPassword")).sendKeys(expectedPassword);
        System.out.println("Confirm password entered");

        // Click the register button
        driver.findElement(By.name("register-button")).click();
        System.out.println("Register button clicked");

        // Optional: Add verification steps here after registration

        // Quit the browser
        System.out.println("Quitting browser");
        driver.quit();
    }
}
