package io.github.mihailkanev01.softuni.java.basics.conditioanlstatements.advanced.lab.code;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());

        double commission = -1;

        switch (city) {
            case "Sofia":
                if (sales >= 0 && sales <= 500) {
                    commission = 0.05;
                } else if (sales > 500 && sales <= 1000) {
                    commission = 0.07;
                } else if (sales > 1000 && sales <= 10000) {
                    commission = 0.08;
                } else if (sales > 10000) {
                    commission = 0.12;
                }
                break;

            case "Varna":
                if (sales >= 0 && sales <= 500) {
                    commission = 0.045;
                } else if (sales > 500 && sales <= 1000) {
                    commission = 0.075;
                } else if (sales > 1000 && sales <= 10000) {
                    commission = 0.10;
                } else if (sales > 10000) {
                    commission = 0.13;
                }
                break;

            case "Plovdiv":
                if (sales >= 0 && sales <= 500) {
                    commission = 0.055;
                } else if (sales > 500 && sales <= 1000) {
                    commission = 0.08;
                } else if (sales > 1000 && sales <= 10000) {
                    commission = 0.12;
                } else if (sales > 10000) {
                    commission = 0.145;
                }
                break;

            default:
                System.out.println("error");
                return;
        }

        if (commission != -1 && sales >= 0) {
            double totalCommission = sales * commission;
            System.out.printf("%.2f%n", totalCommission);
        } else System.out.println("error");
    }
}
