package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*navigate to fb.com
        click on create new account
        fill up all the textboxes
        click on sign up button
        close the pop up
        close the browser*/
public class FacebookFOrm {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver chrome = new ChromeDriver();
        chrome.get("https://www.facebook.com/");
        chrome.manage().window().maximize();
        chrome.findElement(By.linkText("Create new account")).click();
        chrome.findElement(By.id("u_q_b_Sb")).click();
        chrome.findElement(By.className("lastname")).sendKeys("Tratsiuk");
        chrome.findElement(By.className("reg_email__")).sendKeys("parada@gmail.com");
        chrome.findElement(By.id("password_step_input")).sendKeys("proba739");
        chrome.findElement(By.id("month")).sendKeys("12");
        chrome.findElement(By.id("day")).sendKeys("25");
        chrome.findElement(By.id("year")).sendKeys("1985");
        chrome.findElement(By.className("_58mt")).click();
        Thread.sleep(4000);
        chrome.findElement(By.className("websubmit")).click();
        chrome.quit();
    }
}
