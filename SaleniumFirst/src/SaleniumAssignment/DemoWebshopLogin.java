package SaleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoWebshopLogin {
    public static void main(String[] args) {
        String expectedTitle = "Demo Web Shop";
        String expectedEmail = "Shahnawazm855@gmail.com";
        String expectedPassword = "Msnwz855@";

        // Set up WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Navigate to the Demo Web Shop login page
        driver.get("https://demowebshop.tricentis.com/");
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Web page accessed successfully");
        } else {
            System.out.println("Error accessing the web page");
        }

        // Click the "Log in" link
        driver.findElement(By.linkText("Log in")).click();

        // Enter email
        WebElement email = driver.findElement(By.id("Email"));
        email.clear();
        email.sendKeys("Shahnawazm855@gmail.com");
        String emailField = email.getAttribute("value");

        if (emailField.equals(expectedEmail)) {
            System.out.println("Email text field verified");
        } else {
            System.out.println("Error in email text field");
        }

        // Enter password
        WebElement password = driver.findElement(By.id("Password"));
        password.clear();
        password.sendKeys("Msnwz855@");
        String passwordField = password.getAttribute("value");

        if (passwordField.equals(expectedPassword)) {       
            System.out.println("Password text field verified");
        } else {
            System.out.println("Error in password text field");
        }

        // Click the login button
        driver.findElement(By.cssSelector("input[type='submit'][value='Log in']")).click();
        System.out.println("Login button clicked");

        // Quit the browser
        System.out.println("Quitting browser");
        driver.quit();
    }
}
