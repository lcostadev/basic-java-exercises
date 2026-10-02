package features;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Feature08 {

    public static void run(Scanner input) {
        List<String> items = new ArrayList<>();

        boolean running = true;
        while (running) {
            System.out.println("---- Inventory Menu ----");
            System.out.println("1: Add Item");
            System.out.println("2: Remove Item");
            System.out.println("3: List items");
            System.out.println("4: Search items");
            System.out.println("5: Show items total");
            System.out.println("6: Sort items alphabetically");
            System.out.println("7: Search items by letter");
            System.out.println("0: Exit");
            System.out.println("--------------------");

            System.out.print("Choose an option: ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.println("Insert item's name: ");
                    String addName = input.nextLine().trim().toUpperCase(Locale.US);

                    if (addName.isEmpty()) {
                        System.out.println("Invalid name!\n");
                    } else if (items.contains(addName)) {
                        System.out.println("Item already exists\n");
                    } else if (items.size() >= 10) {
                        System.out.println("Full inventory!\n");
                    } else {
                        items.add(addName);
                    }
                }
                case 2 -> {
                    System.out.println("Insert item's name: ");
                    String removeName = input.nextLine().trim().toUpperCase(Locale.US);

                    if (!items.remove(removeName)) {
                        System.out.println("Item not found\n");
                    }
                }
                case 3 -> {
                    if (items.isEmpty()) {
                        System.out.println("Empty inventory\n");
                    } else {
                        System.out.println("Items list:");
                        for (int i = 0; i < items.size(); i++) {
                            System.out.println((i + 1) + "-" + items.get(i));
                        }
                    }
                }
                case 4 -> {
                    System.out.println("Insert item's name: ");
                    String searchName = input.nextLine().trim().toUpperCase(Locale.US);

                    if (items.contains(searchName)) {
                        int pos = items.indexOf(searchName) + 1;
                        System.out.println("This item position is: " + pos);
                    } else {
                        System.out.println("Item not found\n");
                    }
                }
                case 5 -> System.out.println("Total of items: " + items.size());
                case 6 -> {
                    items.sort(null);
                    System.out.println("Organized\n");
                }
                case 7 -> {
                    System.out.println("Insert the letter: ");
                    String letter = input.nextLine().trim().toUpperCase(Locale.US);

                    if (letter.isEmpty()) {
                        System.out.println("Invalid!\n");
                        continue;
                    }

                    boolean found = false;
                    for (String item : items) {
                        if (item.startsWith(letter)) {
                            System.out.println(item);
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("No item found!\n");
                    }
                }
                case 0 -> running = false;
                default -> System.out.println("Invalid\n");
            }
        }
    }
}