//Using Selenium:
//
//Open a new browser to https://v1.training-support.net/selenium/tables
//Get the title of the page and print it to the console.
//Using xpaths on the first table:
//Find the number of rows and columns in the table and print them.
//Find and print all the cell values in the third row of the table.
//Find and print the cell value at the second row second column.
//Close the browser.

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

import java.time.Duration;

public class Table1 {
    public static void main(String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        // Create the Wait object
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Open the page
        driver.get("https://v1.training-support.net/selenium/tables");
        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());
        List<WebElement> rows = driver.findElements(By.xpath("//table[@class=\"ui celled striped table\"]/tbody/tr"));
        System.out.println(rows.size());
        List<WebElement> cols = driver.findElements(By.xpath("//table[@class=\"ui celled striped table\"]/tbody/tr[1]/td"));
        List<WebElement> cols1 = driver.findElements(By.xpath("//table[@class=\"ui celled striped table\"]/tbody/tr[3]/td"));
        System.out.println(cols.size());
        for(WebElement cell : cols1) {
            System.out.println(cell.getText());
        }
        WebElement cell = driver.findElement(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[2]/td[2]"));
        System.out.println(cell.getText());

        driver.close();


    }
}