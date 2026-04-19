package com.caglar.odev17_sayisiralama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1. sayıyı giriniz: ");
        int a = scanner.nextInt();

        System.out.print("2. sayıyı giriniz: ");
        int b = scanner.nextInt();

        System.out.print("3. sayıyı giriniz: ");
        int c = scanner.nextInt();

        int kucuk, orta, buyuk;

        if (a <= b && a <= c) {
            kucuk = a;
            if (b <= c) { orta = b; buyuk = c; }
            else { orta = c; buyuk = b; }
        } else if (b <= a && b <= c) {
            kucuk = b;
            if (a <= c) { orta = a; buyuk = c; }
            else { orta = c; buyuk = a; }
        } else {
            kucuk = c;
            if (a <= b) { orta = a; buyuk = b; }
            else { orta = b; buyuk = a; }
        }

        System.out.println("Küçükten büyüğe: " + kucuk + ", " + orta + ", " + buyuk);

        scanner.close();
    }
}
