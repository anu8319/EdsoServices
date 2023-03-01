package demo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class AnnotationExample2 {
    @BeforeMethod
    public void beforeTestExample(){
        System.out.println("before Test Example");
    }
    @AfterMethod
    public void afterTestExample(){
        System.out.println("after Test Example");
    }
}
