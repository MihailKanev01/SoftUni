package io.github.mihailkanev01.softuni.java.basics.whileloop.exercise.code;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int failedThreshHold = Integer.parseInt(scanner.nextLine());

        int failedTimes = 0;
        int solvedProblemsCount = 0;
        double gradeSum = 0;
        String lasProblem = "";
        boolean isFailed = true;

        while (failedTimes < failedThreshHold) {
            String problemName = scanner.nextLine();
            if (problemName.equals("Enough")) {
                isFailed = false;
                break;
            }
            int grade = Integer.parseInt(scanner.nextLine());
            if (grade <= 4) {
                failedTimes++;
            }
            gradeSum += grade;
            solvedProblemsCount++;
            lasProblem = problemName;
        }

        if (isFailed) {
            System.out.printf("You need a break, %d poor grades.", failedThreshHold);
        } else {
            System.out.printf("Average score: %.2f%n", gradeSum / solvedProblemsCount);
            System.out.printf("Number of problems: %d%n", solvedProblemsCount);
            System.out.printf("Last problem: %s", lasProblem);
        }
    }
}
