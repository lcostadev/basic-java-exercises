import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("How old are you?");
            int age = sc.nextInt();

            if (age < 18){
                System.out.println("Warning! this program is rated +18");
            } else {
                System.out.println("Welcome! what kind of weapons do you want to buy?");
                System.out.printf("1.Guns%n2.Knives%n3.Grenades%nDigit: ");
                int shop = sc.nextInt();

                if (shop == 1){
                    System.out.printf("1.AK47- $450%n2.M4A1- $550%n3.AWP- $1000%n");
                } else if (shop == 2) {
                    System.out.printf("1.Karambit- $200%n2.Butterfly- $400%n");
                } else if (shop == 3) {
                    System.out.println("1.Hand explosive- $10");
                } else {
                    System.out.println("Invalid!");
                }
            }
        }
    }
}