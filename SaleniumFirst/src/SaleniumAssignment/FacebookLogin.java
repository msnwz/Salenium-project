package SaleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FacebookLogin {
    public static void main(String[] args) {
        String expectedApp = "Log in to Facebook";
        String expectedUsername = "6202548863";
        String expectedPassword = "asdfqwer1234";

        // Set up WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Navigate to the Facebook login page
        driver.get("https://www.facebook.com/login/");
        String actualApp = driver.getTitle();
        

        if (actualApp.equals(expectedApp)) {
            System.out.println("Server access successful");
        } else {
            System.out.println("There was an error accessing the server");
        }

        // Enter username
        WebElement actualUsername = driver.findElement(By.id("email"));
        actualUsername.clear();
        actualUsername.sendKeys("6202548863");
        String actualUsernames = actualUsername.getAttribute("value");

        if (actualUsernames.equals(expectedUsername)) {
            System.out.println("Username validated");
        } else {
            System.out.println("Invalid username");
        }

        // Enter password
        WebElement actualPassword = driver.findElement(By.id("pass"));
        actualPassword.clear();
        actualPassword.sendKeys("asdfqwer1234");
        String actualPasswords = actualPassword.getAttribute("value");

        if (actualPasswords.equals(expectedPassword)) {
            System.out.println("Password validated successfully");
        } else {
            System.out.println("Error in validating password");
        }

        // Click the login button
        WebElement loginButton = driver.findElement(By.name("login"));
        loginButton.click();
        System.out.println("Login button validation successful");

        // Quit the browser
        System.out.println("quitting browser");
        driver.quit();
    }
}
