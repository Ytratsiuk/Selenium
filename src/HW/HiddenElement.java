package HW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//1.Open the Chrome browser and navigate to https://the-internet.herokuapp.com/dynamic_loading/1
//2.Click on the "Start" button to initiate the loading of a hidden element
//3.Without using Thread.sleep(), write a code that waits for the hidden element to appear using Implicit Wait
//4.Click the "Finish" button to reveal the hidden element
//5.Verify that the text "Hello World!" is now displayed on the page
public class HiddenElement {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

    }
}
