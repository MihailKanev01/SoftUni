package io.github.mihailkanev01.softuni.java.basics.exam.preparations.code;

import java.util.Scanner;

public class TouristShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());

        String input;
        int productCount = 0;
        double totalSpent = 0;
        boolean outOfMoney = false;

        while (!(input = scanner.nextLine()).equals("Stop")) {
            String productName = input;
            double productPrice = Double.parseDouble(scanner.nextLine());
            productCount++;

            if (productCount % 3 == 0) {
                productPrice /= 2;
            }

            if (budget >= productPrice) {
                budget -= productPrice;
                totalSpent += productPrice;
            } else {
                outOfMoney = true;
                System.out.printf("You don't have enough money!%nYou need %.2f leva!%n", productPrice - budget);
                break;
            }
        }

        if (!outOfMoney) {
            System.out.printf("You bought %d products for %.2f leva.%n", productCount, totalSpent);
        }
    }
}
