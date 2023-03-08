package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDrop {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();
        WebElement DD =driver.findElement(By.xpath("//select[@id='multi-select']"));
        Select multipleSelect = new Select(DD);
        multipleSelect.selectByVisibleText("New Jersey");
        multipleSelect.selectByVisibleText("Ohio");
    }
}
