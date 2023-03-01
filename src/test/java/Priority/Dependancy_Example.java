package Priority;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependancy_Example {
    @Test(groups = "smoke")//smoke test case means high priority//smoke is a group name
    public void testCaseA() {
        Assert.assertTrue(false);
    }
    @Test(dependsOnMethods = {"testCaseA"},alwaysRun = true)//it will execute at any cost
    public void testCasem() {
        System.out.println("Test case m");
    }
    //you may need to invoke methods in a test case in a particular order,
    // or you may want to share some data and state between methods.
    //This kind of dependency is supported by TestNG,
    // as it supports the declaration of explicit dependencies between test methods.
    @Test(dependsOnGroups = {"smoke"})
    public void testCaseX() {
        System.out.println("Test case X");
    }
    @Test(enabled = true)//In such cases, annotation helps to disable this test case.
    public void testCaseg() {
        System.out.println("Test case g");
    }
    @Test(expectedExceptions = {ArithmeticException.class})
   public  void  testcased(){

            System.out.println(10/0);


        System.out.println("Hii");
    }
}
