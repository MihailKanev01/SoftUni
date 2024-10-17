package io.github.mihailkanev01.softuni.java.basics.nestedloops.exercise.code;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalTickets = 0;
        int studentTickets = 0;
        int standardTickets = 0;
        int kidTickets = 0;

        String movieName = scanner.nextLine();

        while (!movieName.equals("Finish")) {
            int freeSeats = Integer.parseInt(scanner.nextLine());
            int soldTicketsForMovie = 0;

            String ticketType = scanner.nextLine();

            while (!ticketType.equals("End")) {
                soldTicketsForMovie++;

                switch (ticketType) {
                    case "student":
                        studentTickets++;
                        break;
                    case "standard":
                        standardTickets++;
                        break;
                    case "kid":
                        kidTickets++;
                        break;
                }

                if (soldTicketsForMovie == freeSeats) {
                    break;
                }

                ticketType = scanner.nextLine();
            }

            double percentFull = soldTicketsForMovie * 100.0 / freeSeats;
            System.out.printf("%s - %.2f%% full.%n", movieName, percentFull);

            totalTickets += soldTicketsForMovie;

            movieName = scanner.nextLine();
        }

        double percentStudentTickets = studentTickets * 100.0 / totalTickets;
        double percentStandardTickets = standardTickets * 100.0 / totalTickets;
        double percentKidTickets = kidTickets * 100.0 / totalTickets;

        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", percentStudentTickets);
        System.out.printf("%.2f%% standard tickets.%n", percentStandardTickets);
        System.out.printf("%.2f%% kids tickets.%n", percentKidTickets);
    }
}

