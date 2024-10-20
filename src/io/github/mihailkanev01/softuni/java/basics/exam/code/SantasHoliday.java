package io.github.mihailkanev01.softuni.java.basics.exam.code;

import java.util.Scanner;

public class SantasHoliday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String rating = scanner.nextLine();

        int nights = days - 1;
        double pricePerNight = 0;
        double totalPrice = 0;

        switch (roomType) {
            case "room for one person":
                pricePerNight = 18;
                totalPrice = nights * pricePerNight;
                break;
            case "apartment":
                pricePerNight = 25;
                totalPrice = nights * pricePerNight;
                if (nights < 10) {
                    totalPrice *= 0.7;
                } else if (nights >= 10 && nights <= 15) {
                    totalPrice *= 0.65;
                } else if (nights > 15) {
                    totalPrice *= 0.5;
                }
                break;
            case "president apartment":
                pricePerNight = 35;
                totalPrice = nights * pricePerNight;
                if (nights < 10) {
                    totalPrice *= 0.9;
                } else if (nights >= 10 && nights <= 15) {
                    totalPrice *= 0.85;
                } else if (nights > 15) {
                    totalPrice *= 0.8;
                }
                break;
            default:
                break;
        }
        if (rating.equals("positive")) {
            totalPrice *= 1.25;
        } else if (rating.equals("negative")) {
            totalPrice *= 0.90;
        }

        System.out.printf("%.2f%n", totalPrice);
    }
}
