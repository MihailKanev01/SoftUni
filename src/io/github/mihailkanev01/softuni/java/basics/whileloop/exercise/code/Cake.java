package io.github.mihailkanev01.softuni.java.basics.whileloop.exercise.code;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());

        int totalPieces = length * width;

        while (totalPieces  > 0) {
            String input = scanner.nextLine();

            if (input.equals("STOP")) {
                System.out.println(totalPieces + " pieces are left.");
                break;
            }

            int piecesTaken = Integer.parseInt(input);

            totalPieces -= piecesTaken;
        }

        if (totalPieces < 0) {
            System.out.println("No more cake left! You need " + Math.abs(totalPieces) + " pieces more.");
        }
    }
}
