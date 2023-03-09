package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//1.Open the Chrome browser and navigate to https://the-internet.herokuapp.com/iframe
//2.Switch to the iframe on the page
//3.Clear the existing text in the  editor inside the iframe
//4.Enter the text "Hello World!" in the editor inside the iframe
//5.Switch back to the main page
public class Iframe {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/iframe");
        WebElement iframe = driver.findElement(By.xpath("//iframe[@title='Rich Text Area']"));
        driver.switchTo().frame(iframe);
        WebElement writtenText = driver.findElement(By.xpath("//body[@id='tinymce']"));
        if (!writtenText.getText().equalsIgnoreCase("")) {
            writtenText.clear();
            System.out.println("The textbox is: " + writtenText.getText() + "empty");
            writtenText.sendKeys("Hello World!");
            System.out.println("The textbox has text: " + writtenText.getText());
        }
        driver.switchTo().defaultContent();
    }
}
