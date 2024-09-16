package io.github.mihailkanev01.softuni.java.basics.forloop.exercise.code;

public class NumbersEndingIn7 {
    public static void main(String[] args) {
        for (int i = 7; i<=997; i++) {
            if (i % 10 == 7) {
                System.out.println(i);
            }
        }
    }
}

