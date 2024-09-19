package io.github.mihailkanev01.softuni.java.basics.whileloop.lab.code;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String studentName = scanner.nextLine();
        int grade = 1;
        double totalGrades = 0;

        while (grade <= 12) {
            double currentGrade = Double.parseDouble(scanner.nextLine());

            if (currentGrade < 4)
                {
                    System.out.printf("%s has been excluded at %d grade", studentName, grade);
                    break;
                } else {
                totalGrades += currentGrade;
                grade++;
            }
        }

        if (grade > 12) {
            double averageGrade = totalGrades / 12;
            System.out.printf("%s graduated. Average grade: %.2f", studentName, averageGrade);
        }
    }
}

