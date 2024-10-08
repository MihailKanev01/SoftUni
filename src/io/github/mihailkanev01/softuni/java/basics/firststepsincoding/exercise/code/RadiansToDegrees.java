package io.github.mihailkanev01.softuni.java.basics.firststepsincoding.exercise.code;

import java.util.Scanner;

public class RadiansToDegrees {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double radians = Double.parseDouble(scanner.nextLine());
            double degrees = radians * 180 / Math.PI;
            System.out.println(degrees);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input for radians. Please enter a valid number (integer or double).");
        }
    }
}