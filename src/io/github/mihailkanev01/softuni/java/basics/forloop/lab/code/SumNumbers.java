package io.github.mihailkanev01.softuni.java.basics.forloop.lab.code;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 0; i < n; i++){
            int number = scanner.nextInt();
            sum += number;
        }

        System.out.println(sum);
    }
}
