package io.github.mihailkanev01.softuni.java.basics.conditioanlstatements.exercise.code;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double worldRecord = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timePerMeter = Double.parseDouble(scanner.nextLine());

        double ivanTime = distance * timePerMeter;

        double delay = Math.floor(distance / 15) * 12.5;

        double totalTime = ivanTime + delay;

        if (totalTime < worldRecord) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        } else {
            double difference = totalTime - worldRecord;
            System.out.printf("No, he failed! He was %.2f seconds slower.", difference);
        }
    }
}

