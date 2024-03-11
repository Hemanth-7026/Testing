import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class T11 {
    public static void main(String[] args) {
        // Setup the Firefox driver(GeckoDriver)

        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Open the browser
        driver.get("https://www.amazon.in/");
        WebElement Goog = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
        Goog.sendKeys("iphone 15"+Keys.ENTER);
        // Perform testing and assertions
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")));
        WebElement Name = driver.findElement(By.xpath("(//span[contains(@Class,'a-size-medium a-color-base a-text-normal')])[3]"));
        System.out.println(Name.getText());
        WebElement Price = driver.findElement(By.xpath("(//span[@class=\"a-price-whole\"])[3]"));
        System.out.println(Price.getText());



        // Close the browser
        driver.close();
        // Feel free to comment out the line below
        // so it doesn't close too quickly
    }
}