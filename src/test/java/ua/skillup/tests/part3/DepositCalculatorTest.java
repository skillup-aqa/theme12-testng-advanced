package ua.skillup.tests.part3;

import org.testng.annotations.Test;
import ua.skillup.part3.DepositCalculator;

import static org.testng.Assert.assertThrows;

public class DepositCalculatorTest {
    @Test
    public void testNonPositivePrincipal() {
        assertThrows(IllegalArgumentException.class, () -> DepositCalculator.printFutureValue(-1, 0.1, 1));
    }

    @Test
    public void testNonPositiveRate() {
        assertThrows(IllegalArgumentException.class, () -> DepositCalculator.printFutureValue(1, -0.1, 1));
    }

    @Test
    public void testNonPositiveYears() {
        assertThrows(IllegalArgumentException.class, () -> DepositCalculator.printFutureValue(1, 0.1, -1));
    }
}
