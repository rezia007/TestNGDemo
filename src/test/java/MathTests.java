import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MathTests {
    @Test
    public void add_TwoPlusTwo_ReturnFour(){
        final int expected=-5;

        final int actual=Math.add(-2,-3);
        assertEquals(actual,expected);
    }

    @Test
    public void multiple_twoNumbers_returnValue(){
        final int expected=10;

        final int actual=Math.multiply(5,2);
        assertEquals(actual,expected);
    }
    @Test
    public void divide_twoNumbers_returnValue(){
        final int expected=10;

        final int actual=Math.div(100,10);
        assertEquals(actual,expected);
    }
}
