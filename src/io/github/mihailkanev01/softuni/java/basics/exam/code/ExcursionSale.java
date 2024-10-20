package io.github.mihailkanev01.softuni.java.basics.exam.code;

import java.util.Scanner;

public class ExcursionSale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int seaExcursions = Integer.parseInt(scanner.nextLine());
        int mountainExcursions = Integer.parseInt(scanner.nextLine());

        int seaPrice = 680;
        int mountainPrice = 499;
        int totalProfit = 0;

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("Stop")) {
                break;
            }

            if (input.equals("sea") && seaExcursions > 0) {
                totalProfit += seaPrice;
                seaExcursions--;
            } else if (input.equals("mountain") && mountainExcursions > 0) {
                totalProfit += mountainPrice;
                mountainExcursions--;
            }

            if (seaExcursions == 0 && mountainExcursions == 0) {
                System.out.println("Good job! Everything is sold.");
                break;
            }
        }

        System.out.printf("Profit: %d leva.%n", totalProfit);
    }
}
