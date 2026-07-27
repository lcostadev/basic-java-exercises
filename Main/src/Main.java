import features.Feature02;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("=== MENU ===");
            System.out.println("1 - Conversor de Temperatura (Feature02)");
            System.out.print("Escolha uma opção: ");

            if (!sc.hasNextInt()) {
                System.out.println("Opção inválida!");
                return;
            }

            int option = sc.nextInt();

            switch (option) {
                case 1 -> Feature02.run(sc);
                default -> System.out.println("Opção inexistente!");
            }
        }
    }
}