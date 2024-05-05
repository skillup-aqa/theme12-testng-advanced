package ua.skillup.part2;

public class MaxOfThreeChecker {
    public static int maxOfThree(int number1, int number2, int number3) {
        if (number1 > number2 && number1 > number3) {
            return number1;
        } else if (number2 > number1 && number2 > number3) {
            return number2;
        } else {
            return number3;
        }
    }
}
