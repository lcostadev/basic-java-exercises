package features;
import java.util.Scanner;
// celsius converter
public class Feature02 {
    public static void run(Scanner sc) { // Lembre-se: use 'run' e receba o Scanner do Main
        System.out.printf("What do you want calculate?%n1. Celsius to Fahrenheit%n2. Fahrenheit to Celsius");

        // Chama a validação passando o Scanner e a mensagem
        double option = Validation.readDouble(sc, "Option: ");

        if (option == 1) {
            double celsius = Validation.readDouble(sc, "Digit your celsius temperature: ");
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.printf("%.1f°C is equal to %.1f°F%n", celsius, fahrenheit);

        } else if (option == 2) {
            double fahrenheit = Validation.readDouble(sc, "Digit your fahrenheit temperature: ");
            double celsius = (fahrenheit - 32) / 1.8;
            System.out.printf("%.1f°F is equal to %.1f°C%n", fahrenheit, celsius);

        } else {
            System.out.println("Invalid option!");
        }
    }
}