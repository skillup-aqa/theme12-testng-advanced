package ua.skillup.tests.part2;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ua.skillup.part2.EvenChecker;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class EvenCheckerTest {
    private int even, noteven, zero;

    public void setValue(int a, int b, int c){
        even = a;
        noteven = b;
        zero = c;
    }
    @BeforeClass
    public void startTest() {
        System.out.println("Start Even Checker Test");
        System.out.println("Set up variables");
        setValue(4, 5, 0);
    }

    @Test
    public void isEvenEven() {
        assertTrue(EvenChecker.isEven(even));
    }

    @Test
    public void isEvenNotEven() {
        assertFalse(EvenChecker.isEven(noteven));
    }

    @Test
    public void isEvenZero() {
        assertTrue(EvenChecker.isEven(zero));
    }

}
