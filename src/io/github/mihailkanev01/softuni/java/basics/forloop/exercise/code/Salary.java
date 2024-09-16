package io.github.mihailkanev01.softuni.java.basics.forloop.exercise.code;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tabOpen = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < tabOpen; i++) {
            String tab = scanner.nextLine();
            if (tab.equals("Facebook")) {
                salary -= 150;
            } else if (tab.equals("Instagram")) {
                salary -= 100;
            } else if (tab.equals("Reddit")) {
                salary -= 50;
            }
            if (salary <= 0) {
                System.out.println("You have lost your salary.");
                return;
            }
        }

        System.out.println(salary);
    }
}
