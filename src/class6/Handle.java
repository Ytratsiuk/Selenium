package class6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/gmail/about/");
        //driver.findElement(By.xpath());
        driver.manage().window().maximize();


        driver.getWindowHandles();
    }
}
