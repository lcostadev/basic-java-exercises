package features;

import entities.Product;

import java.util.Scanner;

public class Feature05 {
    public static void run(Scanner input) {
        System.out.println("Product Register");

        System.out.print("Name: ");
        input.nextLine();
        String name = input.nextLine().toUpperCase();

        System.out.print("Price: $ ");
        double price = input.nextDouble();

        System.out.print("Quantity in stock: ");
        int quantity = input.nextInt();

        Product productA = new Product(name, price, quantity);

        System.out.println("Product data: " + productA);

        //+
        System.out.print("Enter the number of products to be added in stock: ");
        int addProduct = input.nextInt();
        productA.addProduct(addProduct);
        System.out.println("Updated data: " + productA);

        //-
        System.out.print("Enter the number of products to be removed from stock: ");
        int removeProduct = input.nextInt();
        productA.removeProduct(removeProduct);
        System.out.println("Updated data: " + productA);

    }
}
