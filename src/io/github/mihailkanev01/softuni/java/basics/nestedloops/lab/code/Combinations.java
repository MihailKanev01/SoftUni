package io.github.mihailkanev01.softuni.java.basics.nestedloops.lab.code;

import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int validCombinationsCount = 0;

        for (int x1 = 0; x1 <= n; x1++) {
            for (int x2 = 0; x2 <= n; x2++) {
                int x3 = n - x1 - x2;
                if (x3 >= 0) {
                    validCombinationsCount++;
                }
            }
        }
        System.out.println(validCombinationsCount);
    }
}

