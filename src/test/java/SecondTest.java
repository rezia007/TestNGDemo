import org.testng.annotations.Test;

public class SecondTest {
    @Test(priority = 1)
    void setup(){
        System.out.println();
        System.out.println("Opening Test Case");
    }
    @Test(priority = 3)
    void searchCustomer(){
        System.out.println("This is Search Customer Test");
    }
    @Test(priority = 2)
    void addCustomer(){
        System.out.println("This is Add Customer Test");
    }

    @Test(priority = 4)
    void teardown(){
        System.out.println("Closing Test Case");

    }
}


