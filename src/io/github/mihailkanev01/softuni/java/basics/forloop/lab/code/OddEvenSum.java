package io.github.mihailkanev01.softuni.java.basics.forloop.lab.code;

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                leftSum += scanner.nextInt();
            } else {
                rightSum += scanner.nextInt();
            }
        }

        if (leftSum == rightSum) {
            System.out.println("Yes \nSum = " + leftSum);
        } else System.out.println("No \nDiff = " + Math.abs(leftSum - rightSum));

    }
}
