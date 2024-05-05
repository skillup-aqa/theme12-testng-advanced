package ua.skillup.tests.part1;

import org.testng.annotations.Test;
import ua.skillup.part1.ArithmeticMeanCalculator;

import static org.testng.Assert.assertEquals;

public class ArithmeticMeanCalculatorTest {
    @Test
    public void testCalculateArithmeticMean() {
        double a = 1;
        double b = 2;
        double c = 3;
        double expected = 2;
        double result = ArithmeticMeanCalculator.calculateArithmeticMean(a, b, c);
        assertEquals(result, expected);
    }

    @Test
    public void testCalculateArithmeticMeanNegative() {
        double a = -1;
        double b = -2;
        double c = -3;
        double expected = -2;
        double result = ArithmeticMeanCalculator.calculateArithmeticMean(a, b, c);
        assertEquals(result, expected);
    }

    @Test
    public void testCalculateArithmeticMeanZero() {
        double a = 0;
        double b = 0;
        double c = 0;
        double expected = 0;
        double result = ArithmeticMeanCalculator.calculateArithmeticMean(a, b, c);
        assertEquals(result, expected);
    }
}
