package ua.skillup.tests.part2;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ua.skillup.part2.MaxOfThreeChecker;

public class MaxOfThreeCheckerTest {

    @DataProvider(name = "numbers")
    public Object[][] numbers() {
        return new Object[][]{
                {1, 2, 3, 3},
                {1, 3, 2, 3},
                {3, 2, 1, 3},
                {3, 3, 3, 3}
        };
    }

    @Test(dataProvider = "numbers")
    public void testMaxOfThree(int number1, int number2, int number3, int expected) {
        Assert.assertEquals(MaxOfThreeChecker.maxOfThree(number1, number2, number3), expected);
    }
}
