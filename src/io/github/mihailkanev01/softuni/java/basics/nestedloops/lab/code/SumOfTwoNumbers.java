package io.github.mihailkanev01.softuni.java.basics.nestedloops.lab.code;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumber  = Integer.parseInt(scanner.nextLine());

        int combinationCount = 0;
        boolean found = false;

        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                combinationCount++;
                if (i + j == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)%n", combinationCount, i, j, magicNumber);
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.printf("%d combinations - neither equals %d%n", combinationCount, magicNumber);
        }
    }
}
