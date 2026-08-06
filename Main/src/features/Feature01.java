package features;

import util.Validation;

import java.util.Scanner;

// Even or odd
public class Feature01 {
    public static void run(Scanner sc) {
        int number = Validation.readInt("\nInsert a number: ", sc);
        if (number % 2 == 0) {
            System.out.printf("\nThe number %d is even\n\n", number);
        } else {
            System.out.printf("\nThe number %d is odd\n\n", number);
        }
    }
}