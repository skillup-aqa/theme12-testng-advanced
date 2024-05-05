package ua.skillup.tests.part2;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ua.skillup.part2.LeapYearChecker;

public class LeapYearCheckerTest {

    @DataProvider(name = "years")
    public Object[][] years() {
        return new Object[][]{
                {2000, true},
                {2001, false},
                {2004, true},
                {1900, false}
        };
    }

    @Test(dataProvider = "years")
    public void testLeapYearChecker(int year, boolean expected) {
        Assert.assertEquals(LeapYearChecker.isLeapYear(year), expected);
    }
}
