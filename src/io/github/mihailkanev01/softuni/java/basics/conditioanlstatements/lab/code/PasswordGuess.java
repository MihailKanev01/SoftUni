package io.github.mihailkanev01.softuni.java.basics.conditioanlstatements.lab.code;

import java.util.Scanner;

public class PasswordGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String correctPassword = "s3cr3t!P@ssw0rd";

        String inputPassword = scanner.nextLine();

        if (inputPassword.equals(correctPassword)) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }

        scanner.close();
    }
}