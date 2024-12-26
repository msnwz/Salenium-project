package SaleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoWebshopAddBooks {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        System.out.println("Blank web browser got launched");
        driver.manage().window().maximize();
        System.out.println("Browser got maximized");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        // Step 2: Open the Demo Web Shop home page
        driver.get("https://demowebshop.tricentis.com/");
        System.out.println("Home page got opened");

        // Step 3: Navigate to the Books section
        WebElement booksButton = driver.findElement(By.partialLinkText("Books"));
        booksButton.click();
        System.out.println("Book section got opened");

        // Step 4: Click on a specific book
        WebElement book = driver.findElement(By.linkText("Computing and Internet"));
        book.click();
        System.out.println("Clicked on the book");

        // Step 5: Add the book to the cart
        WebElement addToCartButton = driver.findElement(By.id("add-to-cart-button-13"));
        addToCartButton.click();
        System.out.println("Book got added to the cart");

        // Step 6: Navigate to the shopping cart
        WebElement shoppingCartButton = driver.findElement(By.xpath("//span[text()='Shopping cart']"));
        shoppingCartButton.click();
        System.out.println("Navigated to the shopping cart");

        // Optional: Wait for the cart to load
        Thread.sleep(2000);

        // Step 7: Verify the book in the shopping cart
        WebElement bookInShoppingCart = driver.findElement(By.linkText("Computing and Internet"));
        String cartBook = bookInShoppingCart.getText();

        if (cartBook.equals("Computing and Internet")) {
            System.out.println("Correct book added to the cart: " + cartBook);
        } else {
            System.out.println("Incorrect item in the cart");
        }

        // Step 8: Quit the browser
        driver.quit();
        System.out.println("Browser got closed");
    }
}
