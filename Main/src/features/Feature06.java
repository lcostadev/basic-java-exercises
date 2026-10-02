package features;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Feature06 {
    public static void run(Scanner input) {
        Locale.setDefault(Locale.US);

        System.out.print("Enter account number: ");
        int accNumber = input.nextInt();
        input.nextLine();

        System.out.print("Enter account holder: ");
        String name = input.nextLine();

        System.out.print("Is there an initial deposit (y/n)? ");
        String response = input.next();

        Account bm;

        if (response.equalsIgnoreCase("y")) {
            System.out.print("Enter initial deposit amount: $ ");
            double initialDeposit = input.nextDouble();
            bm = new Account(accNumber, name, initialDeposit);
        } else if (response.equalsIgnoreCase("n")) {
            bm = new Account(accNumber, name);
        } else {
            System.out.println("Invalid input");
            return;
        }
        System.out.println("\n" + bm);

        System.out.print("\nEnter a deposit value: ");
        bm.deposit(input.nextDouble());
        System.out.println(bm);

        boolean success = false;

        do {
            System.out.print("\nEnter a withdraw value($5 tax): ");
            double withdrawValue = input.nextDouble();

            if (bm.withdraw(withdrawValue)) {
                System.out.println("Withdrawal successful!");
                System.out.println(bm);
                success = true;
            } else {
                System.out.println("Withdrawal failed: Insufficient funds or invalid amount.");
            }
        } while (!success);
    }
}