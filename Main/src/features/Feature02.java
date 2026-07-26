package features;
import java.util.Scanner;
// celsius convertor
public class Feature02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digit your celsius temperature: ");

        while (!sc.hasNextDouble()) {
            System.out.println("Error: please enter a valid number.");
            System.out.print("Insert a number: ");
            sc.next();
        }

        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9) / 5 + 32;
        System.out.printf("%.1fºC is equal to %.1fºF%n", celsius, fahrenheit);

        sc.close();
    }
}