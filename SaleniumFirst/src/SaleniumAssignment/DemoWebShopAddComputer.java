package SaleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoWebShopAddComputer {
    public static void main(String[] args) {
        // Set up the WebDriver
        WebDriver driver = new ChromeDriver();
        System.out.println("Blank web browser launched");
        
        // Maximize the browser window
        driver.manage().window().maximize();
        System.out.println("Browser maximized");
        
        // Set implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        // Step 1: Open the Demo Web Shop home page
        driver.get("https://demowebshop.tricentis.com/");
        System.out.println("Home page opened");

        // Step 2: Navigate to the Computers section
        driver.findElement(By.partialLinkText("Computers")).click();
        System.out.println("Navigated to Computers section");

        // Step 3: Click on the Desktops category
        driver.findElement(By.xpath("//img[@alt='Picture for category Desktops']")).click();
        System.out.println("Clicked on Desktops category");

        // Step 4: Add a specific computer to the cart
        driver.findElement(By.xpath("//img[@alt='Picture of Build your own computer']/../../..//input[@value='Add to cart']")).click();
        System.out.println("Clicked 'Add to cart' for 'Build your own computer'");

        // Step 5: Navigate to the shopping cart
        WebElement shoppingCartButton = driver.findElement(By.xpath("//span[text()='Shopping cart']"));
        shoppingCartButton.click();
        System.out.println("Navigated to the shopping cart");

        // Optional: Wait for the cart to load
        // Thread.sleep(2000); // Uncomment if needed

        // Step 6: Quit the browser
        driver.quit();
        System.out.println("Browser closed");
    }
}
