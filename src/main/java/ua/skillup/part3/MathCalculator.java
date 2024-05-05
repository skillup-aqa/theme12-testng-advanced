package ua.skillup.part3;

public class MathCalculator {
    private static void checkIsPositive(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Input number should be positive");
        }
    }

    public static int sumPositiveNumbersToN(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input number should not be negative");
        }

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int factorial(int n) {
        checkIsPositive(n);

        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static boolean isPrime(int n) {
        checkIsPositive(n);

        // Consider 0 and 1 as non-prime
        if (n == 0 || n == 1) {
            return false;
        }

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isArmstrongNumber(int n) {
        checkIsPositive(n);

        int sum = 0;
        int original = n;
        int digits = 0;
        while (n > 0) {
            digits++;
            n /= 10;
        }
        n = original;
        while (n > 0) {
            int digit = n % 10;
            sum += (int) Math.pow(digit, digits);
            n /= 10;
        }
        return sum == original;
    }

    public static void printFibonacciNumbers(int n) {
        if(n < 2) {
            throw new IllegalArgumentException("Input number should be greater than 1");
        }

        int first = 0;
        int second = 1;
        System.out.println(first);
        System.out.println(second);
        for (int i = 2; i < n; i++) {
            int next = first + second;
            System.out.println(next);
            first = second;
            second = next;
        }
    }

    public static void printDigitsReversed(int n) {
        checkIsPositive(n);

        // Use System.out.print() to print the digits without new line
        while (n > 0) {
            int digit = n % 10;
            System.out.print(digit);
            n /= 10;
        }
    }
}
