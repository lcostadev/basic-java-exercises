import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Insert a number: ");
            int number = sc.nextInt();

            if (number % 2 == 0) {
                System.out.printf("The number %d is even%n", number);
            } else {
                System.out.printf("The number %d is odd%n", number);
            }


        }
    }
}

