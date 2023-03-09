package class6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.uitestpractice.com/Students/Switchto");
        driver.manage().window().maximize();
        //swith to the iframe by index
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("mamaamerica");
        driver.switchTo().defaultContent();
        WebElement text = driver.findElement(By.xpath("//h3"));
        System.out.println("the text it "+text.getText());
        driver.switchTo().frame("iframe_a");
       text= driver.findElement(By.xpath("//label"));
        System.out.println(text.getText());
    }
}
