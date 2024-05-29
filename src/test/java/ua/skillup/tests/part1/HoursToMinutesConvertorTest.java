package ua.skillup.tests.part1;

import org.testng.annotations.Test;
import ua.skillup.part1.HoursToMinutesConvertor;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class HoursToMinutesConvertorTest {
    @Test
    public void HoursToMinutesConvertorPositiveTest(){
     int hours = 1;
     int expected = 60;
     int result = HoursToMinutesConvertor.convertHoursToMinutes(hours);
     assertEquals(result, expected);
    }
    @Test
    public void HoursToSecondsConvertorPositiveTest(){
        int hours = 1;
        int expected = 3600;
        int result = HoursToMinutesConvertor.convertHoursToSeconds(hours);
        assertEquals(result, expected);
    }
    @Test
    public void ErrorMinutesTest(){
        int minutes = -1;
        assertThrows(IllegalArgumentException.class, () -> HoursToMinutesConvertor.convertHoursToMinutes(minutes));
    }
    @Test
    public void ErrorSeconds(){
        int seconds = -1;
        assertThrows(IllegalArgumentException.class, () -> HoursToMinutesConvertor.convertHoursToSeconds(seconds));
    }
}
