//Using Selenium:
//
//Open a new browser to https://v1.training-support.net/selenium/tab-opener
//Get the title of the page and print it to the console.
//Find the button to open a new tab and click it.
//Wait for the new tab to open.
//Print all the handles.
//Switch to the newly opened tab, print it's title and heading.
//Repeat the steps by clicking the button in the new tab page.
//Close the browser.

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class Window {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver Driver=new FirefoxDriver();
        WebDriverWait wait =new WebDriverWait(Driver, Duration.ofSeconds(10));
        Driver.get("https://v1.training-support.net/selenium/tab-opener");
        System.out.println(Driver.getTitle());
        Driver.findElement(By.xpath("//a[@id=\"launcher\"]")).click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        System.out.println("Currently open windows: " + Driver.getWindowHandles());
        for(String Window:Driver.getWindowHandles()){
            Driver.switchTo().window(Window);
        }
        wait.until(ExpectedConditions.elementToBeClickable(By.id("actionButton")));
        System.out.println("Current tab: " + Driver.getWindowHandle());
        System.out.println("Page title: " + Driver.getTitle());
        String pageHeading = Driver.findElement(By.className("content")).getText();
        System.out.println("Page Heading: " + pageHeading);
        Driver.findElement(By.id("actionButton")).click();

        wait.until(ExpectedConditions.numberOfWindowsToBe(3));
        for(String handle : Driver.getWindowHandles()) {
            Driver.switchTo().window(handle);
        }

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("content")));
        Set<String> numTabs = Driver.getWindowHandles();
        System.out.println(numTabs.size());
        System.out.println("Current tab: " + Driver.getWindowHandle());
        System.out.println("Page title: " + Driver.getTitle());
        pageHeading = Driver.findElement(By.className("content")).getText();
        System.out.println("Page Heading: " + pageHeading);

        Driver.quit();
    }
}
