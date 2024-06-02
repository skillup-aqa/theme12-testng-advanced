package ua.skillup.tests.part2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ua.skillup.part2.PointsToMarksConvertor;
import static org.testng.Assert.assertThrows;

public class PointsToMarksConvertorTest {
    @DataProvider(name = "points")
    public Object[][] points() {
        return new Object[][]{
                {59, 'F'},
                {60, 'D'},
                {75, 'C'},
                {85, 'B'},
                {90, 'A'},
                {100, 'A'}
        };
    }
    @Test(dataProvider = "points")
    public void MarksCalculatorPositiveTest(int mark, char expected){
        Assert.assertEquals(PointsToMarksConvertor.convertPointsToMarks(mark), expected);
    }
    @Test
    public void MarksCalculatorNegativeTest(){
        int points = -1;
        assertThrows(IllegalArgumentException.class, () -> PointsToMarksConvertor.convertPointsToMarks(points));
    }
    @Test
    public void MarksCalculatorMoreThen100Test(){
        int points = 101;
        assertThrows(IllegalArgumentException.class, () -> PointsToMarksConvertor.convertPointsToMarks(points));
    }
}
