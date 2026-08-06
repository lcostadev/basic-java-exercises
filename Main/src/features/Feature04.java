package features;

import features.entities.Triangle;

import java.util.Scanner;

public class Feature04 {
    public static void run(Scanner sc) {
        System.out.println("Triangle area calculator");

        System.out.println("Enter 3 measures from triangle A:");
        Triangle a = new Triangle(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

        System.out.println("Enter 3 measures from triangle B:");
        Triangle b = new Triangle(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

        double areaA = a.area();
        double areaB = b.area();

        System.out.printf("Triangle A area: %.4f\n", areaA);
        System.out.printf("Triangle B area: %.4f\n", areaB);

        if (areaA > areaB) {
            System.out.println("Triangle A has a larger area.");
        } else if (areaB > areaA) {
            System.out.println("Triangle B has a larger area.");
        } else {
            System.out.println("Both areas are equal.");
        }
    }
}