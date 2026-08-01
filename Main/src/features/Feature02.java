package features;

import java.util.Scanner;

// Celsius converter
public class Feature02 {
    public static void run(Scanner sc) {
        System.out.print("\nWhat do you want calculate?\n1. Celsius to Fahrenheit\n2. Fahrenheit to Celsius\n");
        double option = Validation.readDouble("\nChose: ", sc);
        if (option == 1) {
            double celsius = Validation.readDouble("\nDigit your celsius temperature: ", sc);
            double fahrenheit = celsius * 1.8 + 32;
            System.out.printf("\n%.1f°C is equal to %.1f°F\n\n", celsius, fahrenheit);
        } else if (option == 2) {
            double fahrenheit = Validation.readDouble("\nDigit your fahrenheit temperature: ", sc);
            double celsius = (fahrenheit - 32) / 1.8;
            System.out.printf("\n%.1f°F is equal to %.1f°C\n\n", fahrenheit, celsius);
        } else System.out.println("\nInvalid option!");
    }
}