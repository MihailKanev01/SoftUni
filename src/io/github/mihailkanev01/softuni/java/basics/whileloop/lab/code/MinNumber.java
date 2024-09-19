package io.github.mihailkanev01.softuni.java.basics.whileloop.lab.code;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        while (true) {
            String input = scanner.nextLine();

            if (input.equals("Stop")) {
                break;
            }

            int n = Integer.parseInt(input);
            if (n < min) {
                min = n;
            }
        }

        System.out.println(min);
    }
}
