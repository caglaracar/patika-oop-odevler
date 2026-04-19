package com.caglar.odev14_sifresifirlama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dogruSifre = "1234";

        System.out.print("Şifrenizi giriniz: ");
        String girilenSifre = scanner.next();

        if (girilenSifre.equals(dogruSifre)) {
            System.out.println("Giriş başarılı!");
        } else {
            System.out.println("Şifre yanlış!");
            System.out.print("Şifrenizi sıfırlamak ister misiniz? (E/H): ");
            String cevap = scanner.next();

            if (cevap.equalsIgnoreCase("E")) {
                System.out.print("Yeni şifrenizi giriniz: ");
                String yeniSifre = scanner.next();

                if (yeniSifre.equals(girilenSifre)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu");
                }
            } else {
                System.out.println("İşlem iptal edildi.");
            }
        }

        scanner.close();
    }
}
