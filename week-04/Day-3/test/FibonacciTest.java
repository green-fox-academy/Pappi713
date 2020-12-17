import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

    Fibonacci fibonacci;

    @Before
    public void setup(){
        fibonacci=new Fibonacci();
    }

    @Test (expected =IllegalArgumentException.class)
    public void fibonnaci() {
        assertEquals(0,fibonacci.fibo(-1));
    }
    @Test
    public void HappyFibonacci() {
        assertEquals(8,fibonacci.fibo(6));
    }
}