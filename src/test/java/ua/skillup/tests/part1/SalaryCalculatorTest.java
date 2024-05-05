package ua.skillup.tests.part1;

import org.testng.annotations.Test;
import ua.skillup.part1.SalaryCalculator;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class SalaryCalculatorTest {
    @Test
    public void testCalculateSalaryBeforeTaxes() {
        double hours = 40;
        double rate = 290.24;
        double expected = 11609.6;
        double result = SalaryCalculator.calculateSalaryBeforeTaxes(hours, rate);
        assertEquals(result, expected);
    }

    @Test
    public void testCalculateSalaryAfterTaxes() {
        double hours = 40;
        double rate = 290.24;
        double expected = 9467.12;
        double result = SalaryCalculator.calculateSalaryAfterTaxes(hours, rate);
        assertEquals(result, expected);
    }

    @Test
    public void testInvalidHours() {
        double hours = -40;
        double rate = 290.24;
        assertThrows(IllegalArgumentException.class, () -> SalaryCalculator.calculateSalaryBeforeTaxes(hours, rate));
        assertThrows(IllegalArgumentException.class, () -> SalaryCalculator.calculateSalaryAfterTaxes(hours, rate));

    }

    @Test
    public void testInvalidRate() {
        double hours = 40;
        double rate = -290.24;
        assertThrows(IllegalArgumentException.class, () -> SalaryCalculator.calculateSalaryBeforeTaxes(hours, rate));
        assertThrows(IllegalArgumentException.class, () -> SalaryCalculator.calculateSalaryAfterTaxes(hours, rate));
    }
}
