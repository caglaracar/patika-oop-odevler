package com.caglar.odev1_universite;

public class Main {
    public static void main(String[] args) {
        Universite uni = new Universite("Kodluyoruz Üniversitesi");

        Ofis ofis1 = new Ofis("A101", 1);
        Ofis ofis2 = new Ofis("B202", 2);
        uni.ofisEkle(ofis1);
        uni.ofisEkle(ofis2);

        Siniflik s1 = new Siniflik("Derslik-1", 40);
        uni.siniflikEkle(s1);

        Departman bilgisayar = new Departman("Bilgisayar Mühendisliği");
        bilgisayar.ofisEkle(ofis1);
        uni.departmanEkle(bilgisayar);

        Profesor p1 = new Profesor("Ahmet", "Yılmaz", ofis1, "Bilgisayar Mühendisliği");
        Memur m1 = new Memur("Ayşe", "Demir", ofis2, "Öğrenci İşleri");
        uni.calisanEkle(p1);
        uni.calisanEkle(m1);

        System.out.println("=== " + uni.getAd() + " ===");
        for (Calisan c : uni.getCalisanlar()) {
            c.gorevYap();
            System.out.println("  Ofis: " + c.getOfis());
        }
    }
}
