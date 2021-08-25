import org.testng.annotations.*;

public class TestCase001 {
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
    void test001(){
        System.out.println("This is Test 001...");
    }
    @Test
    void test002(){
        System.out.println("This is Test 002...");
    }
    @BeforeTest
    void beforeTest(){
        System.out.println("Execute Before Test %%%");
    }
    @AfterTest
    void afterTest(){
        System.out.println("Execute After Test &&&");
    }

}
