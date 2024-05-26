package ua.skillup.tests.part2;

import org.testng.annotations.Test;
import ua.skillup.part2.TemperatureConvertor;

import static org.testng.Assert.assertEquals;

public class TemperatureConvertorTest {

    @Test
    public void convertCelsiusToFahrenheitTest() {
        double celsius = 100, expected = 212;
        assertEquals(TemperatureConvertor.convertCelsiusToFahrenheit(celsius), expected);
    }

    @Test
    public void convertFahrenheitToCelsius() {
        double fahrenheit = 32, expected = 0;
        assertEquals(TemperatureConvertor.convertFahrenheitToCelsius(fahrenheit), expected);
    }
}
