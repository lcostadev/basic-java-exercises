package features;

import features.entities.Product;
import features.entities.Name;

import java.util.Scanner;

public class Feature05 {
    public static void run(Scanner sc) {
        sc.nextLine();
        Product productA;
        productA = new Product();

        System.out.println("Cliente Register");
        System.out.print("Name: ");
        productA.name = Name.nextName(sc);
        System.out.print("Price: $");
        productA.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        productA.quantity = sc.nextInt();

        System.out.println("Product data: " + productA);
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        productA.addProduct(quantity);
        System.out.print("Enter the number of products to be removed from stock: ");
        int lQuantity = sc.nextInt();
        productA.removeProduct(lQuantity);
        System.out.println("Updated data: " + productA);
    }
}
