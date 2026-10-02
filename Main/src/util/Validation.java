package util;

import java.util.Scanner;

public class Validation {

    // (int)
    public static int readInt(String prompt, Scanner input) {
        System.out.print(prompt);
        while (!input.hasNextInt()) {
            System.out.println("\nError: please enter a valid number.");
            System.out.print(prompt);
            input.next(); // Descarta o texto inválido
        }
        return input.nextInt();
    }

    // (double)
    public static double readDouble(String prompt, Scanner input) {
        System.out.print(prompt);
        while (!input.hasNextDouble()) {
            System.out.println("\nError: please enter a valid number.");
            System.out.print(prompt);
            input.next();
        }
        return input.nextDouble();
    }
}