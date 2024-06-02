package ua.skillup.tests.part2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ua.skillup.part1.DivisionWithRemainderCalculator;
import ua.skillup.part2.AgeOnPlanetCalculator;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class AgeOnPlanetCalculatorTest {

    @DataProvider(name = "ageForPlanets", parallel = true)
    public Object[][] ageForPlanets() {
        return new Object[][]{
                {1, "Mercury", 4.15201869072733817818554292004},
                {1, "Venus", 1.6254948859817743661602133923678},
                {1, "Mars", 0.53168417662165534764223056824597},
                {1, "Jupiter", 0.0842984451573283},
                {1, "Saturn", 0.03395874243713336868212029422669},
                {1, "Uranus", 0.01190237491181232868465450369322},
                {1, "Neptune", 0.006068280780808115}
        };
    }

    @Test(dataProvider = "ageForPlanets")
    public void testCalculateAgeOnPlanetPositive(int age, String planet, double expected) throws InterruptedException {
        double result = AgeOnPlanetCalculator.calculateAgeOnPlanet(age, planet);
        //Thread.sleep(1000);
        assertEquals(result, expected);
    }

    @Test
    public void testCalculateAgeOnPlanetOtherPlanetInvalidAge() {
        int age = -1;
        String planet = "Uranus";
        assertThrows(IllegalArgumentException.class, () -> AgeOnPlanetCalculator.calculateAgeOnPlanet(age, planet));

        try {
            AgeOnPlanetCalculator.calculateAgeOnPlanet(age, planet);
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "Age cannot be negative");
        }
    }

    @Test
    public void testCalculateAgeOnPlanetOtherPlanetInvalidPlanet() {
        int age = 1;
        String planet = "Bibibi";
        assertThrows(IllegalArgumentException.class, () -> AgeOnPlanetCalculator.calculateAgeOnPlanet(age, planet));

        try {
            AgeOnPlanetCalculator.calculateAgeOnPlanet(age, planet);
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "Unknown planet: " + planet);
        }
    }
}


