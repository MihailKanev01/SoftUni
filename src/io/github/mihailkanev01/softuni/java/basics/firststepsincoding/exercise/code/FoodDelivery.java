package io.github.mihailkanev01.softuni.java.basics.firststepsincoding.exercise.code;

import java.util.Scanner;

public class FoodDelivery {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            double chickenMenuPrice = 10.35;
            double fishMenuPrice = 12.40;
            double vegetarianMenuPrice = 8.15;
            double deliveryCost = 2.50;

            int chickenMenus = Integer.parseInt(scanner.nextLine());
            int fishMenus = Integer.parseInt(scanner.nextLine());
            int vegetarianMenus = Integer.parseInt(scanner.nextLine());

            double totalChickenCost = chickenMenus * chickenMenuPrice;
            double totalFishCost = fishMenus * fishMenuPrice;
            double totalVegetarianCost = vegetarianMenus * vegetarianMenuPrice;

            double totalMenuCost = totalChickenCost + totalFishCost + totalVegetarianCost;

            double dessertCost = totalMenuCost * 0.20;

            double totalOrderCost = totalMenuCost + dessertCost + deliveryCost;
            System.out.printf("Total order cost: %.2f", totalOrderCost);
        }
    }
