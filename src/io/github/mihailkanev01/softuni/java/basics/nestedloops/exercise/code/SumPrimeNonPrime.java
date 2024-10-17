package io.github.mihailkanev01.softuni.java.basics.nestedloops.exercise.code;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumPrime = 0;
        int sumNonPrime = 0;

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("stop")) {
                break;
            }

            int number = Integer.parseInt(input);

            if (number < 0) {
                System.out.println("Number is negative.");
                continue;
            }

            if (isPrime(number)) {
                sumPrime += number;
            } else {
                sumNonPrime += number;
            }
        }

        System.out.println("Sum of all prime numbers is: " + sumPrime);
        System.out.println("Sum of all non prime numbers is: " + sumNonPrime);
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

