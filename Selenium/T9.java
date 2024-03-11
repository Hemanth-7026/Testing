//Open a new browser to https://v1.training-support.net/selenium/ajax
//Get the title of the page and print it to the console.
//On the page, perform:
//Find and click the "Change content" button on the page.
//Wait for the text to say "HELLO!". Print the message that appears on the page.
//Wait for the text to change to contain "I'm late!". Print the new message on the page.
//Close the browser.

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class T9 {
    public static void main(String[] args) {
        // Setup the driver
        WebDriverManager.firefoxdriver().setup();
        // Driver object reference
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Open the browser
        driver.get("https://v1.training-support.net/selenium/ajax");

        // Find the button and click it
        driver.findElement(By.cssSelector("button.violet")).click();
        // Wait for the new elements to appear
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h1")));
        // Find and print the new text
        String text = driver.findElement(By.tagName("h1")).getText();
        System.out.println(text);

        WebElement delayedText = driver.findElement(By.tagName("h3"));
        System.out.println(delayedText.getText());
        // Wait for the delayed text and print it
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.tagName("h3"), "I'm late!"));
        String lateText = driver.findElement(By.tagName("h3")).getText();
        System.out.println(lateText);

        // Close the browser
        driver.quit();
    }
}












//-------------------------------------------------------------------------------
//
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//import java.util.regex.Pattern;
//
//class T9 {
//    public static void main(String[] args) {
//        // Set up Firefox driver
//        WebDriverManager.firefoxdriver().setup();
//        // Create a new instance of the Firefox driver
//        WebDriver driver = new FirefoxDriver();
//        // Create the Wait object
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//        // Open the page
//        driver.get("https://v1.training-support.net/selenium/ajax");
//        // Print the title of the page
//        System.out.println("Home page title: " + driver.getTitle());
//        //Clicking the change content button
//        WebElement changecontent = driver.findElement(By.xpath("//button[text()='Change Content']"));
//        changecontent.click();
//        //Waiting and checking for Hello!
//        wait.until(ExpectedConditions.textMatches(By.xpath("//div[@id='ajax-content']/h1"), Pattern.compile("HELLO!")));
//        System.out.println(driver.findElement(By.xpath("//div[@id='ajax-content']/h1")).getText());
//        //Waiting and checking for I'm Late
//        wait.until(ExpectedConditions.textMatches(By.xpath("//div[@id='ajax-content']/h3"), Pattern.compile("I'm late!")));
//        System.out.println(driver.findElement(By.xpath("//div[@id='ajax-content']/h3")).getText());
//
//
//        // Close the browser
//        driver.close();
//    }
//}

