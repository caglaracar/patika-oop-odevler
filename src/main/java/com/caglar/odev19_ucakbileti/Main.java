package com.caglar.odev19_ucakbileti;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz: ");
        double mesafe = scanner.nextDouble();

        System.out.print("Yaşınızı giriniz: ");
        int yas = scanner.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş): ");
        int tip = scanner.nextInt();

        // Doğrulama
        if (mesafe <= 0 || yas <= 0 || (tip != 1 && tip != 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
            scanner.close();
            return;
        }

        double normalTutar = mesafe * 0.10;

        // Yaş indirimi
        double yasIndirimOrani = 0;
        if (yas < 12) {
            yasIndirimOrani = 0.50;
        } else if (yas <= 24) {
            yasIndirimOrani = 0.10;
        } else if (yas > 65) {
            yasIndirimOrani = 0.30;
        }

        double yasIndirimi = normalTutar * yasIndirimOrani;
        double indirimliTutar = normalTutar - yasIndirimi;

        double toplam;
        if (tip == 2) {
            double gidisDonusIndirimi = indirimliTutar * 0.20;
            toplam = (indirimliTutar - gidisDonusIndirimi) * 2;
        } else {
            toplam = indirimliTutar;
        }

        System.out.println("Toplam Tutar = " + toplam + " TL");

        scanner.close();
    }
}
