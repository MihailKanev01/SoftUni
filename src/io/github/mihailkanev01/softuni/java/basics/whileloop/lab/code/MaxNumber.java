package io.github.mihailkanev01.softuni.java.basics.whileloop.lab.code;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        while (true) {
                String input = scanner.nextLine();

                if (input.equals("Stop")) {
                    break;
                }

                int n = Integer.parseInt(input);
                if (n > max) {
                    max = n;
                }
            }

        System.out.println(max);
    }
}
