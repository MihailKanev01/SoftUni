package io.github.mihailkanev01.softuni.java.basics.conditioanlstatements.exercise.code;

import java.util.Scanner;

public class ToyStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pricePuzzle = 2.60;
        double priceTalkingDoll = 3.00;
        double priceTeddyBear = 4.10;
        double priceMinion = 8.20;
        double priceTruck = 2.00;

        double excursionPrice = scanner.nextDouble();
        int numPuzzles = scanner.nextInt();
        int numTalkingDolls = scanner.nextInt();
        int numTeddyBears = scanner.nextInt();
        int numMinions = scanner.nextInt();
        int numTrucks = scanner.nextInt();

        int totalToys = numPuzzles + numTalkingDolls + numTeddyBears + numMinions + numTrucks;

        double totalIncome = (numPuzzles * pricePuzzle) +
                (numTalkingDolls * priceTalkingDoll) +
                (numTeddyBears * priceTeddyBear) +
                (numMinions * priceMinion) +
                (numTrucks * priceTruck);

        if (totalToys >= 50) {
            totalIncome *= 0.75;
        }

        totalIncome *= 0.90;

        double difference = totalIncome - excursionPrice;

        if (difference >= 0) {
            System.out.printf("Yes! %.2f lv left.%n", difference);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.%n", Math.abs(difference));
        }
    }
}

