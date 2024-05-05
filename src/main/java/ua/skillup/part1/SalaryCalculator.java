package ua.skillup.part1;

public class SalaryCalculator {
    public static double calculateSalaryBeforeTaxes(double hoursPerMonth, double hourlyRate) {
        if (hoursPerMonth < 0 || hourlyRate < 0) {
            throw new IllegalArgumentException("Hours per month and hourly rate cannot be negative");
        }

        return hoursPerMonth * hourlyRate;
    }

    public static double calculateSalaryAfterTaxes(double hoursPerMonth, double hourlyRate) {
        if (hoursPerMonth < 0 || hourlyRate < 0) {
            throw new IllegalArgumentException("Hours per month and hourly rate cannot be negative");
        }

        double salaryAfterTaxes = calculateSalaryBeforeTaxes(hoursPerMonth, hourlyRate) * 0.95 - 1562;
        return Math.round(salaryAfterTaxes * 100) / 100.0;
    }
}
