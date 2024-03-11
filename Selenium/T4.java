import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class T4 {
    public static void main(String[] args) {
        // Setup the Firefox driver(GeckoDriver)

        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://v1.training-support.net/selenium/target-practice");

        // Perform testing and assertions
        String j = driver.getTitle();
        System.out.println(j);
        System.out.println(driver.findElement(By.xpath("//h3[@id=\"third-header\"]")).getText());
        System.out.println(driver.findElement(By.xpath("//h5[@class=\"ui green header\"]")).getCssValue("color"));
        System.out.println(driver.findElement(By.xpath("//button[@class=\"ui violet button\"]")).getAttribute("class"));
        System.out.println(driver.findElement(By.xpath("//button[@class=\"ui grey button\"]")).getText());
        // Close the browser
        // Feel free to comment out the line below
        // so it doesn't close too quickly
        driver.quit();
    }
}