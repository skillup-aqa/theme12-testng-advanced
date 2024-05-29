package ua.skillup.tests.part1;

import org.testng.annotations.Test;
import ua.skillup.part1.PercentCalculator;
import static org.testng.Assert.assertEquals;
public class PercentCalculatorTest {
    @Test
    public void PercentCalculatorPositiveTest(){
        double number = 100;
        double percent = 10;
        double expected = 10;
        double result = PercentCalculator.calculatePercent(number, percent);
        assertEquals(result, expected);
    }
    @Test
    public void PercentCalculatorZero(){
        double number = 0;
        double percent = 10;
        double expected = 0;
        double result = PercentCalculator.calculatePercent(number, percent);
        assertEquals(result, expected);
    }
    @Test
    public void PercentCalculatorNegativeTest(){
        double number = -100;
        double percent = 10;
        double expected = -10;
        double result = PercentCalculator.calculatePercent(number, percent);
        assertEquals(result, expected);
    }
    @Test
    public void PercentCalculatorMoreThen100Test(){
        double number = 100;
        double percent = 150;
        double expected = 150;
        double result = PercentCalculator.calculatePercent(number, percent);
        assertEquals(result, expected);
    }
}
