package io.github.mihailkanev01.softuni.java.basics.forloop.exercise.code;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tournamentCount = Integer.parseInt(scanner.nextLine());
        int initialPoints = Integer.parseInt(scanner.nextLine());

        int totalPoints = initialPoints;
        int pointsFromTournaments = 0;
        int wins = 0;

        for (int i = 0; i < tournamentCount; i++) {
            String result = scanner.nextLine();
            switch (result) {
                case "W":
                    totalPoints += 2000;
                    pointsFromTournaments += 2000;
                    wins++; // Count the win
                    break;
                case "F":
                    totalPoints += 1200;
                    pointsFromTournaments += 1200;
                    break;
                case "SF":
                    totalPoints += 720;
                    pointsFromTournaments += 720;
                    break;
            }
        }

        int averagePoints = pointsFromTournaments / tournamentCount;

        double winPercentage = (wins * 100.0) / tournamentCount;

        System.out.printf("Final points: %d%n", totalPoints);
        System.out.printf("Average points: %d%n", averagePoints);
        System.out.printf("%.2f%%%n", winPercentage);
    }
}
