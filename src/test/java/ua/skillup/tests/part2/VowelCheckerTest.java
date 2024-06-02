package ua.skillup.tests.part2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ua.skillup.part2.VowelChecker;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class VowelCheckerTest {
    @DataProvider(name = "vowels")
    public Object[] vowels() {
        return new Object[]{'a', 'e', 'o', 'u', 'i'};
        }
    @DataProvider(name = "notvowels")
    public Object[] notVowels() {
        return new Object[]{'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l',
                'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x',
                'y', 'z'};
    }

    @Test(dataProvider = "vowels")
    public void isVowelPositive(char letter) {
        assertTrue(VowelChecker.isVowel(letter));
    }

    @Test(dataProvider = "notvowels")
    public void isVowelNegative(char letter) {
        assertFalse(VowelChecker.isVowel(letter));
    }
}

