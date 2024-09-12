package io.github.mihailkanev01.softuni.java.basics.conditioanlstatements.exercise.code;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCardsCount = Integer.parseInt(scanner.nextLine());
        int processorsCount = Integer.parseInt(scanner.nextLine());
        int ramCount = Integer.parseInt(scanner.nextLine());

        double videoCardPrice = 250.0;

        double totalVideoCardsPrice = videoCardsCount * videoCardPrice;
        double processorPrice = totalVideoCardsPrice * 0.35;
        double totalProcessorsPrice = processorsCount * processorPrice;
        double ramPrice = totalVideoCardsPrice * 0.10;
        double totalRamPrice = ramCount * ramPrice;

        double totalCost = totalVideoCardsPrice + totalProcessorsPrice + totalRamPrice;

        if (videoCardsCount > processorsCount) {
            totalCost *= 0.85;
        }

        if (budget >= totalCost) {
            System.out.printf("You have %.2f leva left!%n", budget - totalCost);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!%n", totalCost - budget);
        }

        scanner.close();
    }
}

