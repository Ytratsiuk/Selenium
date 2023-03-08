package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioBoxes {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        driver.manage().window().maximize();
        WebElement checkBox = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
        checkBox.click();
        System.out.println(checkBox.isSelected());
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='cb1-element']"));
        for (int i = 0; i < checkBoxes.size(); i++){
            String value = checkBoxes.get(i).getAttribute("value");
            if(value.equalsIgnoreCase("Option-2")){
                checkBoxes.get(i).click();
            }
        }

    }
}
