//Check if elements are selected
//Using Selenium:
//
//Open a new browser to https://v1.training-support.net/selenium/dynamic-controls
//Get the title of the page and print it to the console.
//On the page, perform:
//Find the checkbox input element.
//Check if the checkbox is selected and print the result.
//Click the checkbox to select it.
//Check if the checkbox is selected again and print the result.
//Close the browser.



import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.*;

class T13 {
    public static void main(String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        // Create the Wait object
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Open the page
        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());

        // Find the toggle button and click it
        WebElement checkbox = driver.findElement(By.id("toggleCheckbox"));
        if(checkbox.isDisplayed()){
            checkbox.click();
        }
        // Wait for the checkbox to disappear
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dynamicCheckbox")));
        System.out.println(checkbox.isSelected());
        // Click the button again
        checkbox.click();
        // Wait for the element to appear
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dynamicCheckbox")));
        System.out.println(checkbox.isSelected());
        driver.findElement(By.xpath("//input[@class='willDisappear']")).click();
        // Close the browser
        driver.close();
    }
}