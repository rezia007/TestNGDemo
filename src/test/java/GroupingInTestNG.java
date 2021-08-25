import org.testng.annotations.Test;

public class GroupingInTestNG {
    @Test (groups = {"sanity"})
    void testLuna(){
        System.out.println("This is Test Luna");
    }

    @Test (groups = {"sanity"})
    void testShohag(){
        System.out.println("This is Test Shohag");
    }

    @Test(groups = {"regression"})
    void testSaihaan(){
        System.out.println("This is Test Saihaan");
    }

    @Test(groups ={"regression"})
    void testSafeer(){
        System.out.println("This is Test Safeer");
    }

    @Test(groups = {"sanity","regression"})
    void testPrima(){
        System.out.println("This is Test Prima");
    }

    @Test(groups = {"sanity","regression"})
    void testRubel(){
        System.out.println("This is Test Rubel");
    }

}
