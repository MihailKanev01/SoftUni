package io.github.mihailkanev01.softuni.java.basics.exam.code;

import java.util.Scanner;

public class PCStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double cpuPriceUSD = Double.parseDouble(scanner.nextLine());
        double gpuPriceUSD = Double.parseDouble(scanner.nextLine());
        double ramPriceUSD = Double.parseDouble(scanner.nextLine());
        int ramCount = Integer.parseInt(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine());

        double exchangeRate = 1.57;
        double cpuPriceBGN = cpuPriceUSD * exchangeRate;
        double gpuPriceBGN = gpuPriceUSD * exchangeRate;
        double ramPriceBGN = ramPriceUSD * exchangeRate * ramCount;

        cpuPriceBGN = cpuPriceBGN - (cpuPriceBGN * discount);
        gpuPriceBGN = gpuPriceBGN - (gpuPriceBGN * discount);

        double totalPriceBGN = cpuPriceBGN + gpuPriceBGN + ramPriceBGN;

        System.out.printf("Money needed - %.2f leva.%n", totalPriceBGN);
    }
}
