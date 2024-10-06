package io.github.mihailkanev01.softuni.java.basics.exam.preparations.code;

import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double strawberry = Double.parseDouble(scanner.nextLine());
        double bananaInKg = Double.parseDouble(scanner.nextLine());
        double orangeInKg = Double.parseDouble(scanner.nextLine());
        double raspberryInKg = Double.parseDouble(scanner.nextLine());
        double strawberryInKg = Double.parseDouble(scanner.nextLine());

        double priceRaspberry = strawberry * 0.5;
        double priceOrange = priceRaspberry * 0.6;
        double priceBanana = priceRaspberry * 0.2;

        double totalStrawberry = strawberryInKg * strawberry;
        double totalBananas = bananaInKg * priceBanana;
        double totalOranges = orangeInKg * priceOrange;
        double totalRaspberry = raspberryInKg * priceRaspberry;

        double totalSum = totalBananas + totalOranges + totalRaspberry + totalStrawberry;

        System.out.printf("%.2f", totalSum);
    }
}
