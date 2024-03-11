//Activity 19
//Alerts #1
//Using Selenium:
//
//Open a new browser to https://v1.training-support.net/selenium/javascript-alerts
//Get the title of the page and print it to the console.
//Find the button to open a CONFIRM alert and click it.
//Switch the focus from the main window to the Alert box and get the text in it and print it.
//Close the alert once with Ok and again with Cancel.
//Close the browser.


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.devtools.v113.debugger.Debugger.pause;
//
//public class Alerts {
//    public static void main(String[] args) {
//        WebDriverManager.firefoxdriver().setup();
//        WebDriver Driver = new FirefoxDriver();
//        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(10));
//        Driver.get("https://v1.training-support.net/selenium/javascript-alerts");
//        System.out.println(Driver.getTitle());
//        Driver.findElement(By.id("confirm")).click();
//        wait.until(ExpectedConditions.alertIsPresent());
//        Alert alert = Driver.switchTo().alert();
//        System.out.println(alert.getText());
//        alert.accept();
//    }
//}

public class Alerts {
    public static void main(String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        Thread thread = new Thread();
        // Create the Wait object
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Open the page
        driver.get("https://v1.training-support.net/selenium/javascript-alerts");
        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());

        // Find and click the button to open the alert
        driver.findElement(By.id("confirm")).click();

        // Switch focus to the alert
        Alert confirmAlert = driver.switchTo().alert();

        // Print the text in the alert
        String alertText = confirmAlert.getText();
        System.out.println("Text in alert: " + alertText);
        try {
            Thread.sleep(2000); // Sleep for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Close the alert by clicking OK
        confirmAlert.accept();

        // Can also close the alert by clicking Cancel
        // confirmAlert.dismiss();

        // Close the browser
        driver.quit();
    }
}