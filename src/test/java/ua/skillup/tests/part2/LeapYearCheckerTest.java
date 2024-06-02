package ua.skillup.tests.part2;

import org.testng.annotations.Test;
import ua.skillup.part2.LeapYearChecker;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class LeapYearCheckerTest {

    @Test
    public void LeapYearCheckerLeap() {
        int year = 2024;
        assertTrue(LeapYearChecker.isLeapYear(year));
    }

    @Test
    public void LeapYearCheckerNotLeap() {
        int year = 2023;
        assertFalse(LeapYearChecker.isLeapYear(year));
    }

    @Test
    public void LeapYearCheckerLeapEndHundred() {
        int year = 800;
        assertTrue(LeapYearChecker.isLeapYear(year));
    }

    @Test
    public void LeapYearCheckerNotLeapEndHundred() {
        int year = 900;
        assertFalse(LeapYearChecker.isLeapYear(year));
    }
}