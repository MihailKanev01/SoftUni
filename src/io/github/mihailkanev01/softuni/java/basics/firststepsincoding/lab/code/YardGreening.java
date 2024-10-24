package io.github.mihailkanev01.softuni.java.basics.firststepsincoding.lab.code;

import java.util.Scanner;
import java.text.DecimalFormat;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double squareMeters = scanner.nextDouble();
        double pricePerSqMeter = 7.61;

        double totalPrice = squareMeters * pricePerSqMeter;

        double discount = totalPrice * 0.18;

        double finalPrice = totalPrice - discount;

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("The final price is: " + df.format(finalPrice) + " lv.");
        System.out.println("The discount is: " + df.format(discount) + " lv.");
    }
}

