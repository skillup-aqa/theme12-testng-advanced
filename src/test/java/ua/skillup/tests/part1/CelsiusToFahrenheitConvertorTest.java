package ua.skillup.tests.part1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import ua.skillup.part1.CelsiusToFahrenheitConvertor;

import static org.testng.Assert.assertEquals;

public class CelsiusToFahrenheitConvertorTest {
    @Test
    public void testConvertCelsiusToFahrenheitPositive() {
        double celsius = 100;
        double expected = 212;
        double result = CelsiusToFahrenheitConvertor.convertCelsiusToFahrenheit(celsius);
        assertEquals(result, expected);
    }

    @Test
    public void testConvertCelsiusToFahrenheitZero() {
        double celsius = 0;
        double expected = 32;
        double result = CelsiusToFahrenheitConvertor.convertCelsiusToFahrenheit(celsius);
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(result, expected);
        System.out.println("completed");
        sa.assertAll(); //Very IMPORTANT
    }

}
