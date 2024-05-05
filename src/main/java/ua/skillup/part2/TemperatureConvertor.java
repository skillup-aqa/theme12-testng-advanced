package ua.skillup.part2;

import java.util.Scanner;

public class TemperatureConvertor {
    public static double convertCelsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void requestInputAndCalculate() {
        // Put here the request for temperature and scale
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the temperature: ");
        double temperature = in.nextDouble();

        System.out.println("Enter the scale (C or F): ");
        String scale = in.next();

        if (scale == "C") {
            System.out.println("Temperature in F: " + convertCelsiusToFahrenheit(temperature));
        } else if (scale == "F") {
            System.out.println("Temperature in C: " + convertFahrenheitToCelsius(temperature));
        } else {
            System.out.println("Invalid scale, exiting...");
        }
    }
}
