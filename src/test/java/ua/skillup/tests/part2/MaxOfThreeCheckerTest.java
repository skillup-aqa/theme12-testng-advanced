package ua.skillup.tests.part2;

import org.testng.annotations.Test;
import ua.skillup.part2.MaxOfThreeChecker;

import static org.testng.Assert.assertEquals;

public class MaxOfThreeCheckerTest {

    @Test
    public void maxNumber1Test(){
        int a = 5, b = 4, c = 3;
        assertEquals(MaxOfThreeChecker.maxOfThree(a, b, c), 5);
    }

    @Test
    public void maxNumber2Test(){
        int a = 4, b = 5, c = 3;
        assertEquals(MaxOfThreeChecker.maxOfThree(a, b, c), 5);
    }

    @Test
    public void maxNumber3Test(){
        int a = 4, b = 3, c = 5;
        assertEquals(MaxOfThreeChecker.maxOfThree(a, b, c), 5);
    }

}


