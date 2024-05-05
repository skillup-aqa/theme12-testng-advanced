package ua.skillup.tests.part3;

import org.testng.Assert;
import org.testng.annotations.Test;
import ua.skillup.part3.MathCalculator;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class CalculatorTest {
    @Test
    public void testSumNumbersToN() {
        int n = 5;
        int expected = 15;
        Assert.assertEquals(MathCalculator.sumPositiveNumbersToN(n), expected);
    }

    @Test
    public void testSumNumbersTo0() {
        int n = 0;
        int expected = 0;
        assertEquals(MathCalculator.sumPositiveNumbersToN(n), expected);
    }

    @Test
    public void testCalculateFactorial() {
        int n = 5;
        int expected = 120;
        assertEquals(MathCalculator.factorial(n), expected);
    }

    @Test
    public void testIsPrime() {
        int n = 7;
        boolean expected = true;
        assertEquals(MathCalculator.isPrime(n), expected);
    }

    @Test
    public void testIsPrimeNegative() {
        int n = 8;
        boolean expected = false;
        assertEquals(MathCalculator.isPrime(n), expected);
    }

    @Test
    public void testIsPrimeOne() {
        int n = 1;
        boolean expected = false;
        assertEquals(MathCalculator.isPrime(n), expected);
    }

    @Test
    public void testIsArmstrongNumber() {
        int n = 153;
        boolean expected = true;
        assertEquals(MathCalculator.isArmstrongNumber(n), expected);
    }

    @Test
    public void testIsArmstrongNumberNegative() {
        int n = 154;
        boolean expected = false;
        assertEquals(MathCalculator.isArmstrongNumber(n), expected);
    }

    @Test
    public void testNegativeValueSum() {
        assertThrows(IllegalArgumentException.class, () -> MathCalculator.sumPositiveNumbersToN(-1));
    }

    @Test
    public void testNegativeValueFactorial() {
        assertThrows(IllegalArgumentException.class, () -> MathCalculator.factorial(0));
    }

    @Test
    public void testNegativeValueIsPrime() {
        assertThrows(IllegalArgumentException.class, () -> MathCalculator.isPrime(0));
    }

    @Test
    public void testNegativeValueIsArmstrongNumber() {
        assertThrows(IllegalArgumentException.class, () -> MathCalculator.isArmstrongNumber(0));
    }

    @Test
    public void testPrintFibonacciNumbers() {
        assertThrows(IllegalArgumentException.class, () -> MathCalculator.printFibonacciNumbers(1));
    }

    @Test
    public void testNegativeDigitsReversed() {
        assertThrows(IllegalArgumentException.class, () -> MathCalculator.printDigitsReversed(0));
    }
}
