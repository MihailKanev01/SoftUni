package io.github.mihailkanev01.softuni.java.basics.conditioanlstatements.advanced.exercise.code;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flowerType = scanner.nextLine();
        int flowerCount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double priceRoses = 5;
        double priceDahlias = 3;
        double priceTulips = 2;
        double priceNarcissus = 3;
        double priceGladiolus = 2.5;
        double totalPrice = 0;

        switch (flowerType) {
            case "Roses":
                totalPrice = flowerCount * priceRoses;
                if (flowerCount > 80) {
                    totalPrice -= totalPrice * 0.1;
                }
                break;
            case "Dahlias":
                totalPrice = flowerCount * priceDahlias;
                if (flowerCount > 90) {
                    totalPrice -= totalPrice * 0.15;
                }
                break;
            case "Tulips":
                totalPrice = flowerCount * priceTulips;
                if (flowerCount > 80) {
                    totalPrice -= totalPrice * 0.15;
                }
                break;
            case "Narcissus":
                totalPrice = flowerCount * priceNarcissus;
                if (flowerCount < 120) {
                    totalPrice += totalPrice * 0.15;
                }
                break;
            case "Gladiolus":
                totalPrice = flowerCount * priceGladiolus;
                if (flowerCount < 80) {
                    totalPrice += totalPrice * 0.2;
                }
                break;
        }

        if (budget >= totalPrice) {
            double moneyLeft = budget - totalPrice;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.%n", flowerCount, flowerType, moneyLeft);
        } else {
            double moneyNeeded = totalPrice - budget;
            System.out.printf("Not enough money, you need %.2f leva more.%n", moneyNeeded);
        }

    }
}
