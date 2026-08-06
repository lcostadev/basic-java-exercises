package features.util;

import java.util.Scanner;

public class Name {
    public static String nextName(Scanner sc) {
        String name = sc.nextLine().trim();

        if (name.trim().isEmpty()) {
            return "";
        }
        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }
}
