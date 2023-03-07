package class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");
   WebElement username = driver.findElement(By.xpath("//input[contains(@name, 'username')]"));
        username.sendKeys("Tester");
        WebElement password = driver.findElement(By.xpath(" //input[@type='password']"));
        password.sendKeys("Testera");
        username.clear();
        WebElement userNameTExt= driver.findElement(By.xpath("//label[text()='Username:']"));
        System.out.println(userNameTExt.getText());

        WebElement passwordText= driver.findElement(By.xpath("//label[text()='Password:']"));
        System.out.println(passwordText.getText());

    }
}
