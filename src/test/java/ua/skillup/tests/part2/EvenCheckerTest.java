package ua.skillup.tests.part2;

import org.testng.annotations.Test;
import ua.skillup.part2.EvenChecker;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class EvenCheckerTest {

    @Test
    public void testEven() {
        assertTrue(EvenChecker.isEven(2));
    }

    @Test
    public void testOdd() {
        assertFalse(EvenChecker.isEven(1));
    }
}
