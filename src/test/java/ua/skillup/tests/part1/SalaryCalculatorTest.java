package ua.skillup.tests.part1;

import org.testng.annotations.Test;
import ua.skillup.part1.DivisionWithRemainderCalculator;
import ua.skillup.part1.SalaryCalculator;

import static org.testng.Assert.assertEquals;

public class SalaryCalculatorTest {
    @Test
    public void calculateSalaryBeforeTaxesTestPositive() {
        double hoursPerMonth = 160;
        double hourlyRate = 100;
        double expected = 16000;
        assertEquals(SalaryCalculator.calculateSalaryBeforeTaxes(hoursPerMonth, hourlyRate), expected);
    }

    @Test
    public void calculateSalaryBeforeTaxesTestException() {
        double hoursPerMonth = -160;
        double hourlyRate = 100;
        try {
            SalaryCalculator.calculateSalaryBeforeTaxes(hoursPerMonth, hourlyRate);
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "Hours per month and hourly rate cannot be negative");
        }
    }

    @Test
    public void calculateSalaryAfterTaxesTestPositive() {
        double hoursPerMonth = 160;
        double hourlyRate = 100;
        double expected = 13638;
        assertEquals(SalaryCalculator.calculateSalaryAfterTaxes(hoursPerMonth, hourlyRate), expected);
    }

    @Test
    public void calculateSalaryAfterTaxesTestException() {
        double hoursPerMonth = -160;
        double hourlyRate = 100;
        try {
            SalaryCalculator.calculateSalaryAfterTaxes(hoursPerMonth, hourlyRate);
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "Hours per month and hourly rate cannot be negative");
        }
    }




}
