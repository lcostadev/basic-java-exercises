import features.Feature02;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Chama diretamente o método run da Feature02
            Feature02.run(sc);
        }
    }
}