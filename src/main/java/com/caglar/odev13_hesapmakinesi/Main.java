package com.caglar.odev13_hesapmakinesi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1. sayıyı giriniz: ");
        double sayi1 = scanner.nextDouble();

        System.out.print("2. sayıyı giriniz: ");
        double sayi2 = scanner.nextDouble();

        System.out.print("İşlem türünü giriniz (+, -, *, /): ");
        String islem = scanner.next();

        double sonuc = 0;
        boolean gecerli = true;

        switch (islem) {
            case "+":
                sonuc = sayi1 + sayi2;
                break;
            case "-":
                sonuc = sayi1 - sayi2;
                break;
            case "*":
                sonuc = sayi1 * sayi2;
                break;
            case "/":
                if (sayi2 == 0) {
                    System.out.println("Bir sayı sıfıra bölünemez!");
                    gecerli = false;
                } else {
                    sonuc = sayi1 / sayi2;
                }
                break;
            default:
                System.out.println("Geçersiz işlem!");
                gecerli = false;
        }

        if (gecerli) {
            System.out.println("Sonuç: " + sonuc);
        }

        scanner.close();
    }
}
