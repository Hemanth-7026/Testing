//Popups
//Using Selenium:
//
//Open a new browser to https://v1.training-support.net/selenium/popups
//Print the title of the page.
//Find the Sign in button and hover over it. Print the tooltip message.
//Click the button to open the Sign in form.
//Enter the credentials
//username: admin
//password: password
//Click login and print the message on the page after logging in.
//Finally, close the browser.


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Popups {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver Driver = new FirefoxDriver();
        Driver.get("https://v1.training-support.net/selenium/popups");
        System.out.println(Driver.getTitle());
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(10));
        // Create the Actions object
        Actions builder = new Actions(Driver);
        WebElement button = Driver.findElement(By.className("orange"));
        // Hover over the button
        builder.moveToElement(button).build().perform();
        // Print the tooltip message
        String tooltipMessage = button.getAttribute("data-tooltip");
        System.out.println(tooltipMessage);

        // Click the button and wait for the modal to appear
        button.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));

        // Find the input fields
        WebElement username = Driver.findElement(By.id("username"));
        WebElement password = Driver.findElement(By.id("password"));
        // Enter the credentials
        username.sendKeys("admin");
        password.sendKeys("password");
        // Click the login button
        Driver.findElement(By.xpath("//button[text()='Log in']")).click();

        // Print the login message
        String message = Driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login message: " + message);

        // Close the browser
        Driver.quit();


    }
}
