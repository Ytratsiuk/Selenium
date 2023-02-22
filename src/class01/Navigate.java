package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
    public static void main(String[] args) throws InterruptedException {
        //to connect to the driver --- "name of the driver" "path"
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        //initiate an instatnce of webdriver
        WebDriver driver = new ChromeDriver();
        //open google
        driver.get("https://www.google.com/");
        //to slow down
        Thread.sleep(2000);
        //navigate to a particular website
        driver.navigate().to("https://www.facebook.com/");
        //so it will first open google then facebook
        Thread.sleep(2000);

        //to go back
        //we can only go back using navigate().back()
        driver.navigate().back();
        Thread.sleep(2000);
        //to go again to facebook

        driver.navigate().forward();
        Thread.sleep(2000);

        //to refresh a page
        driver.navigate().refresh();
        driver.close();
    }
}
