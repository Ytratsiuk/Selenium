package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//go to http://practice.syntaxtechs.net/basic-checkbox-demo.php
//1. u need to write down the code that can select  1 check box out of 4 mentioned,
//e.g option1 , option2 , option 3, option 4
public class selectOneOfFour {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@value='Option-2']")).click();

    }

}
