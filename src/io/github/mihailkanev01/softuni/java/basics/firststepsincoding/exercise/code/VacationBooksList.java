package io.github.mihailkanev01.softuni.java.basics.firststepsincoding.exercise.code;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pageCount = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int daysNeeded = Integer.parseInt(scanner.nextLine());
        int hoursNeeded = pageCount/pagesPerHour;
        int hoursPerDay = hoursNeeded/daysNeeded;
        System.out.printf("%d",hoursPerDay);
    }
}
