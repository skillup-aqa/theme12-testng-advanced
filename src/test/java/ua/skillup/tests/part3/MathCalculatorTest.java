package ua.skillup.tests.part3;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ua.skillup.part3.MathCalculator;

import static org.testng.Assert.*;

public class MathCalculatorTest {

    @Test
    public void checkIsPositiveException() throws InterruptedException {
        int number = 0;
        //Thread.sleep(1000);
        assertThrows(IllegalArgumentException.class, () -> MathCalculator.factorial(number));
    }

    @Test
    public void sumPositiveNumbersToNException() throws InterruptedException {
        int number = -1;
        //Thread.sleep(1000);
        assertThrows(IllegalArgumentException.class, () -> MathCalculator.sumPositiveNumbersToN(number));
    }

    @Test
    public void printFibonacciNumbersException() {
        int number = 1;
        assertThrows(IllegalArgumentException.class, () -> MathCalculator.printFibonacciNumbers(number));
    }

    @Test
    public void sumPositiveNumbersToNPositive() throws InterruptedException {
        //Thread.sleep(1000);
        int number = 3, expected = 6;
        assertEquals(MathCalculator.sumPositiveNumbersToN(number), expected);
    }

    @Test
    public void factorialPositive() throws InterruptedException {
        int number = 4, expected = 24;
        //Thread.sleep(1000);
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
    public void isArmstrongNumberTrue() throws InterruptedException {
        //Thread.sleep(1000);
        assertTrue(MathCalculator.isArmstrongNumber(370));
    }


    @Test(retryAnalyzer = ua.skillup.listemers.RetryAnalyzer.class)
    public void isArmstrongNumberFalse() throws InterruptedException {
        //Thread.sleep(1000);

        //assertFalse(MathCalculator.isArmstrongNumber(370));
        assertFalse(MathCalculator.isArmstrongNumber(20));
    }

}


