package io.github.mihailkanev01.softuni.java.basics.firststepsincoding.exercise.code;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percentage = Double.parseDouble(scanner.nextLine());

        int volumeCm3 = length * width * height;

        double volumeLiters = volumeCm3 / 1000.0;

        double litersNeeded = volumeLiters * (1 - percentage / 100);

        System.out.printf("%.4f", litersNeeded);
    }
}
