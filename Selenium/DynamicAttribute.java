//Activity 15
//Dynamic Attributes #1
//Using Selenium:
//
//Open a new browser to https://v1.training-support.net/selenium/dynamic-attributes
//Get the title of the page and print it to the console.
//Find the username and password input fields. Type in the credentials:
//username: admin
//password: password
//Wait for login message to appear and print the login message to the console.
//Close the browser.

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicAttribute {
    public static void main(String[] args){
        WebDriverManager.firefoxdriver().setup();
        WebDriver Driver = new FirefoxDriver();
        Driver.get("https://v1.training-support.net/selenium/dynamic-attributes");
        System.out.println(Driver.getTitle());
        WebElement Username=Driver.findElement(By.xpath("//input[starts-with(@class, \"username-\")]"));
        Username.sendKeys("admin");
        WebElement Password=Driver.findElement(By.xpath("//input[starts-with(@class,\"password-\")]"));
        Password.sendKeys("password");
        Driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
        WebElement message=Driver.findElement(By.id("action-confirmation"));
        System.out.println(message.getText());
        Driver.quit();
    }
}
