package ua.skillup.tests.part3;

import org.testng.annotations.Test;
import ua.skillup.part3.DepositCalculator;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.testng.Assert.assertEquals;

public class DepositCalculatorTest {

    public static String getOutputFromVoidMethod(double principal, double rate, int years) {
        // Збереження поточного System.out
        PrintStream originalOut = System.out;

        // Створення нового ByteArrayOutputStream для перехоплення виводу
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);

        // Перенаправлення System.out до нашого ByteArrayOutputStream
        System.setOut(ps);

        // Виклик методу, який виводить в System.out
        DepositCalculator.printFutureValue(principal, rate, years);

        // Повернення System.out до оригінального PrintStream
        System.setOut(originalOut);
        String output = baos.toString();

        // Видалення кінцевих символів нового рядка
        output = output.replaceAll("\\r?\\n$", "");


        return output;
    }

    @Test
    public void DepositCalculatorPositive() {
        double principal = 100, rate = 0.1, expected = 110;
        int years = 1;
        assertEquals(getOutputFromVoidMethod(principal, rate, years), "Year 1: 110.0");
    }

    @Test
    public void DepositCalculatorPrincipalNegative() {
        double principal = -100, rate = 0.1;
        int years = 1;
        try {
            DepositCalculator.printFutureValue(principal, rate, years);
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "Principal should be greater than 0");
        }

    }

    @Test
    public void DepositCalculatorRateNegative() {
        double principal = 100, rate = -0.1;
        int years = 1;
        try {
            DepositCalculator.printFutureValue(principal, rate, years);
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "Rate should be greater than 0");
        }
    }

    @Test
    public void DepositCalculatorYearsNegative() {
        double principal = 100, rate = 0.1;
        int years = -1;
        try {
            DepositCalculator.printFutureValue(principal, rate, years);
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "Years should be greater than 0");
        }
    }


}
