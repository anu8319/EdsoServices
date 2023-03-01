package demo.Parameter;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
    @Parameters({"courseName","cityName"})//this is run file in tstng.xml file
    @Test
    public  void verifySearchOnGoogle(String courseName,String cityName ){
        System.setProperty("webdriver.chrome.driver", "C:/Users/admin/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        WebElement element = driver.findElement(By.name("q"));
           element.sendKeys(courseName+ " " +cityName );//within test script a value
        // shoulld be hard code and run should be .xml file
           element.sendKeys(Keys.ENTER);
        driver.close();
    }
}
