package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
//fill out the form
//click on register
//close the browser
public class BankForm {
    public static void main(String[] args) throws InterruptedException {
        //launch the browser
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        //navigate to web site
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("Yuliya");
        driver.findElement(By.id("customer.lastName")).sendKeys("Tratsiuk");
        driver.findElement(By.id("customer.address.street")).sendKeys("101, Sunny Lany 5");
        driver.findElement(By.id("customer.address.city")).sendKeys("San Francisco");
        driver.findElement(By.id("customer.address.state")).sendKeys(" CA ");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("89065");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("3025693650");
        driver.findElement(By.id("customer.ssn")).sendKeys("456-60-5678");
        driver.findElement(By.id("customer.username")).sendKeys("ytratsiuk");
        driver.findElement(By.id("customer.password")).sendKeys("passwordSelenium234*");
        driver.findElement(By.id("repeatedPassword")).sendKeys("passwordSelenium234*");
        Thread.sleep(5000);
        driver.findElement(By.className("button")).click();
    }
}
