package com.caglar.odev6_notortalamasi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik notu: ");
        double matematik = scanner.nextDouble();
        System.out.print("Fizik notu: ");
        double fizik = scanner.nextDouble();
        System.out.print("Kimya notu: ");
        double kimya = scanner.nextDouble();
        System.out.print("Türkçe notu: ");
        double turkce = scanner.nextDouble();
        System.out.print("Tarih notu: ");
        double tarih = scanner.nextDouble();
        System.out.print("Müzik notu: ");
        double muzik = scanner.nextDouble();

        double ortalama = (matematik + fizik + kimya + turkce + tarih + muzik) / 6;
        System.out.println("Ortalama: " + ortalama);

        // Ternary operator ile sınıf geçme kontrolü
        String sonuc = ortalama > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(sonuc);

        scanner.close();
    }
}
