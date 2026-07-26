package features;
import java.util.Scanner;
// Even or odd
public class Feature01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert a number: ");

        while (!sc.hasNextInt()) {
            System.out.println("Error: please enter a valid integer.");
            System.out.print("Insert a number: ");
            sc.next();
        }

        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.printf("The number %d is even%n", number);
        } else {
            System.out.printf("The number %d is odd%n", number);
        }

        sc.close();
    }
}