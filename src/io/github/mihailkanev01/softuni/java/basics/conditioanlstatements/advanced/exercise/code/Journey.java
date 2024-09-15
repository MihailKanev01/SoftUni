package io.github.mihailkanev01.softuni.java.basics.conditioanlstatements.advanced.exercise.code;

import java.util.Locale;
import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine().toLowerCase();

        double price = 0;

        String destination = "";
        String accommodation = "";
        double spentAmount = 0;

        if (budget <= 100) {
            if (season.equals("summer")) {
                destination = "Bulgaria";
                spentAmount = budget * 0.30;
                accommodation = "Camp";
            } else if (season.equals("winter")) {
                destination = "Bulgaria";
                spentAmount = budget * 0.7;
                accommodation = "Hotel";
            }
        } else if (budget <= 1000) {
            if (season.equals("summer")) {
                destination = "Balkans";
                spentAmount = budget * 0.4;
                accommodation = "Camp";
            } else if (season.equals("winter")) {
                destination = "Balkans";
                spentAmount = budget * 0.8;
                accommodation = "Hotel";
            }
        } else {
            destination = "Europe";
            spentAmount = budget * 0.9;
            accommodation = "Hotel";
        }
        System.out.printf("Somewhere in %s\n%s - %.2f", destination, accommodation, spentAmount );
    }
}
