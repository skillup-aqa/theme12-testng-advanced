package ua.skillup.tests.part2;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ua.skillup.part2.AgeOnPlanetCalculator;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class AgeOnPlanetCalculatorTest {
    @DataProvider (name = "ageForPlanets")
    public Object[][] ageForPlanets(){
        return new Object[][]{
                {1, "Mercury", 4.152018690727338},
                {1, "Venus", 1.6254948859817744},
                {1, "Mars", 0.5316841766216553},
                {1, "Jupiter", 0.0842984451573283},
                {1, "Saturn", 0.03395874243713337},
                {1, "Uranus", 0.011902374911812329},
                {1, "Neptune", 0.006068280780808115},
        };
    }
    @Test (dataProvider = "ageForPlanets")
    public void AgeOnPlanetCalculatorPositiveTest(int age, String planet, double expected){
        double result = AgeOnPlanetCalculator.calculateAgeOnPlanet(age, planet);
        assertEquals(result, expected);
        }
    @Test
    public void ErrorAgeTest(){
        int age = -1;
        String planet = "Mercury";
        assertThrows(IllegalArgumentException.class, () -> AgeOnPlanetCalculator.calculateAgeOnPlanet(age, planet));
    }
    @Test
    public void ErrorPlanetTest(){
        int age = 1;
        String planet = "R2D2";
        assertThrows(IllegalArgumentException.class, () -> AgeOnPlanetCalculator.calculateAgeOnPlanet(age, planet));
    }

    }

