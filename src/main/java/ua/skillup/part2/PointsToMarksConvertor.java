package ua.skillup.part2;

public class PointsToMarksConvertor {
    public static char convertPointsToMarks(int points) {
        if (points < 0 || points > 100) {
            throw new IllegalArgumentException("Points should be in range 0-100");
        }

        if (points < 60) {
            return 'F';
        } else if (points < 75) {
            return 'D';
        } else if (points < 85) {
            return 'C';
        } else if (points < 90) {
            return 'B';
        } else {
            return 'A';
        }
    }
}
