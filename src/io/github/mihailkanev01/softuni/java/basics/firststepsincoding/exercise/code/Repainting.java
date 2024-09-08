package io.github.mihailkanev01.softuni.java.basics.firststepsincoding.exercise.code;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double nylonCost = (nylon + 2) * 1.50;
        double paintCost = (paint + paint * 0.10) * 14.50;
        double thinnerCost = thinner * 5.00;
        double bagCost = 0.40;

        double totalMaterialsCost = nylonCost + paintCost + thinnerCost + bagCost;

        double laborCost = (totalMaterialsCost * 0.30) * hours;

        double finalCost = totalMaterialsCost + laborCost;
        System.out.printf("%.2f", finalCost);
    }
}
