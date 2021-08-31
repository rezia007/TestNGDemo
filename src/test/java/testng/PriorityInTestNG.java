package testng;

import org.testng.annotations.Test;

public class PriorityInTestNG {
    @Test (priority = -1)
    void testOne(){
        System.out.println("This is Test 1 ......");
    }

    @Test (priority = 0)
    void testTwo(){
        System.out.println("This is Test 2 $$$$$$");
    }

    @Test(priority = -2)
    void testThree(){
        System.out.println("This is Test 3 @@@@@@");
    }

    @Test(priority = 2)
    void testFour(){
        System.out.println("This is Test 4 &&&&&&");
    }

    @Test(priority = 3,enabled = false)
    void testFive(){
        System.out.println("This is Test 5 >>>>>>");
    }

    @Test(priority = 1)
    void testSix(){
        System.out.println("This is Test 6 <<<<<<");
    }

}
