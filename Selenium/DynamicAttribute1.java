
//Dynamic Attributes #2
//Using Selenium:
//
//Open a new browser to https://v1.training-support.net/selenium/dynamic-attributes
//Get the title of the page and print it to the console.
//Find the input fields of the Sign Up form.
//Fill in the details in the fields with your own data.
//Wait for success message to appear and print it to the console.
//Close the browser.


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicAttribute1 {
    public static void main(String[] args){
        WebDriverManager.firefoxdriver().setup();
        WebDriver Driver = new FirefoxDriver();
        Driver.get("https://v1.training-support.net/selenium/dynamic-attributes");
        System.out.println(Driver.getTitle());
        WebElement Username=Driver.findElement(By.xpath("//input[contains(@class, '-username')]"));
        Username.sendKeys("Jack");
        WebElement Password=Driver.findElement(By.xpath("//input[contains(@class, '-password')]"));
        Password.sendKeys("Jack123");
        WebElement confirmPassword = Driver.findElement(By.xpath("//label[text() = 'Confirm Password']/following-sibling::input"));
        confirmPassword.sendKeys("Jack123");
        WebElement email = Driver.findElement(By.xpath("//label[contains(text(), 'mail')]/following-sibling::input"));
        email.sendKeys("real_email@xyz.com");

        Driver.findElement(By.xpath("//button[contains(text(), 'Sign Up')]")).click();

        // Print login message
        String loginMessage = Driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login message: " + loginMessage);
        System.out.println(Driver.findElements(By.id("search")).size());
        // Close the browser
        Driver.quit();
    }
}
