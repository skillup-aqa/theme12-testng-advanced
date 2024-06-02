package ua.skillup.tests.part1;

import org.testng.annotations.Test;
import ua.skillup.part1.DivisionWithRemainderCalculator;
import ua.skillup.part1.HoursToMinutesConvertor;

import static org.testng.Assert.assertEquals;

public class HoursToMinutesConvertorTest {

    @Test
    public void convertHoursToMinutesPositive() {
        int hours = 1;
        int expected = 60;
        assertEquals(HoursToMinutesConvertor.convertHoursToMinutes(hours), expected);
    }

    @Test
    public void convertHoursToMinutesNegative() {
        int hours = -1;
        try {
            HoursToMinutesConvertor.convertHoursToMinutes(hours);
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "Hours cannot be negative");
        }
    }

    @Test
    public void convertHoursToSecondsPositive() {
        int hours = 1;
        int expected = 3600;
        assertEquals(HoursToMinutesConvertor.convertHoursToSeconds(hours), expected);
    }

    @Test
    public void convertHoursToSecondsNegative() {
        int hours = -1;
        try {
            HoursToMinutesConvertor.convertHoursToSeconds(hours);
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "Hours cannot be negative");
        }
    }

}
