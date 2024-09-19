package io.github.mihailkanev01.softuni.java.basics.whileloop.lab.code;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalMoney = 0;

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("NoMoreMoney")) {
                break;
            }

            double amount = Double.parseDouble(input);

            if (amount < 0) {
                System.out.println("Invalid operation!");
                break;
            }

            totalMoney += amount;

            System.out.printf("Increase: %.2f%n", amount);
        }

        System.out.printf("Total: %.2f%n", totalMoney);
    }
}
