package features;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Feature06 {
    public static void run(Scanner sc) {
        Locale.setDefault(Locale.US);

        System.out.print("Enter account number: ");
        int accNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder: ");
        String name = sc.nextLine();

        System.out.print("Is there an initial deposit (y/n)?");
        String response = sc.next();

        Account bm;

        if (response.equalsIgnoreCase("y")) {
            System.out.println("Enter initial deposit amount: ");
            double initialDeposit = sc.nextDouble();
            bm = new Account(accNumber, name, initialDeposit);
        } else if (response.equalsIgnoreCase("n")) {
            bm = new Account(accNumber, name);
        } else {
            System.out.println("Invalid input");
            return;
        }
        System.out.println("\n" + bm);

        System.out.print("\nEnter a deposit value: ");
        bm.deposit(sc.nextDouble());
        System.out.println(bm);

        System.out.print("\nEnter a withdraw value: ");
        double withdrawValue = sc.nextDouble();

        if (bm.withdraw(withdrawValue)) {
            System.out.println("Withdrawal successful!");
            System.out.println(bm);
        } else System.out.println("Withdrawal failed: Insufficient funds or invalid amount.");
    }
}