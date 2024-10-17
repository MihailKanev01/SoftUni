package io.github.mihailkanev01.softuni.java.basics.nestedloops.lab.code;

import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int floors = Integer.parseInt(scanner.nextLine());
        int rooms = Integer.parseInt(scanner.nextLine());

        for (int floor = floors; floor >= 1; floor--) {
            StringBuilder floorRooms = new StringBuilder();
            for (int room = 0; room < rooms; room++) {
                if (floor == floors) {
                    floorRooms.append("L").append(floor).append(room).append(" ");
                } else if (floor % 2 == 0) {
                    floorRooms.append("O").append(floor).append(room).append(" ");
                } else floorRooms.append("A").append(floor).append(room).append(" ");
            }
            System.out.println(floorRooms.toString().trim());
        }
    }
}
