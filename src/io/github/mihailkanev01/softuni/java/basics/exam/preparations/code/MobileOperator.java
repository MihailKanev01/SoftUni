package io.github.mihailkanev01.softuni.java.basics.exam.preparations.code;

import java.util.Scanner;

public class MobileOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String contract = scanner.nextLine();
        String contractType = scanner.nextLine();
        String cellData = scanner.nextLine();
        int months = Integer.parseInt(scanner.nextLine());

        double pricePerMonth = 0;

        if (contract.equals("one")) {
            switch (contractType) {
                case "Small":
                    pricePerMonth = 9.98;
                    break;
                case "Middle":
                    pricePerMonth = 18.99;
                    break;
                case "Large":
                    pricePerMonth = 25.98;
                    break;
                case "ExtraLarge":
                    pricePerMonth = 35.99;
                    break;
                default:
                    break;
            }
        } else if (contract.equals("two")) {
            switch (contractType) {
                case "Small":
                    pricePerMonth = 8.58;
                    break;
                case "Middle":
                    pricePerMonth = 17.09;
                    break;
                case "Large":
                    pricePerMonth = 23.59;
                    break;
                case "ExtraLarge":
                    pricePerMonth = 31.79;
                    break;
                default:
                    break;
            }
        }

        if (cellData.equals("yes")) {
            if (pricePerMonth <= 10) {
                pricePerMonth += 5.5;
            } else if (pricePerMonth <= 30) {
                pricePerMonth += 4.35;
            } else pricePerMonth += 3.85;
        }

        if (contract.equals("two")) {
            System.out.printf("%.2f lv.", pricePerMonth * 0.9625 * months);
        } else System.out.printf("%.2f lv.", pricePerMonth * months);
    }
}
