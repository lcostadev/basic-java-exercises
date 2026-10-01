import features.*;
import util.Validation;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner input = new Scanner(System.in)) {
            boolean running = true;
            while (running) {
                System.out.println("\n\n=== MENU ===");
                System.out.println("1 - Even or odd (Feature01)");
                System.out.println("2 - Temperature convertor (Feature02)");
                System.out.println("3 - Currency converter (Feature03)");
                System.out.println("4 - Triangle area calculator (Feature04)");
                System.out.println("5 - Product Register (Feature05)");
                System.out.println("6 - Bank account creator (Feature06)");
                System.out.println("7 - Height average calculator (Feature07)");
                System.out.println("8 - Inventory (Feature08)");
                System.out.println("0 - Exit");

                int option = Validation.readInt("\nChose a option: ", input);

                switch (option) {
                    case 1 -> Feature01.run(input);
                    case 2 -> Feature02.run(input);
                    case 3 -> Feature03.run(input);
                    case 4 -> Feature04.run(input);
                    case 5 -> Feature05.run(input);
                    case 6 -> Feature06.run(input);
                    case 7 -> Feature07.run(input);
                    case 8 -> Feature08.run(input);
                    case 0 ->  {
                        System.out.println("\nExiting...");
                        running = false;
                    }
                    default -> System.out.println("\ninvalid number!");
                }
            }
        }
    }
}