package ua.skillup.tests.part3;

import org.testng.annotations.Test;
import ua.skillup.part3.DepositCalculator;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.testng.Assert.assertEquals;

public class DepositCalculatorTest {

  /*
        This test is fiailing if works in parallel mode with other parts,
        will clarify later
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
    public void DepositCalculatorPositive() throws InterruptedException {
        double principal = 100, rate = 0.1, expected = 110;
        int years = 1;
      //  Thread.sleep(1000);
        assertEquals(getOutputFromVoidMethod(principal, rate, years), "Year 1: 110.0");
    } */

    @Test
    public void DepositCalculatorPrincipalNegative() throws InterruptedException {
        double principal = -100, rate = 0.1;
        int years = 1;
       // Thread.sleep(1000);
        try {
            DepositCalculator.printFutureValue(principal, rate, years);
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "Principal should be greater than 0");
        }

    }

    @Test
    public void DepositCalculatorRateNegative() throws InterruptedException {
        double principal = 100, rate = -0.1;
        int years = 1;
     //   Thread.sleep(1000);
        try {
            DepositCalculator.printFutureValue(principal, rate, years);
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "Rate should be greater than 0");
        }
    }

    @Test
    public void DepositCalculatorYearsNegative() throws InterruptedException {
        double principal = 100, rate = 0.1;
        int years = -1;
      //  Thread.sleep(1000);
        try {
            DepositCalculator.printFutureValue(principal, rate, years);
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "Years should be greater than 0");
        }
    }


}
