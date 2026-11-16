package dz.univ.calculatrice;

import java.util.Scanner;

public final class Main {
    private Main() {
    }

    public static void main(final String[] args) {
        final Scanner in = new Scanner(System.in);
        final Operation add = new AddOperation();
        final Operation subtract = new SubtractOperation();
        boolean running = true;
        while (running) {
            printMenu();
            final int choice = readChoice(in);
            if (choice == 0) {
                running = false;
            } else if (choice == 1) {
                calculate(in, add);
            } else if (choice == 2) {
                calculate(in, subtract);
            } else {
                System.out.println("Choix invalide.");
            }
        }
        in.close();
    }

    private static void printMenu() {
        System.out.println("=== CALCULATRICE ===");
        System.out.println("1. Addition");
        System.out.println("2. Soustraction");
        System.out.println("0. Quitter");
    }

    private static int readChoice(final Scanner in) {
        System.out.print("Votre choix : ");
        final String line = in.nextLine().trim();
        try {
            return Integer.parseInt(line);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private static double readNumber(final Scanner in, final String prompt) {
        while (true) {
            System.out.print(prompt);
            final String line = in.nextLine().trim().replace(',', '.');
            try {
                return Double.parseDouble(line);
            } catch (NumberFormatException e) {
                System.out.println("Nombre invalide, reessayez.");
            }
        }
    }

    private static void calculate(final Scanner in, final Operation operation) {
        final double first = readNumber(in, "Premier nombre : ");
        final double second = readNumber(in, "Deuxieme nombre : ");
        System.out.println("Resultat : " + operation.execute(first, second));
    }
}