package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

//go to http://practice.syntaxtechs.net/basic-checkbox-demo.php
//1. u need to write down the code that can select  1 check box out of 4 mentioned,
//e.g option1 , option2 , option 3, option 4
public class selectOneOfFour {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        driver.manage().window().maximize();
        List<WebElement> btns = driver.findElements(By.xpath("//input[@class='cb1-element']"));
        for (WebElement btn : btns) {
            if (btn.isDisplayed() && btn.isEnabled() && !btn.isSelected()) {
                if (btn.getAttribute("value").equalsIgnoreCase("Option-2")) {
                    btn.click();
                }
            }
        }
    }
}
