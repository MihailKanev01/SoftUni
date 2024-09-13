package io.github.mihailkanev01.softuni.java.basics.conditioanlstatements.advanced.lab.code;

import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();


            switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
            case "Saturday":
                if (num >= 10 && num <= 18) {
                    System.out.println("open");
                } else System.out.println("closed");
                break;
                case "Sunday":
                    System.out.println("closed");
                    break;
            default:
                System.out.println("Invalid day input");
                break;
        }
    }
}
