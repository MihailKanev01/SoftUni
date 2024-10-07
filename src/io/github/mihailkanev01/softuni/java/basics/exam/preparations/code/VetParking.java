package io.github.mihailkanev01.softuni.java.basics.exam.preparations.code;

import java.util.Scanner;

public class VetParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double totalSum = 0;

        for (int day = 1; day <= days; day++) {
            double daySum = 0;

            for (int hour = 1; hour <= hours; hour++) {
                if(day % 2 == 0 && hour % 2 != 0) {
                    daySum += 2.50;
                } else if (day % 2 != 0 && hour % 2 ==0) {
                    daySum += 1.25;
                } else daySum += 1;
            }

            System.out.printf("Day: %d - %.2f leva%n", day, daySum);

            totalSum += daySum;
        }

        System.out.printf("Total: %.2f leva%n", totalSum);
    }
}
