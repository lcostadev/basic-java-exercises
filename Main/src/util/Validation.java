package util;

import java.util.Scanner;

public class Validation {

    // (int)
    public static int readInt(String prompt, Scanner sc) {
        System.out.print(prompt);
        while (!sc.hasNextInt()) {
            System.out.println("\nOpção inválida! Digite um número inteiro.");
            System.out.print(prompt);
            sc.next(); // Descarta o texto inválido
        }
        return sc.nextInt();
    }

    // (double)
    public static double readDouble(String prompt, Scanner sc) {
        System.out.print(prompt);
        while (!sc.hasNextDouble()) {
            System.out.println("\nError: please enter a valid number.");
            System.out.print(prompt);
            sc.next();
        }
        return sc.nextDouble();
    }
}