package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaToPoint {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.javatpoint.com/");
        driver.manage().window().maximize();
        //driver.findElement(By.xpath( "//a[@href='java-tutorial']")).click();
        driver.findElement(By.id("gsc-i-id2")).sendKeys("HTML");
        driver.findElement(By.xpath("//button[@class='gsc-search-button gsc-search-button-v2]")).click();

    }
}
