package io.github.mihailkanev01.softuni.java.basics.firststepsincoding.exercise.code;

import java.util.Scanner;

public class USDToBGN {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double usd = Double.parseDouble(scanner.nextLine());
            double bgn = usd * 1.79549;
            System.out.println(bgn);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input for USD. Please enter a valid number (integer or double).");
        }
    }
}