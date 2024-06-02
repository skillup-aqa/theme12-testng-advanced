package ua.skillup.tests.part1;

import org.testng.annotations.Test;
import ua.skillup.part1.DivisionWithRemainderCalculator;
import static org.testng.Assert.assertEquals;

public class DivisionWithRemainderCalculatorTest {
    @Test
    public void DivisionWithRemainderCalculatorPositiveTest(){
        int dividend = 10;
        int divisor = 3;
        int expected = 1;
        int result = DivisionWithRemainderCalculator.calculateRemainder(dividend, divisor);
        assertEquals(result, expected);
    }
    @Test
    public void DivisionWithRemainderCalculatorNegativeTest(){
        int dividend = -10;
        int divisor = -3;
        int expected = -1;
        int result = DivisionWithRemainderCalculator.calculateRemainder(dividend, divisor);
        assertEquals(result, expected);
    }
    @Test
    public void DivisionWithRemainderCalculatorZero(){
        int dividend = 0;
        int divisor = 3;
        int expected = 0;
        int result = DivisionWithRemainderCalculator.calculateRemainder(dividend, divisor);
        assertEquals(result, expected);
    }
}
