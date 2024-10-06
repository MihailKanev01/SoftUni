package io.github.mihailkanev01.softuni.java.basics.exam.preparations.code;

import java.util.Scanner;

public class FamilyTrip{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double nightPrice = Double.parseDouble(scanner.nextLine());
        double percentage = Double.parseDouble(scanner.nextLine());

        if (nights > 7) {
            nightPrice = nightPrice * 0.95;
        }

        double totalCostForNights = nights * nightPrice;

        double additionalExpenses = budget * (percentage / 100);

        double totalVacationCost = totalCostForNights + additionalExpenses;

        if (budget >= totalVacationCost) {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", budget - totalVacationCost);
        } else System.out.printf("%.2f leva needed.", totalVacationCost - budget);
    }
}
