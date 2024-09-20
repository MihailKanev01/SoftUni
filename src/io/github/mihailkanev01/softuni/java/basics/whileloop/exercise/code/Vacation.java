package io.github.mihailkanev01.softuni.java.basics.whileloop.exercise.code;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double moneyNeeded = Double.parseDouble(scanner.nextLine());
        double cashAvailable = Double.parseDouble(scanner.nextLine());

        int consecutiveSpendDays = 0;
        int days = 0;

        while (cashAvailable < moneyNeeded && consecutiveSpendDays < 5) {
            String input = scanner.nextLine();
            double amount = Double.parseDouble(scanner.nextLine());
            days++;
            if (input.equals("spend")) {
                cashAvailable -= amount;
                if (cashAvailable < 0) {
                    cashAvailable = 0;
                }
                consecutiveSpendDays++;
            } else if (input.equals("save")) {
                cashAvailable += amount;
                consecutiveSpendDays = 0;
            }
        }
        if (consecutiveSpendDays == 5) {
            System.out.printf("You can't save the money.%n%d", days);
        } else System.out.printf("You saved the money for %d days.", days);
    }
}
