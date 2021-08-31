package testng;

import org.testng.annotations.*;

public class TestCase002 {
    @BeforeClass
    void beforeClass(){
        System.out.println("This will execute before the Class ***");
    }
    @AfterClass
    void afterClass(){
        System.out.println("This will execute after the Class ***");
    }
    @BeforeMethod
    void beforeMethod(){
        System.out.println("This will execute before every method $$$");
    }
    @AfterMethod
    void afterMethod(){
        System.out.println("This will execute after every method $$$");
    }
    @Test
    void test003(){
        System.out.println("This is Test 003...$$$");
    }
    @Test
    void test004(){
        System.out.println("This is Test 004...$$$");
    }

    @BeforeSuite
    void beforeSuite(){
        System.out.println("Will Execute Before Suite<<<");
    }
    @AfterSuite
    void afterSuite(){
        System.out.println("Will Execute After Suite>>>");
    }
}
