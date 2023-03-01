package demo.Parallelexecution;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Paralleled_Example {
    @Test
    public void AmazonTest(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/admin/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        driver.close();
    }
    @Test
    public void GoogleTest(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/admin/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.close();
    }
    @Test
    public void FlipkartTest(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/admin/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com");
        driver.close();
    }
    @Test
    public void FacebookTest(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/admin/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.close();
    }
    @Test
    public void RediffTest(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/admin/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rediffmail.com");
        driver.close();
    }
}
