package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MavenDemoExample {
         @Test
    public void verifyFunctionName1() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/admin/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        driver.close();
    }
    @Test
    public void verifyFunctionName2() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/admin/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.Facebook.com");
        driver.close();
    }
    @Test
    public void verifyFunctionName3() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/admin/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.close();
    }
}
