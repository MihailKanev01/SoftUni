package io.github.mihailkanev01.softuni.java.basics.conditioanlstatements.advanced.lab.code;

import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        if (num >= 100 && num <= 200) {
            System.out.println("");
        } else if (num == 0) {
            System.out.println("");
        } else System.out.println("invalid");
    }
}
