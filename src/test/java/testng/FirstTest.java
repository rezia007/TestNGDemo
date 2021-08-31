package testng;

import org.testng.annotations.Test;

public class FirstTest {
    @Test(priority = 1)
    void setup(){

        System.out.println("Opening Browser");
    }
    @Test(priority = 2)
    void login(){
        System.out.println("This is Login Test");
    }
    @Test(priority = 3)
    void teardown(){
        System.out.println("Closing Browser");
    }
}
