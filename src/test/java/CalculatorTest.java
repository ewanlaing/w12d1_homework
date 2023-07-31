import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void canSubtract(){
        assertEquals(2, calculator.subtract(5,3));
    }

    @Test
    public void canMultiply(){
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    public void canDivide(){
        assertEquals(2, calculator.divide(6, 3), 0.0);
    }
}