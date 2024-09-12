package io.github.mihailkanev01.softuni.java.basics.conditioanlstatements.exercise.code;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int numberOfStuntActors = Integer.parseInt(scanner.nextLine());
        double clothesCostPerActor = Double.parseDouble(scanner.nextLine());

        double decorCost = budget * 0.1;
        double totalClothesCost = numberOfStuntActors * clothesCostPerActor;
        if (numberOfStuntActors > 150) {
            totalClothesCost -= totalClothesCost * 0.1;
        }
        double totalCost = decorCost + totalClothesCost;

        if (totalCost > budget) {
            System.out.printf("Not enough money!%nWingard needs %.2f leva more.%n", totalCost - budget);
        } else System.out.printf("Action!%nWingard starts filming with %.2f leva left.%n", budget - totalCost);
    }
}
