package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//goto http://practice.syntaxtechs.net/basic-checkbox-demo.php
//check if the check box    "click on this check box" is Selected
//if no  Select the check box
//check gain if the checkbox is Selected or not
public class CheckBox {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        WebElement clickOn = driver.findElement(By.cssSelector("input[type='checkbox']"));
        boolean isSelected = clickOn.isSelected();
        System.out.println("the radio button male is selected " + isSelected);
        if (!isSelected) {
            clickOn.click();
        }
        isSelected = clickOn.isSelected();
        System.out.println("the status of selection is " + isSelected);
    }
}
