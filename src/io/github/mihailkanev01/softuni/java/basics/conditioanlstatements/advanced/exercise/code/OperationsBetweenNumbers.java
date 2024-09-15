package io.github.mihailkanev01.softuni.java.basics.conditioanlstatements.advanced.exercise.code;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N1 = Integer.parseInt(scanner.nextLine());
        int N2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        switch (operator) {
            case "+":
                int sum = N1 + N2;
                String evenOrOddSum = (sum % 2 == 0) ? "even" : "odd";
                System.out.printf("%d %s %d = %d - %s", N1, operator, N2, sum, evenOrOddSum);
                break;
            case "-":
                int difference  = N1 - N2;
                String evenOrOddDifference = (difference  % 2 == 0) ? "even" : "odd";
                System.out.printf("%d %s %d = %d - %s", N1, operator, N2, difference , evenOrOddDifference);
                break;
            case "*":
                int multiple  = N1 * N2;
                String evenOrOddMultiple= (multiple  % 2 == 0) ? "even" : "odd";
                System.out.printf("%d %s %d = %d - %s", N1, operator, N2, multiple , evenOrOddMultiple);
                break;
            case "/":
                if (N2 == 0) {
                    System.out.printf("Cannot divide %d by zero", N1);
                } else {
                    double divide = (double) N1 / N2;
                    System.out.printf("%d %s %d = %.2f", N1, operator, N2, divide);
                }
                break;
            case "%":
                if (N2 == 0) {
                    System.out.printf("Cannot divide %d by zero", N1);
                } else {
                    int remainder = N1 % N2;
                    System.out.printf("%d %s %d = %d", N1, operator, N2, remainder);
                }
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
    }
}
