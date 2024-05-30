package ua.skillup.tests.part3;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ua.skillup.part3.MathCalculator;

import static org.testng.Assert.*;

public class MathCalculatorTest {

    @Test
    public void checkIsPositiveException() {
        int number = 0;
        assertThrows(IllegalArgumentException.class, () -> MathCalculator.factorial(number));
    }

    @Test
    public void sumPositiveNumbersToNException() {
        int number = -1;
        assertThrows(IllegalArgumentException.class, () -> MathCalculator.sumPositiveNumbersToN(number));
    }

    @Test
    public void printFibonacciNumbersException() {
        int number = 1;
        assertThrows(IllegalArgumentException.class, () -> MathCalculator.printFibonacciNumbers(number));
    }

    @Test
    public void sumPositiveNumbersToNPositive() {
        int number = 3, expected = 6;
        assertEquals(MathCalculator.sumPositiveNumbersToN(number), expected);
    }

    @Test
    public void factorialPositive() {
        int number = 4, expected = 24;
        assertEquals(MathCalculator.factorial(number), expected);
    }

    @DataProvider(name = "forPrime")
    public Object[][] numbers() {
        return new Object[][]{
                {1, false},
                {5, true},
                {6, false},
        };
    }

    @Test(dataProvider = "forPrime")
    public void isPrimePositive(int number, boolean expected) {
        assertEquals(MathCalculator.isPrime(number), expected);
    }

    @Test
    public void isArmstrongNumberTrue() {
        assertTrue(MathCalculator.isArmstrongNumber(370));
    }

    @Test
    public void isArmstrongNumberFalse() {
        assertFalse(MathCalculator.isArmstrongNumber(20));
    }

}


