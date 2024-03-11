//Activity 17
//Selects #1
//Using Selenium:
//
//Open a new browser to https://v1.training-support.net/selenium/selects
//Get the title of the page and print it to the console.
//On the Single Select:
//Select the second option using the visible text.
//Select the third option using the index.
//Select the fourth option using the value.
//Get all the options and print them to the console.
//Close the browser.


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SingleSelect {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver Driver = new FirefoxDriver();
        Driver.get("https://v1.training-support.net/selenium/selects");
        System.out.println(Driver.getTitle());
        WebElement Dropdown = Driver.findElement(By.tagName("select"));
        Select select =new Select(Dropdown);
        select.selectByVisibleText("Option 2");
        select.selectByIndex(3);
        select.selectByValue("4");
        List<WebElement> options = select.getOptions();
        for(WebElement option:options){
            System.out.println(option.getText());
        }
        Driver.quit();
    }
}
