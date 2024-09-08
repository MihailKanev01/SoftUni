package io.github.mihailkanev01.softuni.java.basics.firststepsincoding.exercise.code;

import java.util.Scanner;

public class SuppliesforSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());
        double sum = (pens * 5.8 + markers * 7.2 + thinner * 1.2);
        double finalSum = sum - (sum * (double) discount / 100);
        System.out.println(finalSum);
    }
}
