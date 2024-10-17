package io.github.mihailkanev01.softuni.java.basics.nestedloops.exercise.code;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juryCount = Integer.parseInt(scanner.nextLine());
        String presentationName = scanner.nextLine();

        double totalSum = 0;
        int presentationCount = 0;

        while (!presentationName.equals("Finish")) {
            double presentationSum = 0;

            for (int i = 0; i < juryCount; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                presentationSum += grade;
            }

            double averageGrade = presentationSum / juryCount;
            System.out.printf("%s - %.2f.%n", presentationName, averageGrade);

            totalSum += presentationSum;
            presentationCount++;

            presentationName = scanner.nextLine();
        }

        double finalAssessment = totalSum / (presentationCount * juryCount);
        System.out.printf("Student's final assessment is %.2f.", finalAssessment);
    }
}

