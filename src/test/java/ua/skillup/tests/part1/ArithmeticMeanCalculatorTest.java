package ua.skillup.tests.part1;

import org.testng.annotations.*;
import ua.skillup.part1.ArithmeticMeanCalculator;

import static org.testng.Assert.assertEquals;

public class ArithmeticMeanCalculatorTest {

    private static int i = 1;
    @BeforeClass
    public void startTest() {
        System.out.println("Start ArithmeticMeanCalculatorTest");
    }

    @AfterClass
    public void endClass() {
        System.out.println("End ArithmeticMeanCalculatorTest");
    }

    @BeforeMethod
    public void startMethod() {
        System.out.println("Start Test Method " + i);
    }

    @AfterMethod
    public void endMethod() {
        System.out.println("End Test Method " + i);
        i++;
    }

    @Test
    public void testArithmeticMeanCalculatorPositive() {
        double a = 1, b = 2, c = 3, expected = 2;
        assertEquals(ArithmeticMeanCalculator.calculateArithmeticMean(a, b, c), expected);
    }

    @Test
    public void testArithmeticMeanCalculatorNegative() {
        double a = -1, b = -2, c = -3, expected = -2;
        assertEquals(ArithmeticMeanCalculator.calculateArithmeticMean(a, b, c), expected);
    }

    @Test
    public void testArithmeticMeanCalculatorZero() {
        double a = 0, b = 0, c = 0, expected = 0;
        assertEquals(ArithmeticMeanCalculator.calculateArithmeticMean(a, b, c), expected);
    }

}
