package io.github.mihailkanev01.softuni.java.basics.whileloop.exercise.code;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int freeSpace = width * length * height;
        int totalBoxes = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Done")) {
                int spaceLeft = freeSpace - totalBoxes;
                System.out.printf("%d Cubic meters left.", spaceLeft);
                break;
            }
            int boxes = Integer.parseInt(input);
            totalBoxes += boxes;

            if (totalBoxes > freeSpace) {
                int neededSpace = totalBoxes - freeSpace;
                System.out.printf("No more free space! You need %d Cubic meters more.", neededSpace);
                break;
            }

        }
    }
}
