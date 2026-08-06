import features.*;
import features.util.Validation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            boolean running = true;
            while (running) {
                System.out.println("=== MENU ===");
                System.out.println("1 - Even or odd (Feature01)");
                System.out.println("2 - Temperature convertor (Feature02)");
                System.out.println("3 - Currency converter (Feature03)");
                System.out.println("4 - Triangle area calculator (Feature04)");
                System.out.println("5 - Product Register (Feature05)");
                System.out.println("6 - Bank account creator (Feature06)");
                System.out.println("0 - Exit");

                int option = Validation.readInt("\nChose a option: ", sc);

                switch (option) {
                    case 1 -> Feature01.run(sc);
                    case 2 -> Feature02.run(sc);
                    case 3 -> Feature03.run(sc);
                    case 4 -> Feature04.run(sc);
                    case 5 -> Feature05.run(sc);
                    case 6 -> Feature06.run(sc);
                    case 0 -> {
                        System.out.println("\nExiting...");
                        running = false;
                    }
                    default -> System.out.println("\ninvalid number!");
                }
            }
        }
    }
}