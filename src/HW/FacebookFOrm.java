package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/*navigate to fb.com
        click on create new account
        fill up all the textboxes
        click on sign up button
        close the pop up
        close the browser*/
public class FacebookFOrm {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        //implicit wait declared once! no thread sleep-- waisting time.
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //to handle a cookies pop up
        /*if (driver.findElement(By.xpath("//button[@title='Allow essential and optional cookies']")).isDisplayed()) {
            driver.findElement(By.xpath("//button[@title='Allow essential and optional cookies']")).click();
        }*/
        driver.findElement(By.linkText("Create new account")).click();

        driver.findElement(By.name("firstname")).sendKeys("TestName");
        driver.findElement(By.name("lastname")).sendKeys("TestLastName");
        driver.findElement(By.name("reg_email__")).sendKeys("testemail@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("testemail@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("passTest");
        driver.findElement(By.name("birthday_month")).sendKeys("Dec");
        driver.findElement(By.name("birthday_day")).sendKeys("8");
        driver.findElement(By.name("birthday_year")).sendKeys("1999");
        driver.findElement(By.name("sex")).click();

        driver.findElement(By.name("websubmit")).click();

        driver.close();

        driver.quit();
    }
}
