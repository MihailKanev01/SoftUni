package io.github.mihailkanev01.softuni.java.basics.nestedloops.exercise.code;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1111; i <= 9999; i++) {
            String currentNumber = String.valueOf(i);
            boolean isSpecial = true;

            for (int j = 0; j < currentNumber.length(); j++) {
                int digit = Character.getNumericValue(currentNumber.charAt(j));

                if (digit == 0 || n % digit != 0) {
                    isSpecial = false;
                    break;
                }
            }

            if (isSpecial) {
                System.out.print(i + " ");
            }
        }
    }
}
