package tek.intro;

import org.openqa.selenium.chrome.ChromeDriver;

public class classactivity2 {
    public static void main(String[] args) {

        ChromeDriver ChromeDriver = new ChromeDriver();
        ChromeDriver.get("http:dev.insurance.tekschool - students.com");
        ChromeDriver.manage().window().maximize();
        String Title = ChromeDriver.getTitle();
        System.out.println("title");
        ChromeDriver.quit();











    }
}
