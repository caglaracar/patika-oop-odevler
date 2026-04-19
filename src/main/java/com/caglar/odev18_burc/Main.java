package com.caglar.odev18_burc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Doğum ayınızı giriniz (1-12): ");
        int ay = scanner.nextInt();
        System.out.print("Doğum gününüzü giriniz: ");
        int gun = scanner.nextInt();

        // Yöntem 1: switch-case
        String burc = burcBulSwitch(ay, gun);
        System.out.println("[switch-case] Burcunuz: " + burc);

        // Yöntem 2: switch-case KULLANMADAN (if-else if)
        String burc2 = burcBulIf(ay, gun);
        System.out.println("[if-else]    Burcunuz: " + burc2);

        scanner.close();
    }

    static String burcBulSwitch(int ay, int gun) {
        switch (ay) {
            case 1:  return gun <= 21 ? "Oğlak" : "Kova";
            case 2:  return gun <= 19 ? "Kova" : "Balık";
            case 3:  return gun <= 20 ? "Balık" : "Koç";
            case 4:  return gun <= 20 ? "Koç" : "Boğa";
            case 5:  return gun <= 21 ? "Boğa" : "İkizler";
            case 6:  return gun <= 22 ? "İkizler" : "Yengeç";
            case 7:  return gun <= 22 ? "Yengeç" : "Aslan";
            case 8:  return gun <= 22 ? "Aslan" : "Başak";
            case 9:  return gun <= 22 ? "Başak" : "Terazi";
            case 10: return gun <= 22 ? "Terazi" : "Akrep";
            case 11: return gun <= 21 ? "Akrep" : "Yay";
            case 12: return gun <= 21 ? "Yay" : "Oğlak";
            default: return "Geçersiz tarih";
        }
    }

    static String burcBulIf(int ay, int gun) {
        if ((ay == 3 && gun >= 21) || (ay == 4 && gun <= 20)) return "Koç";
        if ((ay == 4 && gun >= 21) || (ay == 5 && gun <= 21)) return "Boğa";
        if ((ay == 5 && gun >= 22) || (ay == 6 && gun <= 22)) return "İkizler";
        if ((ay == 6 && gun >= 23) || (ay == 7 && gun <= 22)) return "Yengeç";
        if ((ay == 7 && gun >= 23) || (ay == 8 && gun <= 22)) return "Aslan";
        if ((ay == 8 && gun >= 23) || (ay == 9 && gun <= 22)) return "Başak";
        if ((ay == 9 && gun >= 23) || (ay == 10 && gun <= 22)) return "Terazi";
        if ((ay == 10 && gun >= 23) || (ay == 11 && gun <= 21)) return "Akrep";
        if ((ay == 11 && gun >= 22) || (ay == 12 && gun <= 21)) return "Yay";
        if ((ay == 12 && gun >= 22) || (ay == 1 && gun <= 21)) return "Oğlak";
        if ((ay == 1 && gun >= 22) || (ay == 2 && gun <= 19)) return "Kova";
        if ((ay == 2 && gun >= 20) || (ay == 3 && gun <= 20)) return "Balık";
        return "Geçersiz tarih";
    }
}
