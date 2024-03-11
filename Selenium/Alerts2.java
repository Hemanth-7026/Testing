//Activity 20
//Alerts #2
//Using Selenium:
//
//Open a new browser to https://v1.training-support.net/selenium/javascript-alerts
//Get the title of the page and print it to the console.
//Find the button to open a PROMPT alert and click it.
//Switch the focus from the main window to the Alert box and get the text in it and print it.
//Type "Awesome!" into the prompt.
//Close the alert by clicking Ok.
//Close the browser.

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Alerts2 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver Driver = new FirefoxDriver();
        Thread thread = new Thread();
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(10));
        Driver.get("https://v1.training-support.net/selenium/javascript-alerts");
        System.out.println(Driver.getTitle());
        Driver.findElement(By.id("prompt")).click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = Driver.switchTo().alert();
        System.out.println(alert.getText());

        alert.sendKeys("Awesome");
        try {
            Thread.sleep(2000); // Sleep for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        alert.accept();
        Driver.quit();

    }
}
