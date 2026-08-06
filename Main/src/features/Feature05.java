package features;

import entities.Product;

import java.util.Scanner;

public class Feature05 {
    public static void run(Scanner sc) {
        System.out.println("Product Register");

        System.out.print("Name: ");
        sc.nextLine();
        String name = sc.nextLine().toUpperCase();

        System.out.print("Price: $ ");
        double price = sc.nextDouble();

        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();

        Product productA = new Product(name, price, quantity);

        System.out.println("Product data: " + productA);

        //+
        System.out.print("Enter the number of products to be added in stock: ");
        int addProduct = sc.nextInt();
        productA.addProduct(addProduct);
        System.out.println("Updated data: " + productA);

        //-
        System.out.print("Enter the number of products to be removed from stock: ");
        int removeProduct = sc.nextInt();
        productA.removeProduct(removeProduct);
        System.out.println("Updated data: " + productA);

    }
}
