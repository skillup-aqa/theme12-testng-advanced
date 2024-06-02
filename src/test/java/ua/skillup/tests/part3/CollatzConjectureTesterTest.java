package ua.skillup.tests.part3;

import org.testng.annotations.Test;
import ua.skillup.part3.CollatzConjectureTester;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class CollatzConjectureTesterTest {

    @Test
    public void testCollatzConjecturePositive() throws InterruptedException {
        int number = 6;
        int expected = 8;
        //Thread.sleep(1000);
        int actualSteps = CollatzConjectureTester.collatzConjecture(number);
        assertEquals(actualSteps, expected);
    }

    @Test
    public void CollatzConjectureTesterNegative() throws InterruptedException {
        int number = -5;
        //Thread.sleep(1000);
        assertThrows(IllegalArgumentException.class, () -> CollatzConjectureTester.collatzConjecture(number));
    }


}
