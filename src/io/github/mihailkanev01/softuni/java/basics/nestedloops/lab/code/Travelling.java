package io.github.mihailkanev01.softuni.java.basics.nestedloops.lab.code;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String destination = scanner.nextLine();
            if (destination.equals("End")) {
                break;
            }

            double requiredBudget = Double.parseDouble(scanner.nextLine());
            double savedMoney = 0;

            while (savedMoney < requiredBudget) {
                double amount = Double.parseDouble(scanner.nextLine());
                savedMoney += amount;
            }

            System.out.printf("Going to %s!%n", destination);
        }
    }
}
