package crossbrowsing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.SQLOutput;
import java.util.Scanner;

public class crosshandling {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("choose your brwoser type: chrome,firefox and edge");
        String browserType = scanner.next();
        WebDriver driver;

        if(browserType.equals("Chrome")) {
            driver = new ChromeDriver();
        }else if(browserType.equals("edge")) {
            driver = new EdgeDriver();
        } else if (browserType.equals("firefox")) {
            driver = new FirefoxDriver();
        } else { throw new RuntimeException("wrong driver");
        }

        driver.get("https:google.com");







    }
}
