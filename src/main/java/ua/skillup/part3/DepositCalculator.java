package ua.skillup.part3;

public class DepositCalculator {
    public static void printFutureValue(double principal, double rate, int years) {
        if (principal <= 0) {
            throw new IllegalArgumentException("Principal should be greater than 0");
        }

        if (rate <= 0) {
            throw new IllegalArgumentException("Rate should be greater than 0");
        }

        if (years <= 0) {
            throw new IllegalArgumentException("Years should be greater than 0");
        }

        for (int i = 1; i <= years; i++) {
            principal += principal * rate;
            System.out.println("Year " + i + ": " + principal);
        }
    }
}
