package com.caglar.odev9_taksimetre;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double KM_FIYATI = 2.20;
        final double ACILIS_UCRETI = 10;
        final double MINIMUM_UCRET = 20;

        System.out.print("Gidilecek mesafe (km): ");
        double mesafe = scanner.nextDouble();

        double tutar = ACILIS_UCRETI + (mesafe * KM_FIYATI);

        if (tutar < MINIMUM_UCRET) {
            tutar = MINIMUM_UCRET;
        }

        System.out.println("Ödenecek tutar: " + tutar + " TL");

        scanner.close();
    }
}
