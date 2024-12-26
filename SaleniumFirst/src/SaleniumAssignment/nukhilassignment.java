package SaleniumAssignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nukhilassignment {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://arxiv.org/search/?searchtype=author&query=Zhang%2C+Z&abstracts=show&size=200&order=-announced_date_first");

        // Find all PDF links using XPath
        List<WebElement> pdfLinks = driver.findElements(By.xpath("//a[contains(@href, 'pdf')]"));

        // Loop through each link and download the PDF
        for (WebElement link : pdfLinks) {
            link.click();
            // Adjust the sleep time based on your network speed
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.navigate().back();
            // Give the browser time to go back to the results page
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Close the browser
        driver.quit();
    }
}
