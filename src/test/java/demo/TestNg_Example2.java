package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg_Example2 {
    public  static WebDriver driver;
    @BeforeMethod
    public void beforeMethodExample1()  {
        System.out.println("This is before method");
        System.setProperty("webdriver.chrome.driver", "C:/Users/admin/Downloads/chromedriver_win32/chromedriver.exe");
         driver = new ChromeDriver();

    }
    @Test
    public void verifyFunctionName1()  {
        System.out.println("verifyFunctionName1");
        driver.get("https://www.Facebook.com");


    }
    @Test
    public void verifyFunctionName2() {
        System.out.println("verifyFunctionName2");
        driver.get("https://www.google.com");


    }
    @Test
    public void verifyFunctionName3() {
        System.out.println("verifyFunctionName2");
        driver.get("https://www.amazon.com");


    }
    @AfterMethod
    public void afterMethodExample(){
        System.out.println("This is after method");

    }
}

