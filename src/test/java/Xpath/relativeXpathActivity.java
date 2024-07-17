package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class relativeXpathActivity {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//p[text()='Video Games']")).click();
        driver.findElement(By.xpath("//p[text()='PlayStation 5 Console']")).click();
        driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();



    }







}
