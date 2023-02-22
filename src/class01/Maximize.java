package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        //go to
        driver.navigate().to("www.google.com");
        //maximize
        driver.manage().window().maximize();
        //full screen
        driver.manage().window().fullscreen();
        //close
        driver.quit();
    }
}