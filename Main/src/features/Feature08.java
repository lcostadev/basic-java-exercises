package features;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Feature08 {

    public static void run(Scanner input) {
        List<String> item = new ArrayList<>();

        while (true) {
            System.out.println("---- Menu RPG ----");
            System.out.println("1: adicionar item");
            System.out.println("2: remover item (por nome)");
            System.out.println("3: listar itens");
            System.out.println("4: buscar item (mostrar posição, ou avisar que não existe)");
            System.out.println("5: mostrar total de itens");
            System.out.println("6: Organizar por ordem alfabetica");
            System.out.println("7: buscar item por letra");
            System.out.println("0: sair");
            System.out.println("--------------------");

            System.out.print("Escolha: ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Digite o nome do item: ");
                    String addItemNome = input.nextLine().trim().toUpperCase(Locale.US);

                    if (addItemNome.isEmpty()) {
                        System.out.println("Nome invalido!\n");
                    } else if (item.contains(addItemNome)) {
                        System.out.println("Item ja existe\n");
                    } else if (item.size() >= 10) {
                        System.out.println("inventario cheio!\n");
                    } else item.add(addItemNome);


                    break;
                case 2:
                    System.out.println("Digite o nome do item: ");
                    String removeItemNome = input.nextLine().trim().toUpperCase(Locale.US);

                    if (!item.remove(removeItemNome)) {
                        System.out.println("Item nao existe\n");
                    }

                    break;
                case 3:
                    if (item.isEmpty()) {
                        System.out.println("Inventario vazio\n");
                    } else {
                        System.out.println("Lista de itens:");

                        for (int i = 0; i < item.size(); i++) {
                            System.out.println((i + 1) + "-" + item.get(i));
                        }
                    }
                    break;
                case 4:
                    System.out.println("Digite o nome do item que quer buscar: ");
                    String buscarItemNome = input.nextLine().trim().toUpperCase(Locale.US);
                    if (item.contains(buscarItemNome)) {
                        int posItem = item.indexOf(buscarItemNome) + 1;
                        System.out.println("Este item esta na posicao: " + posItem + " do inventario");
                    } else System.out.println("Item nao existe\n");

                    break;
                case 5:
                    System.out.println("O total de itens no inventario: " + item.size());

                    break;
                case 6:
                    item.sort(null);
                    System.out.println("Organizado\n");
                    break;
                case 7:
                    System.out.println("Digite a letra");
                    String letra = input.nextLine().trim().toUpperCase(Locale.US);
                    if (letra.isEmpty()) {
                        System.out.println("Invalido!\n");
                        break;
                    }

                    boolean achou = false;
                    for (String itemLetra : item) {
                        if (itemLetra.startsWith(letra)) {
                            System.out.println(itemLetra);
                            achou = true;
                        }
                    }

                    if (!achou) {
                        System.out.println("Nenhum item encontrado!\n");
                    }

                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalido\n");
            }
        }
    }
}


