package io.github.mihailkanev01.softuni.java.basics.conditioanlstatements.exercise.code;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int episodeLength = Integer.parseInt(scanner.nextLine());
        int breakLength = Integer.parseInt(scanner.nextLine());

        double lunchTime = breakLength * 0.125;
        double restTime = breakLength * 0.25;

        double timeLeft = breakLength - lunchTime - restTime;

        if (timeLeft >= episodeLength) {
            double freeTime = timeLeft - episodeLength;
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", name, Math.ceil(freeTime));
        } else {
            double neededTime = episodeLength - timeLeft;
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", name, Math.ceil(neededTime));
        }
    }
}

