import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class T3 {
    public static void main(String[] args) {
        // Setup the Firefox driver(GeckoDriver)

        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("http://v1.training-support.net/");

        // Perform testing and assertions
        String i= driver.findElement(By.xpath("//title")).getText();
        //driver.findElement(By.xpath("//button[@id='about-link']")).click();
        //String j= driver.findElement(By.xpath("//title")).getText();
        System.out.println(i);
//        System.out.println(j);

        // Close the browser
        // Feel free to comment out the line below
        // so it doesn't close too quickly
        driver.quit();
    }
}