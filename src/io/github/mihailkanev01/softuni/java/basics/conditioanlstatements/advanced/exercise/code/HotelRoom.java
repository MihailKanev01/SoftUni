package io.github.mihailkanev01.softuni.java.basics.conditioanlstatements.advanced.exercise.code;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        int nightsCount = Integer.parseInt(scanner.nextLine());

        double studio = 0;
        double apartment = 0;

        switch (season) {
            case "May":
            case "October":
                if (nightsCount > 14) {
                    studio = nightsCount * 50 * 0.7;
                    apartment = nightsCount * 65 * 0.9;
                } else if (nightsCount > 7 ) {
                    studio = nightsCount * 50 * 0.95;
                    apartment = nightsCount * 65;
                } else {
                    studio = nightsCount * 50;
                    apartment = nightsCount * 65;
                }
                break;
            case "June":
            case "September":
                if (nightsCount > 14) {
                    studio = nightsCount * 75.2 * 0.8;
                    apartment = nightsCount * 68.7 * 0.9;
                } else {
                    studio = nightsCount * 75.2;
                    apartment = nightsCount * 68.7;
                }
                break;
            case "July":
            case "August":
                if (nightsCount > 14 ){
                    studio = nightsCount * 76;
                    apartment = nightsCount * 77 * 0.9;
                } else {
                    studio = nightsCount * 76;
                    apartment = nightsCount * 77;
                }
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
        System.out.printf("Apartment: %.2f lv.\nStudio: %.2f lv.", apartment, studio);
    }
}
