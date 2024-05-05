package ua.skillup.part3;

public class CollatzConjectureTester {
    public static int collatzConjecture(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Input number should be greater than 0");
        }

        int steps = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            steps++;
        }
        return steps;
    }
}
