package com.caglar.odev21_artikyil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yıl Giriniz: ");
        int yil = scanner.nextInt();

        boolean artikYil;

        if (yil % 400 == 0) {
            artikYil = true;
        } else if (yil % 100 == 0) {
            artikYil = false;
        } else if (yil % 4 == 0) {
            artikYil = true;
        } else {
            artikYil = false;
        }

        if (artikYil) {
            System.out.println(yil + " bir artık yıldır !");
        } else {
            System.out.println(yil + " bir artık yıl değildir !");
        }

        scanner.close();
    }
}
