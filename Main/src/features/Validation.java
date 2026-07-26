package features;

import java.util.Scanner;

public class Validation {
    public static double readDouble(Scanner sc, String prompt) {
        System.out.print(prompt);
        while (!sc.hasNextDouble()) {
            System.out.println("Error: please enter a valid number.");
            System.out.print(prompt);
            sc.next(); // Limpa a entrada inválida do buffer
        }
        return sc.nextDouble(); // Retorna o valor correto
    }
}
