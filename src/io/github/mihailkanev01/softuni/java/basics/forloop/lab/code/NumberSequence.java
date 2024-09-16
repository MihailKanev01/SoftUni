package io.github.mihailkanev01.softuni.java.basics.forloop.lab.code;

import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num < max) {
                max = num;
            }
            if (num > min) {
                min = num;
            }
        }
        System.out.println("Max number: " + min);
        System.out.println("Min number: " + max);
    }
}
