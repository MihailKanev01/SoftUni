package io.github.mihailkanev01.softuni.java.basics.conditioanlstatements.lab.code;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();
        double formula = 0;

        if (figure.equals("square")) {
            double side = Double.parseDouble(scanner.nextLine());
            formula = Math.pow(side, 2);
        } else if (figure.equals("rectangle")) {
            double length = Double.parseDouble(scanner.nextLine());
            double width = Double.parseDouble(scanner.nextLine());
            formula = length * width;
        } else if (figure.equals("circle")) {
            double radius = Double.parseDouble(scanner.nextLine());
            formula = Math.PI * Math.pow(radius, 2);
        } else if (figure.equals("triangle")) {
            double height = Double.parseDouble(scanner.nextLine());
            double base = Double.parseDouble(scanner.nextLine());
            formula = (base * height)/2;
        }
        System.out.printf("%.3f", formula);
    }
}
