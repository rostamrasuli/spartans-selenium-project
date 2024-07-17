package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class activity1 {
    public static void main(String[] args) throws InterruptedException {

 WebDriver webDriver = new ChromeDriver();
 Thread.sleep(3000);
        webDriver.manage().window().maximize();
        webDriver.get("https://retail.tekschool-students.com/");
       By signInLocator = By.id("signinlink");
















    }
}
