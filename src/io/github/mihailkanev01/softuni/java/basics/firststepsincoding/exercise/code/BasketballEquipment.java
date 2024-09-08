package io.github.mihailkanev01.softuni.java.basics.firststepsincoding.exercise.code;

import java.util.Scanner;

public class BasketballEquipment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int trainingFee = scanner.nextInt();

        double sneakersPrice = trainingFee * 0.6;
        double outfitPrice = sneakersPrice * 0.8;
        double ballPrice = outfitPrice / 4;
        double accessoriesPrice = ballPrice / 5;

        double totalExpenses = trainingFee + sneakersPrice + outfitPrice + ballPrice + accessoriesPrice;

        System.out.printf("%.2f", totalExpenses);
    }
}
