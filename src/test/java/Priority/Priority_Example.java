package Priority;

import org.testng.annotations.Test;

public class Priority_Example {//This is the hirarchy  basic of we have bases on priority define caps leter,negative number
    @Test(priority = 'A')
    public void testCaseA() {
        System.out.println("Test case A");
    }
  @Test(priority = -100)
    public void testCasem() {
        System.out.println("Test case m");
    }
@Test(priority = 3)
    public void testCaseX() {
        System.out.println("Test case X");
    }
@Test(invocationCount = 10,invocationTimeOut = 1)//ask interview invocation count
    public void testCaseg() {
        System.out.println("Test case g");
    }
}