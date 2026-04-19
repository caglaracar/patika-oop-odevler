# Ödev 5 - Asansör Simülasyonu

## Problem
12 katlı bir ofis binasında 5 asansör çalışır. Her asansör:
- yaklaşık 6 yolcu kapasitesine sahiptir,
- sadece gerektiğinde hareket eder,
- kendi kapısı, kat gösterge ışığı ve kontrol paneline sahiptir,
- kontrol panelinde hedef düğmeleri, kapı aç/kapa ve acil durum düğmesi bulunur.

Her katta yukarı/aşağı çağrı düğmeleri, varış zili ve asansör kapıları vardır.
Simülatör rastgele yolcu üretir, bir "saat" ile zamanı ilerletir.

## Sınıflar
- `Bina` — 12 kat + 5 asansör; programlayıcı (en yakın müsait asansörü atar).
- `Asansor` — mevcut kat, yön, kapı, kontrol paneli, içerdeki yolcular.
- `Kapi` — aç/kapa.
- `KontrolPaneli` — hedef düğmeleri + acil durum.
- `Kat` — kat no, bekleyen yolcular, çağrı düğmeleri, varış zili.
- `Yolcu` — id, kalkış katı, varış katı.
- `Yon` (enum) — `YUKARI`, `ASAGI`, `BEKLIYOR`.
- `Saat` — tik bazlı zaman sayacı.

## OOP Kavramları
- **Encapsulation**: tüm alanlar `private`, erişim metotları ile dışa açılır.
- **Abstraction**: `Asansor` karmaşık iç mantığı (kat durma, yolcu indirme/bindirme) dışarıya basit metotlarla sunar.
- **Composition**: `Bina` → `Asansor` → `Kapi` + `KontrolPaneli`; `Bina` → `Kat` → `Yolcu`.
- **Polymorphism/Enum**: yön durumları enum ile temsil edilir.

## Çalıştırma
`Main.java` → `Random(42)` ile deterministik olarak yolcular üretilir, 20 tiklik simülasyon çalışır; her adım loglanır.
