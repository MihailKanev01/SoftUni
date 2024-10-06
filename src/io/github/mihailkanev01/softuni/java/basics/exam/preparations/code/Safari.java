package io.github.mihailkanev01.softuni.java.basics.exam.preparations.code;

import java.util.Scanner;

public class Safari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        double fuel = Double.parseDouble(scanner.nextLine());
        String day = scanner.nextLine();

        double fuelPrice = 2.1;
        int guide = 100;

        double totalFuel = fuel * fuelPrice;
        double totalSum = totalFuel + guide;

        if (day.equals("Saturday")) {
            totalSum *= 0.9;
        } else if (day.equals("Sunday")) {
            totalSum *= 0.8;
        }

        if (budget >= totalSum) {
            System.out.printf("Safari time! Money left: %.2f lv.", budget - totalSum);
        } else System.out.printf("Not enough money! Money needed: %.2f lv.", totalSum - budget);
    }
}
