import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class T10 {
    public static void main(String[] args) {
        // Setup the Firefox driver(GeckoDriver)

        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Open the browser
        driver.get("https://www.google.com");
        WebElement Goog = driver.findElement(By.xpath("//textarea[@id=\"APjFqb\"]"));
        Goog.sendKeys("Cheese"+Keys.ENTER);
        // Perform testing and assertions
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result-stats")));
        WebElement sec=driver.findElement(By.xpath("(//div[@id=\"result-stats\"])[1]"));
        System.out.println(sec.getText());

        // Close the browser
        driver.close();
        // Feel free to comment out the line below
        // so it doesn't close too quickly
    }
}

//
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//import java.util.regex.Pattern;
//
//class T10 {
//    public static void main(String[] args) {
//        // Set up Firefox driver
//        WebDriverManager.firefoxdriver().setup();
//        // Create a new instance of the Firefox driver
//        WebDriver driver = new FirefoxDriver();
//        // Create the Wait object
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//        // Open the page
//        driver.get("https://www.google.com");
//        // Print the title of the page
//        System.out.println("Home page title: " + driver.getTitle());
//
//
//        driver.findElement(By.name("q")).sendKeys("cheese"+ Keys.ENTER);
//
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result-stats")));
//        System.out.println(driver.findElement(By.id("result-stats")).getText());
//
//        // Close the browser
//        driver.close();
//    }
//}