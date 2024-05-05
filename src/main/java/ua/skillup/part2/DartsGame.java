package ua.skillup.part2;

public class DartsGame {
    public static int getScore(double x, double y) {
        double distance = Math.sqrt(x * x + y * y);
        if (distance <= 1) {
            return 10;
        } else if (distance <= 5) {
            return 5;
        } else if (distance <= 10) {
            return 1;
        } else {
            return 0;
        }
    }
}
