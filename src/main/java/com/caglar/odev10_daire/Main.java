package com.caglar.odev10_daire;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double PI = 3.14;

        System.out.print("Yarıçapı giriniz (r): ");
        double r = scanner.nextDouble();

        double alan = PI * r * r;
        double cevre = 2 * PI * r;

        System.out.println("Dairenin Alanı: " + alan);
        System.out.println("Dairenin Çevresi: " + cevre);

        System.out.print("Daire diliminin merkez açısını giriniz (α): ");
        double alfa = scanner.nextDouble();

        double dilimAlani = (PI * r * r * alfa) / 360;
        System.out.println("Daire Diliminin Alanı: " + dilimAlani);

        scanner.close();
    }
}
