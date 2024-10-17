package io.github.mihailkanev01.softuni.java.basics.nestedloops.exercise.code;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int currentNumber = 1;

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(currentNumber + " ");
                currentNumber++;
                if (currentNumber > n) {
                    break;
                }
            }
            System.out.println();
            if (currentNumber > n) {
                break;
            }
        }
    }
}
