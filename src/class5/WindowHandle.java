package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S-1291190790%3A1678243026259432&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ifkv=AWnogHdb8nCgg9TK7ONUl6jFPC9dbH3k4x5J18iYLiMhlVrkmW1A9lYhPPUuxiuC-8MuzwmUSUWW&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        driver.findElement(By.xpath("//a[text()='Help']")).click();
        driver.findElement(By.xpath("//a[text()='Privacy']")).click();
        String parentWindowHandle = driver.getWindowHandle();
        System.out.println(parentWindowHandle);
        Set<String> windowHandles = driver.getWindowHandles();
        for (String wh : windowHandles) {
            driver.switchTo().window(wh);
            String title = driver.getTitle();
            if (title.equalsIgnoreCase("Google Account Help")) {
                break;
            }
        }
        System.out.println(driver.getTitle());
        driver.switchTo().window(parentWindowHandle);
        System.out.println(driver.getTitle());
    }
}