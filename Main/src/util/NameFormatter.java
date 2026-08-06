package util;

import java.util.Scanner;

public class NameFormatter {
    public static String formatName(Scanner sc) {
        String name = sc.nextLine().trim();

        if (name.trim().isEmpty()) {
            return "";
        }
        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }
}
