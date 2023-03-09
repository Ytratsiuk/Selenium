package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//1.Open the Chrome browser and navigate to https://the-internet.herokuapp.com/dynamic_loading/1
//2.Click on the "Start" button to initiate the loading of a hidden element
//3.write a code that waits for the hidden element to appear using Explicit Wait
//5.Verify that the text "Hello World!" is now displayed on the page
public class HiddenElement {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        driver.findElement(By.xpath("//button")).click();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        WebElement text = driver.findElement(By.xpath("//h4[text()='Hello World!']"));
        wait.until(ExpectedConditions.visibilityOf(text));
        if (text.getText().equalsIgnoreCase("hello world!")) {
            System.out.println("the text Hello World! is now displayed on the page");
        }
    }
}
