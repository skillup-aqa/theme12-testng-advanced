package ua.skillup.tests.part2;
import org.testng.annotations.Test;
import ua.skillup.part2.EvenChecker;

import static org.testng.Assert.*;

public class EvenCheckerTest {
    @Test
    public void EvenPositiveTest(){
        assertTrue(EvenChecker.isEven(2));
    }
    @Test
    public void EvenNegativeTest(){
        assertFalse(EvenChecker.isEven(1));
    }
}
