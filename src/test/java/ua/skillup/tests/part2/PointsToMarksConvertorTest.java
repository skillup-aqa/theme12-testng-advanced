package ua.skillup.tests.part2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ua.skillup.part2.PointsToMarksConvertor;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class PointsToMarksConvertorTest {

    @DataProvider(name = "pointsAndMarks")
    public Object[][] pointsAndMarks() {
        return new Object[][]{
                {50, 'F'},
                {73, 'D'},
                {83, 'C'},
                {87, 'B'},
                {90, 'A'},
                {100, 'A'}
        };
    }

    @Test(dataProvider = "pointsAndMarks")
    public void pointsToMarkConvertorPositive(int mark, char expected) {
        assertEquals(PointsToMarksConvertor.convertPointsToMarks(mark), expected);
    }

    @Test
    public void pointsToMarkConvertorNegative() {
        int points = -2;
        assertThrows(IllegalArgumentException.class, () -> PointsToMarksConvertor.convertPointsToMarks(points));
    }

    @Test
    public void pointsToMarkConvertorMoreThanHundred() {
        int points = 105;
        assertThrows(IllegalArgumentException.class, () -> PointsToMarksConvertor.convertPointsToMarks(points));
    }


}
