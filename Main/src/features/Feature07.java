package features;

import java.util.Scanner;

public class Feature07 {
    public static void run(Scanner sc) {

        System.out.println("-------Height Calculator-------");
        System.out.println("Enter the number of heights");
        int n = sc.nextInt();
        while (n <= 0) {
            System.out.print("Invalid input\nTry again: ");
            n = sc.nextInt();
        }

        double sum = 0;
        double[] heights = new double[n];
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextDouble();
            sum += heights[i];
        }

        System.out.printf(" Height Average is: %.2f", sum / n);
    }
}