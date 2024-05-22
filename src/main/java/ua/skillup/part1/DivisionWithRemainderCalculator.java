package ua.skillup.part1;

public class DivisionWithRemainderCalculator {
    public static int calculateRemainder(int dividend, int divisor) {
        if(divisor == 0) {
            throw new IllegalArgumentException("Divisor cannot be 0");
        }
        return dividend % divisor;
    }
}
