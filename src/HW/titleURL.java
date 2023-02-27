package HW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class titleURL {
    public static void main(String[] args) {
        //launch the browser
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        //navigate to amazon web site
        driver.get("https://www.amazon.com/");
        //print out the title and the url in the console
        String url = driver.getCurrentUrl();
        System.out.println(url);
        String title = driver.getTitle();
        System.out.println(title);
        //close the browser
        driver.close();
    }
}
