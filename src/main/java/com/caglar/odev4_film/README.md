# Ödev 4 - Online Film Sistemi

## Problem
- Filmler listelenebilir ve sıralanabilir.
- Kullanıcılar sisteme abone olabilir.
- Aboneler kredi satın alır; kredi ile film kiralayabilir.
- Kiralanan filmin bedeli hesaptan düşer.
- Normal kullanıcılar ve aboneler film **satın alabilir**.
- Film mevcut değilse talep edilebilir.

## Sınıflar
- `Film` — ad, tür, yıl, kiralama kredisi, satış kredisi, mevcut bilgisi.
- `Kullanici` — temel kullanıcı: film satın alır, mevcut olmayan film için talep açar.
- `Abone` extends `Kullanici` — kredi alır, film kiralar.
- `FilmSistemi` — filmleri listeler, yıla göre sıralar, talepleri tutar.

## OOP Kavramları
- **Inheritance**: `Abone` → `Kullanici` (abone her şeye ek olarak kiralayabilir).
- **Encapsulation**: kredi alanı `private`; sadece `krediSatinAl()` ve `filmKirala()` üzerinden değişir.
- **Polymorphism potansiyeli**: aynı `Kullanici` tipi üzerinden farklı davranışlar.

## Çalıştırma
`Main.java` → filmler eklenir, bir normal kullanıcı satın alır, abone kredi alıp kiralar, mevcut olmayan film talep edilir.
