package io.github.mihailkanev01.softuni.java.basics.conditioanlstatements.advanced.exercise.code;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishers = Integer.parseInt(scanner.nextLine());

        double rent = 0;

        switch (season) {
            case "Spring":
                rent = 3000;
                break;
            case "Summer":
            case "Autumn":
                rent = 4200;
                break;
            case "Winter":
                rent = 2600;
                break;
        }

        if (fishers <= 6) {
            rent *= 0.9;
        } else if (fishers <= 11) {
            rent *= 0.85;
        } else {
            rent *= 0.75;
        }

        if (fishers % 2 == 0 && !season.equals("Autumn")) {
            rent *= 0.95;
        }

        if (budget >= rent) {
            double moneyLeft = budget - rent;
            System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
        } else {
            double moneyNeeded = rent - budget;
            System.out.printf("Not enough money! You need %.2f leva.", moneyNeeded);
        }
    }
}