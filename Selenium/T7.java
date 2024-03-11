//Using Selenium:
//
//        Open a new browser to https://v1.training-support.net/selenium/drag-drop
//        Get the title of the page and print it to the console.
//        On the page, perform:
//        Find the ball and simulate a click and drag to move it into "Dropzone 1".
//        Verify that the ball has entered Dropzone 1.
//        Once verified, move the ball into "Dropzone 2".
//        Verify that the ball has entered Dropzone 2.
//        Close the browser.




import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import static org.apache.xmlbeans.impl.common.GlobalLock.release;

public class T7 {
    public static void main(String[] args) {
        //Setup the Firefox driver(GeckoDriver)

        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://v1.training-support.net/selenium/drag-drop");

        System.out.println(driver.getTitle());
        // Perform testing and assertions
        Actions builder = new Actions(driver);
        WebElement ball = driver.findElement(By.xpath("//img[@id=\"draggable\"]"));
        WebElement tar1 = driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
        WebElement tar2 = driver.findElement(By.xpath("//div[@id=\"dropzone2\"]"));
        builder.clickAndHold(ball).moveToElement(tar1).pause(2000).release().perform();
        String out1 = driver.findElement(By.xpath("//*[@id='droppable']/p")).getText();
        if (out1.equals("Dropped!")){
            System.out.println("Ball has been dropped in the Dropzone 1");
            builder.clickAndHold(ball).moveToElement(tar2).pause(2000).release().perform();
            String out2 = driver.findElement(By.xpath("//*[@id='dropzone2']/p")).getText();
            if (out2.equals("Dropped!")){
                System.out.println("Ball has been dropped in the Dropzone 2");
            }
            else {
                System.out.println("Ball has not been dropped in the Dropzone 2");
            }
        }
        else {
            System.out.println("Ball has not been dropped in the Dropzone 1");
        }
//        driver.findElement(By.xpath("//p[text='Dropped!']")).isSelected();


        // Close the browser

        // Feel free to comment out the line below
        // so it doesn't close too quickly
        driver.quit();

    }
}















//......................................................................................






//public class Activity7 {
//    public static void main(String[] args) {
//        // Set up Firefox driver
//        WebDriverManager.firefoxdriver().setup();
//        // Create a new instance of the Firefox driver
//        WebDriver driver = new FirefoxDriver();
//        // Create the Actions object
//        Actions builder = new Actions(driver);
//
//        // Open the page
//        driver.get("https://v1.training-support.net/selenium/drag-drop");
//        // Print the title of the page
//        System.out.println("Home page title: " + driver.getTitle());
//
//        // Find the football
//        WebElement football = driver.findElement(By.id("draggable"));
//        // Find the dropzone1
//        WebElement dropzone1 = driver.findElement(By.id("droppable"));
//        // Find the dropzone2
//        WebElement dropzone2 = driver.findElement(By.id("dropzone2"));
//
//        // Perform drag and drop to dropzone 1
//        builder.clickAndHold(football).moveToElement(dropzone1).pause(2000).release().build().perform();
//
//        // Perform drag and drop to dropzone 2
//        builder.dragAndDrop(football, dropzone2).build().perform();
//
//        // Close the browser
//        driver.close();
//    }
//}