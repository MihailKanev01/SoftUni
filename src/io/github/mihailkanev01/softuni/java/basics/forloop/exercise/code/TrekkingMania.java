package io.github.mihailkanev01.softuni.java.basics.forloop.exercise.code;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int group = Integer.parseInt(scanner.nextLine());

        int musala = 0;
        int montBlanc = 0;
        int kilimanjaro = 0;
        int k2 = 0;
        int everest = 0;
        int totalPeople = 0;

        for (int i = 0; i < group; i++) {
            int people = Integer.parseInt(scanner.nextLine());
            totalPeople += people;

            if (people <= 5) {
                musala += people;
            } else if (people <= 12) {
                montBlanc += people;
            } else if (people <= 25) {
                kilimanjaro += people;
            } else if (people <= 40) {
                k2 += people;
            } else {
                everest += people;
            }
        }

        System.out.printf("%.2f%%%n", musala * 100.0 / totalPeople);
        System.out.printf("%.2f%%%n", montBlanc * 100.0 / totalPeople);
        System.out.printf("%.2f%%%n", kilimanjaro * 100.0 / totalPeople);
        System.out.printf("%.2f%%%n", k2 * 100.0 / totalPeople);
        System.out.printf("%.2f%%%n", everest * 100.0 / totalPeople);
    }
}
