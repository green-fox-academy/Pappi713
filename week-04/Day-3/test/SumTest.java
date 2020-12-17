import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumTest {
    Sum sum;

    @Before
    public void setup() {
        sum = new Sum();
    }
    @Test
    public void sumOfArrayElements_MultipleElements() {
        int[] array={1,1,1,1,1};
        int expected=5;
        assertEquals(expected,sum.sumOfArrayElements(array));
    }
    @Test
    public void somOfArrayElements_ZeroElement(){
        int[] array={};
        int expected =0;
        assertEquals(expected,sum.sumOfArrayElements(array));
    }
    @Test
    public void somOfArrayElements_OneElement(){
        int[] array={1};
        int expected =1;
        assertEquals(expected,sum.sumOfArrayElements(array));
    }
    @Test(expected =NullPointerException.class)
    public void somOfArrayElements_NullArray(){
        int[] array=null;
        int expected =0;
        assertEquals(expected,sum.sumOfArrayElements(array));
    }

}