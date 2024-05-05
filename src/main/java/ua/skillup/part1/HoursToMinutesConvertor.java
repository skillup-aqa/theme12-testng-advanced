package ua.skillup.part1;

public class HoursToMinutesConvertor {
    public static int convertHoursToMinutes(int hours) {
        if (hours < 0) {
            throw new IllegalArgumentException("Hours cannot be negative");
        }

        return hours * 60;
    }

    public static int convertHoursToSeconds(int hours) {
        if (hours < 0) {
            throw new IllegalArgumentException("Hours cannot be negative");
        }

        return hours * 60 * 60;
    }
}
