package com.caglar.odev16_sicaklikaktivite;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sıcaklığı giriniz: ");
        double sicaklik = scanner.nextDouble();

        // Yöntem 1: Klasik if-else if zinciri
        System.out.println("--- Yöntem 1: if-else if ---");
        if (sicaklik < 5) {
            System.out.println("Kayak yapmanızı öneririz.");
        } else if (sicaklik < 15) {
            System.out.println("Sinema etkinliğini öneririz.");
        } else if (sicaklik < 25) {
            System.out.println("Piknik etkinliğini öneririz.");
        } else {
            System.out.println("Yüzme etkinliğini öneririz.");
        }

        // Yöntem 2: Ternary (iç içe) operator
        System.out.println("--- Yöntem 2: Ternary ---");
        String oneri = (sicaklik < 5) ? "Kayak"
                : (sicaklik < 15) ? "Sinema"
                : (sicaklik < 25) ? "Piknik"
                : "Yüzme";
        System.out.println("Öneri: " + oneri);

        // Yöntem 3: Aralık aralık ayrı if'ler (mantıksal AND ile)
        System.out.println("--- Yöntem 3: Ayrı if'ler (&&) ---");
        if (sicaklik < 5) System.out.println("Kayak");
        if (sicaklik >= 5 && sicaklik < 15) System.out.println("Sinema");
        if (sicaklik >= 15 && sicaklik < 25) System.out.println("Piknik");
        if (sicaklik >= 25) System.out.println("Yüzme");

        // Yöntem 4: Switch-case (aralık tabanlı)
        System.out.println("--- Yöntem 4: switch ---");
        int aralik;
        if (sicaklik < 5) aralik = 1;
        else if (sicaklik < 15) aralik = 2;
        else if (sicaklik < 25) aralik = 3;
        else aralik = 4;

        switch (aralik) {
            case 1: System.out.println("Kayak"); break;
            case 2: System.out.println("Sinema"); break;
            case 3: System.out.println("Piknik"); break;
            case 4: System.out.println("Yüzme"); break;
        }

        scanner.close();
    }
}
