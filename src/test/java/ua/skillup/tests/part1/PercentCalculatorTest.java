package ua.skillup.tests.part1;

import org.testng.annotations.Test;
import ua.skillup.part1.HoursToMinutesConvertor;
import ua.skillup.part1.PercentCalculator;

import static org.testng.Assert.assertEquals;

public class PercentCalculatorTest {
    @Test
    public void calculatePercentPositive() {
       double number = 200;
       double percent = 10;
       double expected = 20;
        assertEquals(PercentCalculator.calculatePercent(number, percent), expected);
    }

    @Test
    public void testCalculatePercentOfZero() {
        double number = 0;
        double percent = 50;
        double expected = 0;
        double result = PercentCalculator.calculatePercent(number, percent);
        assertEquals(result, expected);
    }

    @Test
    public void testCalculatePercentNegative() {
        double number = -100;
        double percent = 10;
        double expected = -10;
        double result = PercentCalculator.calculatePercent(number, percent);
        assertEquals(result, expected);
    }

    @Test
    public void testCalculatePercentPercentZero() {
        double number = 100;
        double percent = 0;
        double expected = 0;
        double result = PercentCalculator.calculatePercent(number, percent);
        assertEquals(result, expected);
    }

    @Test
    public void testCalculatePercentGreaterThen100() {
        double number = 100;
        double percent = 120;
        double expected = 120;
        double result = PercentCalculator.calculatePercent(number, percent);
        assertEquals(result, expected);
    }
}
