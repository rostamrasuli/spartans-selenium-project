package tek.intro;

import org.openqa.selenium.chrome.ChromeDriver;

public class handlechrome {
    public static void main(String[] args) {

       ChromeDriver ChromeDriver = new ChromeDriver();
       ChromeDriver.get("https:facebook.com");
       ChromeDriver.get("https://google.com");
      ChromeDriver.manage().window().maximize();
      String Title = ChromeDriver.getTitle();
        System.out.println("Title");
        ChromeDriver.quit();




    }
}
