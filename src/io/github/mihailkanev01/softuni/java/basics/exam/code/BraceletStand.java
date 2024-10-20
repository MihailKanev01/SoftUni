package io.github.mihailkanev01.softuni.java.basics.exam.code;

import java.util.Scanner;

public class BraceletStand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pocketMoneyPerDay = scanner.nextDouble();
        double earningsPerDay = scanner.nextDouble();
        double expenses = scanner.nextDouble();
        double giftPrice = scanner.nextDouble();

        int days = 5;
        double totalPocketMoney = pocketMoneyPerDay * days;
        double totalEarnings = earningsPerDay * days;
        double totalSavings = totalPocketMoney + totalEarnings - expenses;

        if (totalSavings >= giftPrice) {
            System.out.printf("Profit: %.2f BGN, the gift has been purchased.%n", totalSavings);
        } else System.out.printf("Insufficient money: %.2f BGN.%n", giftPrice - totalSavings);
    }
}
