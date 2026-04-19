package com.caglar.odev15_dersortalamasi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dersler = {"Matematik", "Fizik", "Türkçe", "Kimya", "Müzik"};
        double toplam = 0;
        int gecerliDers = 0;

        for (String ders : dersler) {
            System.out.print(ders + " notunu giriniz: ");
            double not = scanner.nextDouble();

            if (not >= 0 && not <= 100) {
                toplam += not;
                gecerliDers++;
            } else {
                System.out.println("  " + ders + " notu geçersiz, ortalamaya katılmadı.");
            }
        }

        if (gecerliDers == 0) {
            System.out.println("Geçerli ders notu girilmedi!");
        } else {
            double ortalama = toplam / gecerliDers;
            System.out.println("Ortalama: " + ortalama);

            if (ortalama >= 55) {
                System.out.println("Sınıfı Geçti");
            } else {
                System.out.println("Sınıfta Kaldı");
            }
        }

        scanner.close();
    }
}
