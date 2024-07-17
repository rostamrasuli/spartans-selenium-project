package crossbrowsing;

import org.openqa.selenium.firefox.FirefoxDriver;

public class crossbrowsing {

    public static void main(String[] args) {

        FirefoxDriver firefoxDriver = new FirefoxDriver();

        firefoxDriver.get("https:google.com");
        firefoxDriver.manage().window().maximize();
        firefoxDriver.getTitle();
        System.out.println("title");
        firefoxDriver.quit();



    }










}
