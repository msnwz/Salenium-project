package SaleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class amazonassignment {
    public static void main(String[] args) {
        // Set up WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Go to Amazon India
        driver.get("https://www.amazon.in");

        // Search for "Wrist Watches"
        WebElement search_bar = driver.findElement(By.id("twotabsearchtextbox"));
        search_bar.sendKeys("Wrist Watches");
        search_bar.submit();

        // Wait for search results to load
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.s-main-slot")));

        // Filter by "Leather" under Watch Band Material
        WebElement leather_filter = driver.findElement(By.xpath("//span[text()='Leather']"));
        leather_filter.click();

        // Wait for filter results to load
        try {
            Thread.sleep(3000);  // Adjust if necessary
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Select "Fastrack" as the watch brand
        WebElement fastrack_filter = driver.findElement(By.xpath("//span[text()='Fastrack']"));
        fastrack_filter.click();

        // Wait for filter results to load
        try {
            Thread.sleep(3000);  // Adjust if necessary
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Navigate to the 2nd page of the search results
        WebElement next_page = driver.findElement(By.xpath("//a[contains(@aria-label, 'Go to page 2')]"));
        next_page.click();

        // Wait for the 2nd page to load
        try {
            Thread.sleep(3000);  // Adjust if necessary
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Add the 1st product in the 1st row to the cart
        WebElement first_product = driver.findElement(By.xpath("(//div[@data-component-type='s-search-result'])[1]//h2/a"));
        first_product.click();

        // Wait for the product page to load
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("add-to-cart-button")));
        WebElement add_to_cart_button = driver.findElement(By.id("add-to-cart-button"));
        add_to_cart_button.click();

        // Close the browser
        driver.quit();
    }
}
