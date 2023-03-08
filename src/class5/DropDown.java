package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();
        WebElement dropLine= driver.findElement(By.xpath("//select[@id='select-demo'] "));
        Select dropdown = new Select(dropLine);
        dropdown.selectByIndex(2);
        Thread.sleep(3000);
        dropdown.selectByValue("Thursday");
        Thread.sleep(3000);
        dropdown.selectByVisibleText("Friday");
        WebElement DD =driver.findElement(By.xpath("//select[@id='multi-select']"));
        Select multipleSelect = new Select(DD);
        multipleSelect.selectByVisibleText("New Jersey");
        multipleSelect.selectByVisibleText("Ohio");


    }
}
