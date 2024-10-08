package io.github.mihailkanev01.softuni.java.basics.whileloop.lab.code;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        while (sum < n) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            sum += currentNum;
        }

        System.out.println(sum);
    }
}
