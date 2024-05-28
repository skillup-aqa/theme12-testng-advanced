package ua.skillup.tests.part3;

import org.testng.annotations.Test;
import ua.skillup.part3.CollatzConjectureTester;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class CollatzConjectureTesterTest {

    @Test
    public void testCollatzConjecturePositive() {
        int number = 6;
        int expected = 8;
        int actualSteps = CollatzConjectureTester.collatzConjecture(number);
        assertEquals(actualSteps, expected);
    }

    @Test
    public void CollatzConjectureTesterNegative() {
        int number = -5;
        assertThrows(IllegalArgumentException.class, () -> CollatzConjectureTester.collatzConjecture(number));
    }


}
