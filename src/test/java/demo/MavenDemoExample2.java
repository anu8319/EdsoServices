package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MavenDemoExample2 {
    public static WebDriver driver;

    @BeforeMethod
    public void beforeMethodExample() {
        System.out.println("This is Before Method");
        System.setProperty("webdriver.chrome.driver", "C:/Users/admin/Downloads/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
    }

}
