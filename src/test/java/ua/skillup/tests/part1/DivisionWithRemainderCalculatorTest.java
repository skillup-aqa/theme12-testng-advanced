package ua.skillup.tests.part1;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import ua.skillup.part1.DivisionWithRemainderCalculator;

import static org.testng.Assert.assertEquals;

public class DivisionWithRemainderCalculatorTest {

    @Test
    public void DivisionWithRemainderCalculatorTestPositive() {
        int dividend = 5;
        int divisor = 2;
        assertEquals(DivisionWithRemainderCalculator.calculateRemainder(dividend, divisor), 1);
    }

    @Test
    public void DivisionWithRemainderCalculatorTestDivisionByZero() {
        int dividend = 5;
        int divisor = 0;
        try {
            DivisionWithRemainderCalculator.calculateRemainder(dividend, divisor);
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "Divisor cannot be 0");
        }
    }


}
