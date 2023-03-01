package demo;

import org.testng.annotations.*;

public class AnnotationExample extends AnnotationExample2 {
    @BeforeClass
    public  void beforeClassExample(){
        System.out.println("Before Class Example");
    }
    @BeforeMethod
    public  void beforeMethodExample(){
        System.out.println("Before Method ");
    }
    @Test
    public  void testcase1(){
        System.out.println("Test case 1 ");
    }
    @Test
    public void testcase2(){
        System.out.println("Test case 2");
    }
    @Test
    public void testcase3(){
        System.out.println("Test case 3");
    }
    @AfterMethod
    public  void afterMethodExample(){
        System.out.println("After Method ");
    }
    @AfterClass
    public  void afterClassExample(){
        System.out.println("after Class Example");
    }
}
