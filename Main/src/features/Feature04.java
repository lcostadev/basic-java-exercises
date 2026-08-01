package features;

import features.entities.Triangle;

import java.util.Scanner;

// triangle area calculator
public class Feature04 {
    public static void run(Scanner sc) {
        System.out.println("Calculo da area de triangulos");
        System.out.println("Digite as 3 medidas do triangulo A abaixo.");
        Triangle a, b;
        a = new Triangle();
        b = new Triangle();
        a.x = sc.nextDouble();
        a.y = sc.nextDouble();
        a.z = sc.nextDouble();
        System.out.println("Agora digite as 3 medidas do triangulo B abaixo.");
        b.x = sc.nextDouble();
        b.y = sc.nextDouble();
        b.z = sc.nextDouble();
        double areaA = a.area();
        double areaB = b.area();
        System.out.printf("A area do triangulo A: %.4f\n", areaA);
        System.out.printf("A area do triangulo B: %.4f\n", areaB);
        if (areaA > areaB) System.out.println("A area do triangulo A é maior que a do triangulo B.");
        else if (areaA < areaB) System.out.println("A area do triangulo B é maior que a do triangulo A.");
        else if (areaA == areaB) System.out.println("A area do triangulo B é igual a do triangulo A");
        else System.out.println("invalido!");
    }
}