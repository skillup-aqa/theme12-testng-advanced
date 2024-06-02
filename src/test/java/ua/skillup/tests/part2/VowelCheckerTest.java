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

    ;

    @DataProvider(name = "notvowels")
    public Object[] notVowels() {
        return new Object[]{'q', 'w', 'r', 't', 'y', 'p', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l',
                'z', 'x', 'c', 'v', 'b', 'n', 'm'};
    }

    ;

    @Test(dataProvider = "vowels")
    public void isVowelPositive(char letter) {
        assertTrue(VowelChecker.isVowel(letter));
    }

    @Test(dataProvider = "notvowels")
    public void isVowelNegative(char letter) {
        assertFalse(VowelChecker.isVowel(letter));
    }


}




