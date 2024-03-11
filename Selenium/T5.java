import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class T5 {
    public static void main(String[] args) {
        //Setup the Firefox driver(GeckoDriver)

        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://v1.training-support.net/selenium/input-events");
        String j = driver.getTitle();
        System.out.println(j);
        // Perform testing and assertions
        Actions action = new Actions(driver);
        WebElement Elementtoclick = driver.findElement(By.xpath("//div[@class='active']"));
        action.click(Elementtoclick).build().perform();
        System.out.println(driver.findElement(By.xpath("//div[@class='active']")).getText());
        action.doubleClick(Elementtoclick).build().perform();
        System.out.println(driver.findElement(By.xpath("//div[@class='active']")).getText());
        action.contextClick(Elementtoclick).build().perform();
        System.out.println(driver.findElement(By.xpath("//div[@class='active']")).getText());

        // Close the browser

        // Feel free to comment out the line below
        // so it doesn't close too quickly
        driver.quit();
    }
}