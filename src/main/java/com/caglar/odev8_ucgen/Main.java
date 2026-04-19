package com.caglar.odev8_ucgen;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a kenarını giriniz: ");
        double a = scanner.nextDouble();
        System.out.print("b kenarını giriniz: ");
        double b = scanner.nextDouble();
        System.out.print("c kenarını giriniz: ");
        double c = scanner.nextDouble();

        double u = (a + b + c) / 2;
        double alanKare = u * (u - a) * (u - b) * (u - c);
        double alan = Math.sqrt(alanKare);

        System.out.println("Çevre: " + (2 * u));
        System.out.println("Üçgenin alanı: " + alan);

        scanner.close();
    }
}
