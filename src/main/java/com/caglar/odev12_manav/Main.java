package com.caglar.odev12_manav;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double ARMUT_KG = 2.14;
        final double ELMA_KG = 3.67;
        final double DOMATES_KG = 1.11;
        final double MUZ_KG = 0.95;
        final double PATLICAN_KG = 5.00;

        System.out.print("Armut Kaç Kilo? : ");
        double armut = scanner.nextDouble();

        System.out.print("Elma Kaç Kilo? : ");
        double elma = scanner.nextDouble();

        System.out.print("Domates Kaç Kilo? : ");
        double domates = scanner.nextDouble();

        System.out.print("Muz Kaç Kilo? : ");
        double muz = scanner.nextDouble();

        System.out.print("Patlıcan Kaç Kilo? : ");
        double patlican = scanner.nextDouble();

        double toplam = (armut * ARMUT_KG)
                + (elma * ELMA_KG)
                + (domates * DOMATES_KG)
                + (muz * MUZ_KG)
                + (patlican * PATLICAN_KG);

        System.out.println("Toplam Tutar: " + toplam + " TL");

        scanner.close();
    }
}
