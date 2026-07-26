package features;
import java.util.Scanner;
// fahrenheit convertor
public class Feature03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digit your fahrenheit temperature: ");

        while (!sc.hasNextDouble()) {
            System.out.println("Error: please enter a valid number.");
            System.out.print("Insert a number: ");
            sc.next();
        }

        double fahrenheit = sc.nextDouble();
        double celsius = (fahrenheit - 32) / 1.8;
        System.out.printf("%.1fºF is equal to %.1fºC%n", fahrenheit, celsius);

        sc.close();
    }
}
